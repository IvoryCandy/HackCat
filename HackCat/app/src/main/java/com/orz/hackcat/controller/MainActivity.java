package com.orz.hackcat.controller;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.orz.hackcat.R;


public class MainActivity extends AppCompatActivity {


    private Button go_function;
    private TextView somehow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        go_function = (Button) findViewById(R.id.go_function);
        somehow = (TextView) findViewById(R.id.main_tv);
        somehow.setText("Our Application is intended to help students organize lecture notes. " +
                "Students can upload both notes pictures and lectures audio recordings to our app. " +
                "We can transform them into formal WORD docs for students to study.");
        go_function.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, DemoActivity.class));
            }
        });
    }

    private void skipActivity(Class<?> classOf) {
        Intent intent = new Intent(getApplicationContext(), classOf);
        startActivity(intent);
    }


}
