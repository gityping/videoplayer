package com.example.myapplication.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;
import com.example.myapplication.model.Model;

import java.util.List;

import cn.jzvd.JzvdStd;

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
//        myViewHolder.videoView.setVideoPath("https://flv2.bn.netease.com/videolib1/1811/26/OqJAZ893T/HD/OqJAZ893T-mobile.mp4");
//        myViewHolder.videoView.setMediaController(new MediaController(context));
//        myViewHolder.videoView.requestFocus();
//        myViewHolder.videoView.start();
        myViewHolder.jzvdStd.setUp("http://jzvd.nathen.cn/342a5f7ef6124a4a8faf00e738b8bee4/cf6d9db0bd4d41f59d09ea0a81e918fd-5287d2089db37e62345123a1be272f8b.mp4"
                , "饺子快长大");
        Glide.with(context).load("http://jzvd-pic.nathen.cn/jzvd-pic/1bb2ebbe-140d-4e2e-abd2-9e7e564f71ac.png").into(myViewHolder.jzvdStd.thumbImageView);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        TextView textView1;
//        SurfaceView surfaceView;
//        VideoView videoView;
        JzvdStd jzvdStd;
        public MyViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.tv_text);
            textView1 = (TextView) itemView.findViewById(R.id.tv_des);
            jzvdStd = (JzvdStd) itemView.findViewById(R.id.jz_video);
//            surfaceView = (SurfaceView) itemView.findViewById(R.id.controll_surfaceView);
//            videoView = (VideoView) itemView.findViewById(R.id.videoView);
        }
    }
}
