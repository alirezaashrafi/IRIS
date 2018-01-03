package com.alirezaashrafi.library;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ImageView;

/**
 * Created by AlirezaAshrafi on 1/2/2018.
 */

public class IRIS extends android.support.v7.widget.AppCompatImageView {
    public IRIS(Context context) {
        super(context);
    }

    public IRIS(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public IRIS(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /*private void setupView(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArray = getContext().obtainStyledAttributes(attributeSet, R.styleable.MyTextView);
            try {

                setColorFilter(, PorterDuff.Mode.SRC);
                setColorFilter(typedValue(R.attr.colorAccent));




            } finally {
                invalidate();
                requestLayout();
                typedArray.recycle();
            }
        }
    }

    public int typedValue(int attr) {


        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = getContext().getTheme();
        theme.resolveAttribute(attr, typedValue, true);
        return typedValue.data;
    }*/



    public static void attach(ImageView imageView){


    }

    public static void attach(I)
}
