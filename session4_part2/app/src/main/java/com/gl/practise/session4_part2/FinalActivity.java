package com.gl.practise.session4_part2;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.text.BreakIterator;

public class FinalActivity extends AppCompatActivity implements    View.OnClickListener{
    private Button fragment_btn_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        fragment_btn_1 = (Button) findViewById(R.id.button);


    }

    @Override
    public void onClick(View v) {

        Fragment1 frag = new Fragment1();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fragment2B,frag,"Test Fragment");
        transaction.commit();

    }
}