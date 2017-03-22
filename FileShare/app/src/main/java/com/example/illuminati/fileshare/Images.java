package com.example.illuminati.fileshare;

import android.net.Uri;
import android.provider.MediaStore;

/**
 * Created by Illuminati on 3/17/2017.
 */
public class Images {

    private String displayName;
    private String contentType;
    private String fullPath;

    public static final Uri IMAGE_URI_INT =null;
    public static final Uri IMAGE_URI_EXT =null;


    public String getDisplayName()
    {
        return displayName;
    }
    public String getFullPath()
    {
        return fullPath;
    }

    public String getContentType()
    {
        return contentType;
    }

    public void setDisplayName(String displayName)
    {
        this.displayName= displayName;
    }
    public void setContentType(String contentType)
    {
        this.contentType = contentType;
    }

    public void setFullPath(String fullPath)
    {
        this.fullPath = fullPath;
    }
}
