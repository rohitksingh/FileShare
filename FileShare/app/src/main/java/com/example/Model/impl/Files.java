package com.example.Model.impl;

import com.example.Model.Media;

/**
 * Created by Illuminati on 3/18/2017.
 */
public class Files implements Media {

    private String name;
    private String path;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public void setName(String name) {

        this.name = name;
    }
}
