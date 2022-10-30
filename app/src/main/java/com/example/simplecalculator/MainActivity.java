package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstnumber,secondnumber;
    TextView textView;
    Button add,minimize,multiplication,division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstnumber = findViewById(R.id.firstnumber);
        secondnumber = findViewById(R.id.secondnumber);
        textView = findViewById(R.id.textView);
        add = findViewById(R.id.add);
        minimize = findViewById(R.id.minimize);
        multiplication = findViewById(R.id.multiplication);
        division = findViewById(R.id.division);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstvalue,secondvalue,answer;

                firstvalue = Integer.parseInt(firstnumber.getText().toString());
                secondvalue = Integer.parseInt(secondnumber.getText().toString());

                answer = firstvalue + secondvalue;

                textView.setText("Your Answer Is --> "+ answer);
            }
        });

        minimize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstvalue,secondvalue,answer;

                firstvalue = Integer.parseInt(firstnumber.getText().toString());
                secondvalue = Integer.parseInt(secondnumber.getText().toString());

                answer = firstvalue - secondvalue;

                textView.setText("Your Answer Is --> "+ answer);
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstvalue,secondvalue,answer;

                firstvalue = Integer.parseInt(firstnumber.getText().toString());
                secondvalue = Integer.parseInt(secondnumber.getText().toString());

                answer = firstvalue  * secondvalue;

                textView.setText("Your Answer Is --> "+ answer);
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float firstvalue,secondvalue,answer;

                firstvalue = Float.parseFloat(firstnumber.getText().toString());
                secondvalue = Float.parseFloat(secondnumber.getText().toString());


                answer = firstvalue / secondvalue;

                textView.setText("Your Answer Is --> "+ answer);
            }
        });
    }
}