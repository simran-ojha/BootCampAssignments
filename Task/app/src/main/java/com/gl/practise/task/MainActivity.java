package com.gl.practise.task;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView textView_bed;
    private TextView textView_store;
    private TextView textView_kitchen;
    private TextView textView_pet;
    private TextView textview_hall;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_bed=(TextView)findViewById(R.id.bedroom_text_id);
        textView_bed.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), BedRoom.class);
                startActivity(intent1);
            }
        });

        textView_store=(TextView)findViewById(R.id.store_text_id);
        textView_store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 =new Intent(getApplicationContext(),Store.class);
                startActivity(intent2);
            }
        });

        textView_kitchen=(TextView)findViewById(R.id.kitchen_text_id);
        textView_kitchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 =new Intent(getApplicationContext(),Kitchen.class);
                startActivity(intent3);
            }
        });

        textView_pet=(TextView)findViewById(R.id.pet_id);
        textview_hall=(TextView)findViewById(R.id.hall_text_id);
        textview_hall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                builder1.setMessage("Pet Name");
                builder1.setCancelable(true);

                 editText = new EditText(MainActivity.this);
                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT);
                editText.setLayoutParams(lp);
                builder1.setView(editText);


                builder1.setPositiveButton(
                        "Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                                textView_pet.setText(editText.getText().toString());

                            }
                        });



                AlertDialog alert11 = builder1.create();
                alert11.show();
            }
        });
    }

}
