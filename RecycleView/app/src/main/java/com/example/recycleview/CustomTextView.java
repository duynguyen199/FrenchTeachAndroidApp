package com.example.recycleview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class CustomTextView extends androidx.appcompat.widget.AppCompatTextView {

    @Override
    public String toString() {
        return super.toString();
    }

    public CustomTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
}
