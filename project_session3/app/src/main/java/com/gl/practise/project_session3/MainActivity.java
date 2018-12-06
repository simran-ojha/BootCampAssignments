package com.gl.practise.project_session3;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


//
public class MainActivity extends AppCompatActivity {

    private Button Button1, Button2;
    private EditText amount, year, interest;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        amount = findViewById(R.id.amount_id);
        year = findViewById(R.id.year_id);
        interest = findViewById(R.id.interest_id);
        output = findViewById(R.id.Result_id);


        Button1 = findViewById(R.id.Button1);
        Button2 = findViewById(R.id.Button2);


        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a = Float.valueOf(amount.getText().toString());
                int b = Integer.valueOf(year.getText().toString());
                int c = Integer.valueOf(interest.getText().toString());
                SimpleInterest si = new SimpleInterest();
                double res = si.simple(a, b, c);
                output.setText(String.format("%.0f", res));

            }


        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a = Float.valueOf(amount.getText().toString());
                int b = Integer.valueOf(year.getText().toString());
                int c = Integer.valueOf(interest.getText().toString());
                Comp ci = new Comp();
                double sum = ci.compoundI(a, b, c);
                output.setText(String.format("%.0f", sum));


            }
        });
    }
}



  //  @SuppressLint("WrongViewCast")
  /* // public void  onclick(){
        amount=(EditText)findViewById(R.id.amount);
        year=(EditText)findViewById(R.id.year);
        interest=(EditText)findViewById(R.id.interest);
        Button=(Button)findViewById(R.id.Button1);
*/
     /*   Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(amount.getText().toString());
                int b=Integer.parseInt(year.getText().toString());
                int c=Integer.parseInt(interest.getText().toString());
                int d;
                Button1.setText(si.simple(a,b,c));
                Button2.setText(ci.compoundI(a,b,c));
*/


