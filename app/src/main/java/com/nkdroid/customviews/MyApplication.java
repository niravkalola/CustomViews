package com.nkdroid.customviews;

import android.app.Application;
import android.graphics.Typeface;

public class MyApplication extends Application {

    private static Typeface robotoLightItalic;

    public static Typeface getRobotoLightItalic() {
        return robotoLightItalic;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        robotoLightItalic = Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/li.ttf");
    }
}
