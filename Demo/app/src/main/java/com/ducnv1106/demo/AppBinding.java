package com.ducnv1106.demo;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.BindingAdapter;

public class AppBinding {

    @BindingAdapter("thumb")
    public static void setThumb(AppCompatImageView img, Integer imgURL) {
        img.setImageResource(imgURL);
    }
}
