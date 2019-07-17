package com.example.myapplication.fragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.example.myapplication.adapter.HeaderFragmentPager;

import java.util.ArrayList;
import java.util.List;


public class HotFragment extends Fragment {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private List<Fragment> fragments;
    private HeaderFragmentPager adapter;
    private String [] titles;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hot, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        tabLayout = view.findViewById(R.id.tab);
        viewPager = view.findViewById(R.id.viewpager);
        fragments = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            fragments.add(new HotSubFragment());
        }
        titles = new String[]{"最新", "最热", "经典"};
        adapter = new HeaderFragmentPager(getFragmentManager(),fragments,titles);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
