package com.example.myapplication.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class HeaderFragmentPager extends FragmentPagerAdapter {
    public List<Fragment> fragments = null;
    private String[] titles;
    public HeaderFragmentPager(FragmentManager fragmentManager, List<Fragment> fragments, String[] titles){
        super(fragmentManager);
        this.fragments = fragments;
        this.titles = titles;
    }
    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;
        if (i < fragments.size()){
            fragment = fragments.get(i);
        } else {
            fragment = fragments.get(0);
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
    @Override
    public CharSequence getPageTitle(int position) {
        if (titles != null && titles.length > 0)
            return titles[position];
        return null;
    }
}
