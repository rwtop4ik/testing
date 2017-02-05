package com.example.student1.system;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Sun extends Planet{
    Sun(float radius, int color){
        super(radius, 0, 0, 0, color, null);
    }
    float getX() { return 500; }
    float getY() { return 500; }
    public void Draw(Canvas canvas)
    {
        Paint paint = new Paint();
        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(2);

        canvas.drawColor(Color.TRANSPARENT);
        canvas.drawCircle(500, 500, radius, paint);
    }
}
