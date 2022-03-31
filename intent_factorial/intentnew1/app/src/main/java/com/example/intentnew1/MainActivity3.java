package com.example.intentnew1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
 EditText Number;
 EditText Number2;
 Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Number=findViewById(R.id.editTextTextPersonName);
        Number2=findViewById(R.id.editTextTextPersonName2);
        login=findViewById(R.id.button3);
     login.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {


             int no = Integer.parseInt(Number.getText().toString());

             int res = 1, i;
             for (i=2; i<=no; i++)
                 res *= i;



             Number2.setText(Integer.toString(res));
             Toast.makeText(MainActivity3.this,Integer.toString(res),Toast.LENGTH_LONG).show();

         }
     });
    }
}