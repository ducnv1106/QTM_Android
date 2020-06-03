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
        data.add(new Fruit(R.drawable.quaduahau,"Dưa hấu","Dưa hấu ăn mát"));
        data.add(new Fruit(R.drawable.quatao,"Trái ","Trái táo ăn rất thơm"));
        data.add(new Fruit(R.drawable.quaduahau,"Dưa hấu","Dưa hấu ăn mát"));
        data.add(new Fruit(R.drawable.quaduahau,"Dưa hấu","Dưa hấu ăn mát"));
        data.add(new Fruit(R.drawable.quatao,"Trái ","Trái táo ăn rất thơm"));
        data.add(new Fruit(R.drawable.quaduahau,"Dưa hấu","Dưa hấu ăn mát"));
        data.add(new Fruit(R.drawable.quaduahau,"Dưa hấu","Dưa hấu ăn mát"));
        data.add(new Fruit(R.drawable.quatao,"Trái ","Trái táo ăn rất thơm"));
        data.add(new Fruit(R.drawable.quaduahau,"Dưa hấu","Dưa hấu ăn mát"));
    }


    @Override
    protected int layoutId() {
        return R.layout.activity_bai2;
    }
}
