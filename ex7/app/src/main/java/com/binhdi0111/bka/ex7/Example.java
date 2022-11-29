package com.binhdi0111.bka.ex7;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

import java.util.List;

public class Example  {
    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("cipher")
    @Expose
    private boolean cipher;


    @SerializedName("meta")
    @Expose
    private meta meta;

    @SerializedName("thumb")
    @Expose
    private String thumb;

    @SerializedName("itags")
    @Expose
    private List<Integer> itags = null;

    @SerializedName("video_quality")
    @Expose
    private List<Integer> video_quality= null;

    @SerializedName("url")
    @Expose
    private List<Url> url=null;

    @SerializedName("mp3Converter")
    @Expose
    private String mp3Converter;

    @SerializedName("hosting")
    @Expose
    private String hosting;

    @SerializedName("sd")
    @Expose
    private Object sd;

    @SerializedName("hd")
    @Expose
    private Object hd;


    @SerializedName("timestamp")
    @Expose
    private int timestamp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isCipher() {
        return cipher;
    }

    public void setCipher(boolean cipher) {
        this.cipher = cipher;
    }

    public com.binhdi0111.bka.ex7.meta getMeta() {
        return meta;
    }

    public void setMeta(com.binhdi0111.bka.ex7.meta meta) {
        this.meta = meta;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public List<Integer> getItags() {
        return itags;
    }

    public void setItags(List<Integer> itags) {
        this.itags = itags;
    }

    public List<Integer> getVideo_quality() {
        return video_quality;
    }

    public void setVideo_quality(List<Integer> video_quality) {
        this.video_quality = video_quality;
    }

    public List<Url> getUrl() {
        return url;
    }

    public void setUrl(List<Url> url) {
        this.url = url;
    }

    public String getMp3Converter() {
        return mp3Converter;
    }

    public void setMp3Converter(String mp3Converter) {
        this.mp3Converter = mp3Converter;
    }

    public String getHosting() {
        return hosting;
    }

    public void setHosting(String hosting) {
        this.hosting = hosting;
    }

    public Object getSd() {
        return sd;
    }

    public void setSd(Object sd) {
        this.sd = sd;
    }

    public Object getHd() {
        return hd;
    }

    public void setHd(Object hd) {
        this.hd = hd;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }
}
