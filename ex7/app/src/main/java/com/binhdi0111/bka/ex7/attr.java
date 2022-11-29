package com.binhdi0111.bka.ex7;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class attr {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("class")
    @Expose
    private String ahihi;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAhihi() {
        return ahihi;
    }

    public void setAhihi(String ahihi) {
        this.ahihi = ahihi;
    }
}
