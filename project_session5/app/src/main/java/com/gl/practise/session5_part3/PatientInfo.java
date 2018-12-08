package com.gl.practise.session5_part3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class PatientInfo extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    private EditText first1, last1, value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_patient_info);

        final EditText editText = (EditText) findViewById(R.id.edit_value);
        editText.getText().toString();
        first1 = findViewById(R.id.edit_first);
        last1 = findViewById(R.id.edit_last);
        value = findViewById(R.id.edit_value);

        String[] arraySpinner = new String[]{
                "Cold", "Fever", "Bodyache", "headache", "other"
        };
        Spinner s = (Spinner) findViewById(R.id.spinnerD_id);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);
        value.setVisibility(View.GONE);


        arraySpinner = new String[]{
                "o1-01=2018", "02-01-2018", "03-01-2018", "04-01-2018", "05-01-2018"
        };
        Spinner s1 = (Spinner) findViewById(R.id.spinnerDOB_id);
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(adapter);


        s.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (parent.getItemAtPosition(position).equals("other")) {
            value.setVisibility(View.VISIBLE);
        }
    }


        @Override
        public void onNothingSelected (AdapterView < ? > parent){

        }
    }

