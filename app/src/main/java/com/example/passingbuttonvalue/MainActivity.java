package com.example.passingbuttonvalue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bttn1, bttn2, bttn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bttn1 = (Button) findViewById(R.id.btn1);
        bttn2 = (Button) findViewById(R.id.btn2);
        bttn3 = (Button) findViewById(R.id.btn3);

        bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, Button1.class);
                String message = "Welcome to button 1 activity";
                i.putExtra("message", message);
                startActivity(i);
            }
        });
        bttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, Button2.class);
                String message = "Welcome to button 2 activity";
                i.putExtra("message", message);
                startActivity(i);
            }
        });
        bttn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, Button3.class);
                String message = "Welcome to button 3 activity";
                i.putExtra("message", message);
                startActivity(i);
            }
        });
    }
}
