package com.example.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class descri extends AppCompatActivity {
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descri);

        tv1 = (TextView) findViewById(R.id.tv1);

        String id = getIntent().getStringExtra("id");
        tv1.setText("Area= "+id);

    }
}