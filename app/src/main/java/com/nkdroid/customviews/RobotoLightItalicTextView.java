package com.nkdroid.customviews;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;


public class RobotoLightItalicTextView extends AppCompatTextView {


    public RobotoLightItalicTextView(Context context) {
        super(context);
        setTypeface(context);
    }

    public RobotoLightItalicTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(context);
    }

    public RobotoLightItalicTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setTypeface(context);
    }

    private void setTypeface(Context context) {
        if (context != null && !isInEditMode()) {
            setTypeface(MyApplication.getRobotoLightItalic());
        }
    }
}
