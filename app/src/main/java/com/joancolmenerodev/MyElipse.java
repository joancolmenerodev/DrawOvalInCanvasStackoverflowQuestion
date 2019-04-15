package com.joancolmenerodev;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class MyElipse extends View {
    float rotate_center_x = 100;
    float rotate_center_y = 200;
    float rotate_angle = 200;
    public MyElipse(Context context) {
        super(context);
    }

    public MyElipse(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyElipse(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.rotate(-rotate_angle, rotate_center_x, rotate_center_y);
        @SuppressLint("DrawAllocation") Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
        @SuppressLint("DrawAllocation") RectF rect = new RectF(45, 50, 100, 200);
        canvas.drawOval(rect,paint);
    }
}
