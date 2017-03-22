package com.example.Model.impl;

import android.net.Uri;
import android.provider.MediaStore;

import com.example.Model.Media;

/**
 * Created by Illuminati on 3/18/2017.
 */
public class Image implements Media{


    String name;
    String path;

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
