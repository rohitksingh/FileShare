package com.example.Constants.Impl;

import android.net.Uri;
import android.provider.MediaStore;

import com.example.Constants.MediaConst;

/**
 * Created by Illuminati on 3/18/2017.
 */
public class FileConst implements MediaConst{

    @Override
    public Uri get_INT_URI() {
        return MediaStore.Files.getContentUri("internal");
    }

    @Override
    public Uri get_EXT_URI() {
        return MediaStore.Files.getContentUri("external");
    }

    @Override
    public String[] get_Proj() {
        return new String[]
                {

                        MediaStore.Files.FileColumns.MIME_TYPE,
                        MediaStore.Files.FileColumns.DATA


                };
    }
}
