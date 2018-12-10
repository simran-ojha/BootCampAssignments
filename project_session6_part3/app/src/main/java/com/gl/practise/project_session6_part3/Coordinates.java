package com.gl.practise.project_session6_part3;

import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
public class Coordinates extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinates);
        final TextView textView = (TextView) findViewById(R.id.textView);
        //touch event
        final View touchView = findViewById(R.id.touchView);
        touchView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                textView.setText("Touch coordinates : "
                        + String.valueOf(event.getX()) + "x"
                        + String.valueOf(event.getY()));
                Log.d("x y coordinates" ,"x:"+String.valueOf(event.getX())+"\n"+"y:"+String.valueOf(event.getY()));
                return true;

            }

        });
    }
}

