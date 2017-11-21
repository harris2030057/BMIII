package com.ypnors.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.ypnors.bmi.R.layout.activity_result;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_result);
        float bmi = getIntent().getFloatExtra(getString(R.string.bmi_extea),0);
        TextView result = (TextView) findViewById(R.id.result);
        result.setText("BMI is"+bmi);

    }
}
