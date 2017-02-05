package com.example.student1.wheels;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class MyDraw extends View{
    float xl1, yl1, xl2, yl2;
    double a = 0, b = 0;

    public MyDraw(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3);
        canvas.drawCircle(60, 60, 50, paint);
        canvas.drawCircle(165, 165, 100, paint);
        xl1=60+50*(float)Math.cos(a);
        yl1=60+50*(float)Math.sin(a);
        xl2=165+100*(float)Math.cos(b);
        yl2=165+100*(float)Math.sin(b);
        canvas.drawLine(60, 60, xl1, yl1, paint);
        canvas.drawLine(165, 165, xl2, yl2, paint);

    }
}
