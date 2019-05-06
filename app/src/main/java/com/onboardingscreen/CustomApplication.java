package com.onboardingscreen;

import android.app.Application;

import com.onboardingscreen.preference.SharedPreference;

public class CustomApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SharedPreference.initShared(this);
    }
}
