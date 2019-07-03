package com.example.myapplication.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class PageAdapter extends FragmentPagerAdapter {
    private List<Fragment> mfragmentList;
    public PageAdapter(FragmentManager fm, List<Fragment> fragmentList) {
        super(fm);
        this.mfragmentList = fragmentList;
    }

    @Override
    public int getCount() {
        return mfragmentList.size();
    }

    @Override
    public Fragment getItem(int i) {
        return mfragmentList.get(i);
    }

}
