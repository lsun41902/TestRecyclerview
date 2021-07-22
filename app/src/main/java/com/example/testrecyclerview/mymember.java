package com.example.testrecyclerview;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class mymember {
    String tilt;
    int iv;

    public mymember(String tilt, int iv) {
        this.tilt = tilt;
        this.iv = iv;
    }

    public mymember() {
    }

    public String getTilt() {
        return tilt;
    }

    public void setTilt(String tilt) {
        this.tilt = tilt;
    }

    public int getIv() {
        return iv;
    }

    public void setIv(int iv) {
        this.iv = iv;
    }
}
