package com.ducnv1106.demo;

import android.util.Log;
import android.widget.Toast;

import com.ducnv1106.demo.base.BaseActivity;
import com.ducnv1106.demo.base.BaseAdapter;
import com.ducnv1106.demo.databinding.ActivityBai1Binding;

import java.util.ArrayList;

public class Bai1Activity extends BaseActivity<ActivityBai1Binding> implements BaseAdapter.BaseListener, Bai1Navigation {
    private ArrayList<String> data;
    private BaseAdapter<String> adapter;
    @Override
    protected void innitView() {
        initData();
        adapter=new BaseAdapter<>(R.layout.item_bai1,this);
        binding.listview.setAdapter(adapter);
        adapter.setData(data);
        adapter.setListener(this);
        binding.setNavigation(this);

    }

    public void initData() {
        data=new ArrayList<>();
        data.add("Visual Studio.net");
        data.add("Lập Trình Android");
        data.add("Lập Trình C++");
        data.add("Mã Nguồn Mở");
        data.add("SQL Sever");
    }


    @Override
    protected int layoutId() {
        return R.layout.activity_bai1;
    }

    @Override
    public void onItemClicked(Integer position) {
        binding.setPosition(position);
        String item=data.get(position);
        Toast.makeText(this,item,Toast.LENGTH_LONG).show();
        binding.edtSubject.setText(item);
    }

    @Override
    public boolean onItemLongClicked(Integer position) {
        String item=data.get(position);
        data.remove(item);
        adapter.setData(data);
        return false;
    }

    @Override
    public void onAddClicked() {
        String subject=binding.edtSubject.getText().toString();
        if (subject.isEmpty()){
            Toast.makeText(this,"Do not empty", Toast.LENGTH_LONG).show();
            return;
        }
        data.add(subject);
        adapter.setData(data);
    }

    @Override
    public void onUpdateClicked(Integer position) {
        String subject=binding.edtSubject.getText().toString();
        if (subject.isEmpty()){
            Toast.makeText(this,"Do not empty", Toast.LENGTH_LONG).show();
            return;
        }
        data.set(position,subject);
        adapter.notifyItemChanged(position);
    }
}
