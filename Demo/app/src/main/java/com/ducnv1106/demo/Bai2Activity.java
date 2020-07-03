package com.ducnv1106.demo;

import com.ducnv1106.demo.base.BaseActivity;
import com.ducnv1106.demo.base.BaseAdapter;
import com.ducnv1106.demo.databinding.ActivityBai2Binding;

import java.util.ArrayList;

public class Bai2Activity extends BaseActivity<ActivityBai2Binding> {
    private ArrayList<Fruit> data;
    private BaseAdapter<Fruit> adapter;
    @Override
    protected void innitView() {
        initData();
        adapter=new BaseAdapter(R.layout.item_bai2,this);
        binding.listview.setAdapter(adapter);
        adapter.setData(data);
    }

    private void initData() {
        data=new ArrayList<>();
        data.add(new Fruit(R.drawable.vietnam,"Vietnam ","Popuaton:98000D"));
        data.add(new Fruit(R.drawable.my," My","Popuaton:3200000USD"));
        data.add(new Fruit(R.drawable.thailan,"Thai Lan","Popuaton:1420000"));

     
    }


    @Override
    protected int layoutId() {
        return R.layout.activity_bai2;
    }
}
