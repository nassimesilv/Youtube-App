package fr.esilv.recyclerviewexample.videos.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import fr.esilv.recyclerviewexample.R;
import fr.esilv.recyclerviewexample.videos.models.Video;
import fr.esilv.recyclerviewexample.videos.viewholders.VideoViewHolder;

public class RecyclerAdapter extends RecyclerView.Adapter<VideoViewHolder> {
	private final List<Video.ItemsBean> videos;

	public RecyclerAdapter(List<Video.ItemsBean> videos) {
		this.videos = videos;
	}

	@Override
	public VideoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

		return new VideoViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_student, parent, false));
	}

	@Override
	public void onBindViewHolder(VideoViewHolder holder, int position) {
		holder.bind(videos.get(position));
	}

	@Override
	public int getItemCount() {
		return videos != null ? videos.size() : 0;
	}
}
