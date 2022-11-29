package com.binhdi0111.bka.ex7;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class meta {
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("subtitle")
    @Expose
    private subtitle subtitle;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public subtitle getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(subtitle subtitle) {
        this.subtitle = subtitle;
    }
}
