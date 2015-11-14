package com.nkdroid.customviews;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;


public class RobotoLightItalicEditTextView extends AppCompatEditText {


    public RobotoLightItalicEditTextView(Context context) {
        super(context);
        setTypeface(context);
    }

    public RobotoLightItalicEditTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(context);
    }

    public RobotoLightItalicEditTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setTypeface(context);
    }

    private void setTypeface(Context context) {
        if (context != null && !isInEditMode()) {
            setTypeface(MyApplication.getRobotoLightItalic());
        }
    }
}
