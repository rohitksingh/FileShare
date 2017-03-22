package com.example.Constants.Impl;

import android.net.Uri;
import android.provider.MediaStore;

import com.example.Constants.MediaConst;

/**
 * Created by Illuminati on 3/18/2017.
 */
public class ImageConst implements MediaConst {

    @Override
    public Uri get_INT_URI() {
        return MediaStore.Images.Media.INTERNAL_CONTENT_URI;
    }

    @Override
    public Uri get_EXT_URI() {
        return MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    }

    @Override
    public String[] get_Proj() {
        return new String[]
                {
                        MediaStore.Images.Media.DISPLAY_NAME,
                        MediaStore.Images.Media.DATA
                };
    }
}
