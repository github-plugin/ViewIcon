package com.viewiconlib;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class ViewIcon extends androidx.appcompat.widget.AppCompatTextView {
    public ViewIcon(Context context) {
        super(context);
    }

    public ViewIcon(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.ViewIcon);
        String fontFileName = typedArray.getString(R.styleable.ViewIcon_fontName);

        typedArray.recycle();
        // if (isInEditMode()) {
        if (fontFileName == null)
            return;
        try {
            Typeface typeface = Typeface.createFromAsset(context.getAssets(), fontFileName);
            this.setTypeface(typeface);
        } catch (Exception ignored) {
        }
        // }

    }

    public ViewIcon(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}

