package com.example.student1.system;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;

public class MyDraw extends View {
    Sun s = new Sun(100, Color.YELLOW);
    Planet planet = new Planet(30, 300, (float)0.003, 1, Color.BLACK, s);
    Planet planet1 = new Planet(10, 50, (float)0.01, 1, Color.RED, planet);
    ArrayList<Point> pics = new ArrayList<>();
    public MyDraw(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.LTGRAY);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        for (Point i:pics){
            canvas.drawCircle(i.x, i.y, 5, paint);
        }
        s.Draw(canvas);
        planet.Draw(canvas);
        planet1.Draw(canvas);
        pics.add(new Point(planet1));
    }
}
