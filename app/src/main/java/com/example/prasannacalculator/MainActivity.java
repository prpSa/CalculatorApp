package com.example.prasannacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     EditText etFirstValue,etSecondValue;
     TextView tvAns;
     Button add,multiply,sub,divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstValue = findViewById(R.id.etFirstValue);
        etSecondValue = findViewById(R.id.etSecondValue);
        tvAns = findViewById(R.id.tvAns);
        add = findViewById(R.id.btnAdd);
        multiply = findViewById(R.id.btnMulti);
        sub = findViewById(R.id.btnSub);
        divide = findViewById(R.id.btnDivi);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstvalue,secondvalue,ans;
                firstvalue= Integer.parseInt(etFirstValue.getText().toString());
                secondvalue= Integer.parseInt(etSecondValue.getText().toString());

                ans= firstvalue + secondvalue;
                tvAns.setText("Answer is "+ans);

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstvalue,secondvalue,ans;
                firstvalue= Integer.parseInt(etFirstValue.getText().toString());
                secondvalue= Integer.parseInt(etSecondValue.getText().toString());

                ans= firstvalue-secondvalue;
                tvAns.setText("Answer is "+ans);

            }
        }); multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstvalue,secondvalue,ans;
                firstvalue= Integer.parseInt(etFirstValue.getText().toString());
                secondvalue= Integer.parseInt(etSecondValue.getText().toString());

                ans= firstvalue * secondvalue;
                tvAns.setText("Answer is "+ans);

            }
        }); divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float firstvalue;
                float secondvalue;
                float ans;
                firstvalue= Float.parseFloat(etFirstValue.getText().toString());
                secondvalue= Float.parseFloat(etSecondValue.getText().toString());

                ans= firstvalue / secondvalue;
                tvAns.setText("Answer is "+ans);

            }
        });

    }

}