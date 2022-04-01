package com.example.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class descri extends AppCompatActivity {
     TextView tv1,tv2;
     ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descri);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        iv1 = (ImageView) findViewById(R.id.iv1);

        String id = getIntent().getStringExtra("id");
        tv1.setText("Area= "+id);
        tv2.setText("Area= "+id);
        iv1.setImageResource(R.drawable.a);

    }
}