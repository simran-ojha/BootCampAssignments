package com.gl.practise.task;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;


public class Kitchen extends Activity {

    GridView grid;

    static final String[] letters = new String[] {
            "Knief", "refrigerator",
            "Water Fliter", "Bread",
            "Tea", "MicroWave"};

    @Override

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_kitchen);

        grid = (GridView) findViewById(R.id.grid_id);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, letters);

        grid.setAdapter(adapter);

        grid.setOnItemClickListener(new OnItemClickListener() {

            public void onItemClick(AdapterView parent, View v, int position, long id) {

                Toast.makeText(getApplicationContext(),

                ((TextView) v).getText(), Toast.LENGTH_SHORT).show();

            }
        });

    }

}
