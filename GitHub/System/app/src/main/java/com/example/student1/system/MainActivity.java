package com.example.student1.system;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    MyDraw draw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        draw = (MyDraw)findViewById(R.id.view);
        MyTask mt = new MyTask();
        mt.execute();
    }
    class MyTask extends AsyncTask<Void, Void, Void>
    {

        @Override
        protected Void doInBackground(Void... voids) {
            while (true){
                try {
                    TimeUnit.MILLISECONDS.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                publishProgress();
            }
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            draw.planet.angle += draw.planet.avelocity*Math.PI;
            draw.planet1.angle += draw.planet1.avelocity*Math.PI;
            draw.invalidate();
        }
    }
}
