package com.ypnors.bmi;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String s = new String("abc");
    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bHELP = (Button) findViewById(R.id.b_info);
        bHELP.setOnClickListener(listener);
    }
    public void bmi(View view){
        Log.d("Main activity" ,"testing bmi method"
                );
        EditText edWeight = (EditText) findViewById(R.id.ed_weight);
        EditText edHeight = (EditText) findViewById(R.id.ed_height);
        float weight = Float.parseFloat(edWeight.getText().toString());
        float height = Float.parseFloat(edHeight.getText().toString());
        float bmi = weight / (height * height);
        new AlertDialog.Builder(this)
                .setMessage(getString(R.string.your_bmi_is)+ bmi)
                .setTitle(R.string.my_title)
                .setPositiveButton(R.string.ok, null)
                .show();


       /* Log.d("MainActivity", "Your Bmi is"+String.valueOf(bmi));
        Toast.makeText(this, "Your BMI is "+ bmi, Toast.LENGTH_SHORT).show();*/
    }
}
