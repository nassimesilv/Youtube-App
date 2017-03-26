package fr.esilv.recyclerviewexample.videos.viewholders;

import android.support.v7.widget.RecyclerView;import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import fr.esilv.recyclerviewexample.R;
import fr.esilv.recyclerviewexample.videos.models.Video;

public class VideoViewHolder extends RecyclerView.ViewHolder {

	private TextView title;
	private TextView description;
	private ImageView image;

	public VideoViewHolder(View itemView) {
		super(itemView);
		title = (TextView) itemView.findViewById(R.id.firstName);
		description = (TextView) itemView.findViewById(R.id.lastName);
		image = (ImageView) itemView.findViewById(R.id.image);
	}

	public void bind(Video.ItemsBean video) {
		title.setText(video.getSnippet().getTitle());
		description.setText(video.getSnippet().getTitle());
		Picasso.with(itemView.getContext()).load(video.getSnippet().getThumbnails().getMedium().getUrl()).into(image);

	}
}
