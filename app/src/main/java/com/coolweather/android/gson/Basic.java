package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public UpDate1 upDate1;

    public class UpDate1 {
        @SerializedName("loc")
        public String updateTime;
    }
}
