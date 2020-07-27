package com.example.android.fragmentexample2;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.text.BreakIterator;

public class SecondActivity extends AppCompatActivity {
    private Button btnPrevious;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnPrevious=findViewById(R.id.button_previous);
        btnNext=findViewById(R.id.button_next);

        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(SecondActivity.this, MainActivity.class);
                startActivity(in);
            }
        });

        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(SecondActivity.this, MainActivity.class);
                startActivity(in);
            }
        });
    }

}