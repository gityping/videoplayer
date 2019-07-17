package com.example.myapplication.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;


public class HotSubFragment extends Fragment {
//    RecyclerView videoList;
//
//    LinearLayoutManager linearLayoutManager;
//
//    RecyclerBaseAdapter recyclerBaseAdapter;
//
//    List<VideoModel> dataList = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hot_sub, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
//        videoList = view.findViewById(R.id.list_item_recycler);
//        resolveData();
//        final RecyclerNormalAdapter recyclerNormalAdapter = new RecyclerNormalAdapter(getActivity(), dataList);
//        linearLayoutManager = new LinearLayoutManager(getActivity());
//        videoList.setLayoutManager(linearLayoutManager);
//        videoList.setAdapter(recyclerNormalAdapter);
//        videoList.addOnScrollListener(new RecyclerView.OnScrollListener() {
//
//            int firstVisibleItem, lastVisibleItem;
//
//            @Override
//            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
//                super.onScrollStateChanged(recyclerView, newState);
//            }
//
//            @Override
//            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
//                super.onScrolled(recyclerView, dx, dy);
//                firstVisibleItem   = linearLayoutManager.findFirstVisibleItemPosition();
//                lastVisibleItem = linearLayoutManager.findLastVisibleItemPosition();
//                //大于0说明有播放
//                if (GSYVideoManager.instance().getPlayPosition() >= 0) {
//                    //当前播放的位置
//                    int position = GSYVideoManager.instance().getPlayPosition();
//                    //对应的播放列表TAG
//                    if (GSYVideoManager.instance().getPlayTag().equals(RecyclerItemNormalHolder.TAG)
//                            && (position < firstVisibleItem || position > lastVisibleItem)) {
//
//                        //如果滑出去了上面和下面就是否，和今日头条一样
//                        //是否全屏
//                        if(!GSYVideoManager.isFullState(getActivity())) {
//                            GSYVideoManager.releaseAllVideos();
//                            recyclerNormalAdapter.notifyDataSetChanged();
//                        }
//                    }
//                }
//            }
//        });
    }

//    @Override
//    public void onPause() {
//        super.onPause();
//        GSYVideoManager.onPause();
//    }
//
//    @Override
//    public void onResume() {
//        super.onResume();
//        GSYVideoManager.onResume(false);
//    }
//
//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        GSYVideoManager.releaseAllVideos();
//    }
//
//
//    private void resolveData() {
//        for (int i = 0; i < 19; i++) {
//            VideoModel videoModel = new VideoModel();
//            dataList.add(videoModel);
//        }
//        if (recyclerBaseAdapter != null)
//            recyclerBaseAdapter.notifyDataSetChanged();
//    }

}
