package fr.esilv.recyclerviewexample.videos.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import fr.esilv.recyclerviewexample.R;
import fr.esilv.recyclerviewexample.videos.adapters.RecyclerAdapter;
import fr.esilv.recyclerviewexample.videos.models.Video;
import fr.esilv.recyclerviewexample.videos.Constants;

import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import java.util.List;

public class RecyclerActivity extends AppCompatActivity {

	private RecyclerView recyclerView;
	private Button buttonSearch;
	private TextView textSearch;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		buttonSearch = (Button) findViewById(R.id.buttonSearch);
		textSearch = (TextView) findViewById(R.id.textSearch);
		getVideos("");

		buttonSearch.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				getVideos(textSearch.getText().toString());
			}
		});


		initializeRecyclerView();
	}

	private void initializeRecyclerView() {
		recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
		recyclerView.setLayoutManager(new GridLayoutManager(this,2));
	}

	private void setAdapter(List<Video.ItemsBean> videos) {
        RecyclerAdapter adapter = new RecyclerAdapter(videos);
        recyclerView.setAdapter(adapter);
    }

	private void getVideos(String query) {
		String finalQuery = TransformQuery(query);
		StringRequest contractsRequest = new StringRequest(Constants.YOUTUBE_URL + "?part=snippet&q="+ finalQuery +"&maxResults="+ Constants.MAX_ITEMS+ "&key=" + Constants.KEY, new Response.Listener<String>() {
			@Override
			public void onResponse(String response) {

                Video video = new Gson().fromJson(response, Video.class);
                setAdapter(video.getItems());
			}
		}, new Response.ErrorListener() {
			@Override
			public void onErrorResponse(VolleyError error) {
				Log.e("Contracts", "Error");
			}
		});

		Volley.newRequestQueue(this).add(contractsRequest);
	}

	private String TransformQuery(String query){
		return query.replace(' ','|');
	}

}
