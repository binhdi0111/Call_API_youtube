package com.binhdi0111.bka.ex7;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.w3c.dom.Attr;

public class Url {
    @SerializedName("url")
    @Expose
    private String url;


    @SerializedName("name")
    @Expose
    private String name;


    @SerializedName("subname")
    @Expose
    private int subname;


    @SerializedName("type")
    @Expose
    private String type;


    @SerializedName("ext")
    @Expose
    private String ext;


    @SerializedName("downloadable")
    @Expose
    private boolean downloadable;


    @SerializedName("quality")
    @Expose
    private String quality;


    @SerializedName("qualityNumber")
    @Expose
    private int qualityNumber;


    @SerializedName("videoCodec")
    @Expose
    private String videoCodec;


    @SerializedName("audioCodec")
    @Expose
    private String audioCodec;


    @SerializedName("audio")
    @Expose
    private boolean audio;


    @SerializedName("itag")
    @Expose
    private String itag;


    @SerializedName("no_audio")
    @Expose
    private boolean no_audio;


    @SerializedName("isBundle")
    @Expose
    private boolean isBundle;


    @SerializedName("isOtf")
    @Expose
    private boolean isOtf;


    @SerializedName("isDrm")
    @Expose
    private boolean isDrm;


    @SerializedName("attr")
    @Expose
    private attr attr;


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSubname() {
        return subname;
    }

    public void setSubname(int subname) {
        this.subname = subname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public boolean isDownloadable() {
        return downloadable;
    }

    public void setDownloadable(boolean downloadable) {
        this.downloadable = downloadable;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public int getQualityNumber() {
        return qualityNumber;
    }

    public void setQualityNumber(int qualityNumber) {
        this.qualityNumber = qualityNumber;
    }

    public String getVideoCodec() {
        return videoCodec;
    }

    public void setVideoCodec(String videoCodec) {
        this.videoCodec = videoCodec;
    }

    public String getAudioCodec() {
        return audioCodec;
    }

    public void setAudioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
    }

    public boolean isAudio() {
        return audio;
    }

    public void setAudio(boolean audio) {
        this.audio = audio;
    }

    public String getItag() {
        return itag;
    }

    public void setItag(String itag) {
        this.itag = itag;
    }

    public boolean isNo_audio() {
        return no_audio;
    }

    public void setNo_audio(boolean no_audio) {
        this.no_audio = no_audio;
    }

    public boolean isBundle() {
        return isBundle;
    }

    public void setBundle(boolean bundle) {
        isBundle = bundle;
    }

    public boolean isOtf() {
        return isOtf;
    }

    public void setOtf(boolean otf) {
        isOtf = otf;
    }

    public boolean isDrm() {
        return isDrm;
    }

    public void setDrm(boolean drm) {
        isDrm = drm;
    }

    public com.binhdi0111.bka.ex7.attr getAttr() {
        return attr;
    }

    public void setAttr(com.binhdi0111.bka.ex7.attr attr) {
        this.attr = attr;
    }
}
