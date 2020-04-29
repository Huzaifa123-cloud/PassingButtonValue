package com.example.passingbuttonvalue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Button2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            //TextView textView = (TextView) findViewById(R.id.text_view);
            //textView.setText(extras.getString("textViewText"));
            String message = extras.getString("message");
            TextView txtView = (TextView) findViewById(R.id.text_view);
            txtView.setText(message);
        }
    }
}
