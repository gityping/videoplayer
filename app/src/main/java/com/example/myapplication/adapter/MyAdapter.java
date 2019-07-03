package com.example.myapplication.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.myapplication.model.Model;
import com.example.myapplication.R;

import java.util.List;

public class MyAdapter extends BaseQuickAdapter<Model, BaseViewHolder> {
    public MyAdapter(@LayoutRes int layoutResId, @Nullable List<Model> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, Model item) {
        helper.setText(R.id.tv_text, item.getTitle()).setText(R.id.tv_des, item.getDes());
    }
}
