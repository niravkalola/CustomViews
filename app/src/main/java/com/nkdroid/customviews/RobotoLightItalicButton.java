package com.nkdroid.customviews;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

public class RobotoLightItalicButton extends AppC {


    public RobotoLightItalicButton(Context context) {
        super(context);
        setTypeface(context);
    }

    public RobotoLightItalicButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(context);
    }

    public RobotoLightItalicButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setTypeface(context);
    }

    private void setTypeface(Context context) {
        if (context != null && !isInEditMode()) {
            setTypeface(MyApplication.getRobotoLightItalic());
        }
    }
}
