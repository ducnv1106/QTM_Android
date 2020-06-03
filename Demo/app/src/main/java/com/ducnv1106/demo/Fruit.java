package com.ducnv1106.demo;

import androidx.annotation.DrawableRes;

public class Fruit {

    private Integer image;
    private String name;
    private String description;

    public Fruit(@DrawableRes Integer image, String name, String description) {
        this.image = image;
        this.name = name;
        this.description = description;
    }

    public Integer getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
