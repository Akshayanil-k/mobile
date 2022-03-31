package com.example.calcusimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText n1;
    EditText n2;
    Button add;
    Button sub;
    Button mul;
    Button div;
    float op=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.num1);
        n2=findViewById(R.id.num2);
        add=findViewById(R.id.button);
        sub=findViewById(R.id.button2);
        mul=findViewById(R.id.button3);
        div=findViewById(R.id.button4);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a = Float.parseFloat(n1.getText().toString());
                float b = Float.parseFloat(n2.getText().toString());
                op=a+b;
                Toast.makeText(MainActivity.this, "Sum is "+op, Toast.LENGTH_SHORT).show();
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a = Float.parseFloat(n1.getText().toString());
                float b = Float.parseFloat(n2.getText().toString());
                op=a-b;
                Toast.makeText(MainActivity.this, "Difference is " +op, Toast.LENGTH_SHORT).show();;

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a = Float.parseFloat(n1.getText().toString());
                float b = Float.parseFloat(n2.getText().toString());
                op=a*b;
                Toast.makeText(MainActivity.this, "Product is "+op, Toast.LENGTH_SHORT).show();;


            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a = Float.parseFloat(n1.getText().toString());
                float b = Float.parseFloat(n2.getText().toString());
                op=a/b;
                Toast.makeText(MainActivity.this, "Division is "+op, Toast.LENGTH_SHORT).show();
            }
        });
    }
}