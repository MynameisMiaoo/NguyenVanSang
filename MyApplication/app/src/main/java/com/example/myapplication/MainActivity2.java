package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView txtv ;
    private Button btback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setTitle("ac2");
        txtv = findViewById(R.id.ac2_kq);
        btback = findViewById(R.id.but_back);
        super.onCreate(savedInstanceState);
        txtv.setText(getIntent().getStringExtra("ket_qua"));
        btback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backActivity();
            }
        });

    }
    private void backActivity() {
        finish();
    }
}