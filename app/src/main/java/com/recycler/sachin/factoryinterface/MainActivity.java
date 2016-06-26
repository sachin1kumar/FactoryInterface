package com.recycler.sachin.factoryinterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import shared.SharedFunctions;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);

        //SharedFunctions.getInstance().writeSP(this,"Account 1");

        textView.setText(SharedFunctions.getInstance().getSP(this,"key"));

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedFunctions.getInstance().writeSP(getApplicationContext(),"Account 1");

                textView.setText(SharedFunctions.getInstance().getSP(getApplicationContext(),"key"));

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedFunctions.getInstance().writeSP(getApplicationContext(),"Account 2");

                textView.setText(SharedFunctions.getInstance().getSP(getApplicationContext(),"key"));
            }
        });
    }
}
