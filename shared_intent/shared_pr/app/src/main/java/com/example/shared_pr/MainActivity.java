package com.example.shared_pr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText age;
    EditText phone;
    EditText password;

    Button b1;


    @Override
    protected void onPause() {
        super.onPause();

        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();

        myEdit.putString("name", name.getText().toString());
        myEdit.putInt("age", Integer.parseInt(age.getText().toString()));
        myEdit.putString("password",password.getText().toString());
        myEdit.putInt("phone", Integer.parseInt(phone.getText().toString()));
        myEdit.apply();

        Toast.makeText(getApplicationContext(), "Onpause", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_PRIVATE);

        String s1 = sh.getString("name", "");
        int a = sh.getInt("age", 0);
        String s2 = sh.getString("password", "");
        int c = sh.getInt("phone", 0);

        name.setText(s1);
        age.setText(String.valueOf(a));
        password.setText(s2);
        phone.setText(String.valueOf(c));

        Toast.makeText(getApplicationContext(), "OnResume", Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.name);
        age=findViewById(R.id.age);
        phone=findViewById(R.id.Phone);
        password=findViewById(R.id.Password);


        b1 = findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                set page nav back

                Intent i = new Intent(getApplicationContext(),Staring_page.class);
                startActivity(i);

            }
        });



    }



}