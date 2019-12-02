package com.stg.softcom.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button addBtn, subtractBtn, divideBtn;

    EditText in1, in2;

    TextView outputTxtV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addBtn = findViewById(R.id.addBtn);
        subtractBtn = findViewById(R.id.subBtn);
        divideBtn = findViewById(R.id.divBtn);

        in1 = findViewById(R.id.input1);
        in2 = findViewById(R.id.input2);
        outputTxtV = findViewById(R.id.output);


        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addAndShowRes();
            }
        });

        subtractBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtractAndShowRes();
            }
        });

        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                divideAndShowRes();
            }
        });


    }



    private void addAndShowRes() {
        int no1 = Integer.valueOf(in1.getText().toString());
        int no2 = Integer.valueOf(in2.getText().toString());

        int res = no1 + no2;

        outputTxtV.setText(String.valueOf(res));
    }

    private void subtractAndShowRes() {
        int no1 = Integer.valueOf(in1.getText().toString());
        int no2 = Integer.valueOf(in2.getText().toString());

        int res = no1 - no2;

        outputTxtV.setText(String.valueOf(res));
    }

    private void divideAndShowRes() {
        int no1 = Integer.valueOf(in1.getText().toString());
        int no2 = Integer.valueOf(in2.getText().toString());

        int res = no1 / no2;

        outputTxtV.setText(String.valueOf(res));
    }
}
