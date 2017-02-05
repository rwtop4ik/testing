package com.example.student1.wheels;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    MyDraw draw;
    Button right;
    Button left;
    Button add;
    Button noadd;
    int n = 1;
    long s = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        draw = (MyDraw)findViewById(R.id.view);
        right = (Button)findViewById(R.id.right);
        left = (Button)findViewById(R.id.left);
        add = (Button)findViewById(R.id.add);
        noadd = (Button)findViewById(R.id.noadd);
        MyTask mt = new MyTask();
        mt.execute();


        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n = 1;
            }
        });
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n = -1;
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s -= 1;
            }
        });
        noadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s += 1;
            }
        });

    }
    class MyTask extends AsyncTask<Void, Void, Void>
    {

        @Override
        protected Void doInBackground(Void... voids) {
            while (true){
                try {
                    TimeUnit.MILLISECONDS.sleep(s);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                publishProgress();
            }
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            draw.a += n*0.02*Math.PI;
            draw.b -= n*0.01*Math.PI;
            draw.invalidate();
        }
    }

}
