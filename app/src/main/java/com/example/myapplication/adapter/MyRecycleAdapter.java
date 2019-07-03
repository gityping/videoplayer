package com.example.myapplication.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.myapplication.model.Model;
import com.example.myapplication.R;

import java.util.List;

public class MyRecycleAdapter extends RecyclerView.Adapter<MyRecycleAdapter.MyViewHolder> {
    private Context context;
    private List<Model> data;
    public MyRecycleAdapter (Context context, List<Model> list) {
        this.context = context;
        this.data = list;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View  view = LayoutInflater.from(context).inflate(R.layout.item, viewGroup, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.textView.setText(data.get(i).getTitle());
        myViewHolder.textView1.setText(data.get(i).getDes());
        myViewHolder.videoView.setVideoPath("https://flv2.bn.netease.com/videolib1/1811/26/OqJAZ893T/HD/OqJAZ893T-mobile.mp4");
        myViewHolder.videoView.setMediaController(new MediaController(context));
//        myViewHolder.videoView.requestFocus();
//        myViewHolder.videoView.start();
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        TextView textView1;
//        SurfaceView surfaceView;
        VideoView videoView;
        public MyViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.tv_text);
            textView1 = (TextView) itemView.findViewById(R.id.tv_des);
//            surfaceView = (SurfaceView) itemView.findViewById(R.id.controll_surfaceView);
            videoView = (VideoView) itemView.findViewById(R.id.videoView);
        }
    }
}
