package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {
    ImageButton b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b = findViewById(R.id.bt);
        b.setOnClickListener(new View.OnClickListener()
        {@Override
        public void onClick(View v)
        {
            Intent i= new
                    Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
        }

        });

    }
}