package com.ducnv1106.demo.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class BaseActivity<BD extends ViewDataBinding> extends AppCompatActivity {

    protected BD binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        binding= DataBindingUtil.setContentView(this,layoutId());
        super.onCreate(savedInstanceState);
        innitView();
    }

    protected abstract void innitView();

    protected abstract int layoutId();
}
