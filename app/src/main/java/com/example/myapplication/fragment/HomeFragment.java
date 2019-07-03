package com.example.myapplication.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.example.myapplication.adapter.MyRecycleAdapter;
import com.example.myapplication.model.Model;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    public RecyclerView recyclerView;
    public List<Model> list;
    public MyRecycleAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        list = new ArrayList<>();
		for (int i = 0; i < 15; i++) {
			Model model = new Model();
			model.setId(i);
			model.setTitle("Title" + i);
			model.setUrl("Title" + i);
			model.setDes("Des" + i);
			list.add(model);
		}
        recyclerView = view.findViewById(R.id.recycler_view);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
		manager.setOrientation(LinearLayoutManager.VERTICAL);
		recyclerView.setLayoutManager(manager);
		adapter = new MyRecycleAdapter(getActivity(), list);
		recyclerView.setAdapter(adapter);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
