package com.example.student1.system;


import android.graphics.Canvas;
import android.graphics.Paint;

public class Planet {
    float radius, distance, angle, avelocity;
    int color;
    Planet parent;

    Planet(float radius, float distance, float avelocity, float angle, int color, Planet parent) {
        this.radius = radius;
        this.distance = distance;
        this.avelocity = avelocity;
        this.angle = angle;
        this.color = color;
        this.parent = parent;
    }

    public void Draw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(color);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawCircle(getX(), getY(), radius, paint);
    }

    float getX() {
        return parent.getX() + distance * (float) Math.cos(angle);
    }

    float getY() {
        return parent.getY() + distance * (float) Math.sin(angle);
    }
}
