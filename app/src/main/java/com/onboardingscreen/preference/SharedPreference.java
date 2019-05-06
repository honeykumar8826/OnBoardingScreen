package com.onboardingscreen.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;



public class SharedPreference {
    private static final String TAG = "SharedPreference";
    private static final String IS_FIRST_TIME_LAUNCH="" ;
    private static SharedPreference instance;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    private SharedPreference(Context context) {
        sharedPreferences = context.getSharedPreferences("IntroSlider", Context.MODE_PRIVATE);
    }

    public static void initShared(Context context) {
        if (instance == null) {
            instance = new SharedPreference(context);
        }
    }

    public static SharedPreference getInstance() {
        return instance;
    }

    public Boolean isFirstTime() {
       Boolean result = sharedPreferences.getBoolean(IS_FIRST_TIME_LAUNCH,true);
        return  result;
            }


    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor = sharedPreferences.edit();
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        editor.commit();
    }
}
