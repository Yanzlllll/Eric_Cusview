package com.summer.whp.cusview.cusview_01;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created on 2017/5/8.
 * Desc：
 * Author：Eric.w
 */

public class LzyView extends View {
    public LzyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }
}
