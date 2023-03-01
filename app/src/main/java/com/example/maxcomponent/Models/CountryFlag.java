package com.example.maxcomponent.Models;

public class CountryFlag {
    private  String mCounty;
    private  int mFlagImage;

    public CountryFlag(String mCounty, int mFlagImage) {
        this.mCounty = mCounty;
        this.mFlagImage = mFlagImage;
    }

    public String getmCounty() {
        return mCounty;
    }

    public int getmFlagImage() {
        return mFlagImage;
    }

    public void setmCounty(String mCounty) {
        this.mCounty = mCounty;
    }

    public void setmFlagImage(int mFlagImage) {
        this.mFlagImage = mFlagImage;
    }
}
