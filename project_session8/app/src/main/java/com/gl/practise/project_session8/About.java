package com.gl.practise.project_session8;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class About extends AppCompatActivity {

    private ViewPager viewpager;
    private FragmentAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_about);
        viewpager = findViewById(R.id.viewpager);
        adapter = new FragmentAdapter(getSupportFragmentManager());
        viewpager.setAdapter(adapter);
    }
}
