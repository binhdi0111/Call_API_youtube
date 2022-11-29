package com.binhdi0111.bka.ex7;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class subtitle {
    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("language")
    @Expose
    private List<String> language = null;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<String> getLanguage() {
        return language;
    }

    public void setLanguage(List<String> language) {
        this.language = language;
    }
}
