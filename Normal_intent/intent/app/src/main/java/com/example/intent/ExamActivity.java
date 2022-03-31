package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExamActivity extends AppCompatActivity {
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
         b = findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
            Intent i= new Intent(getApplicationContext(),ExamActivity2.class);
            startActivity(i);
        }

        });
    }
}