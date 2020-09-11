package com.example.karan.datepickerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private Button btn;
    private DatePicker dp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Find View By id
        tv = findViewById(R.id.tv);
        btn = findViewById(R.id.btn);
        dp = findViewById(R.id.dp);
        tv.setText("Date is " + getCurrentDate());
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("Changed Date " + getCurrentDate());
            }
        });
    }

    public String getCurrentDate() {
        StringBuilder builder = new StringBuilder();
        builder.append(dp.getDayOfMonth() + "/");
        builder.append(dp.getMonth() + 1 + "/");
        builder.append(dp.getYear() + "/");
        return builder.toString();
    }
}
