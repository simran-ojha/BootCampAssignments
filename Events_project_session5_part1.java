package com.gl.practise.session5_part3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class Events extends AppCompatActivity {

    private TextView textv;
    private EditText editt;
    private Button btn;
    private ImageView imagev;
    private ImageButton imageb;
    private CheckBox checkb;
    private RadioButton radiob;
    private ListView listv;
    private GridView gridv;
    private DatePicker datep;
    private Spinner spn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        textv= findViewById(R.id.textView);
        editt=findViewById(R.id.editview);
        btn=findViewById(R.id.button);
        imagev=findViewById(R.id.imageview);
        imageb=findViewById(R.id.imagebutton);
        checkb=findViewById(R.id.checkbox);
        radiob=findViewById(R.id.radiobutton);
        listv=findViewById(R.id.listview);
        gridv=findViewById(R.id.gridview);
        datep=findViewById(R.id.datepicker);
        spn=findViewById(R.id.spinner);

        textv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Events","text");
            }
        });

        editt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Events","Edit");
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Events","button show");
            }
        });

        imagev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Events","Image show");
            }
        });

        imageb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(" Events","Imagebutton show");
            }
        });

        checkb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Events","CheckBox show");
            }
        });

        radiob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Events","RadioBox show");
            }
        });

        listv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("Events","list item click");
            }
        });

        gridv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("Events","Grid item click");
            }
        });

        datep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Events","DatePicker show");
            }
        });

        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

}
