package com.jalotsav.demotests;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvHW = (TextView) findViewById(R.id.tv_mainactvty);
        tvHW.setText("Jaldeep Asodariya");
    }
}
