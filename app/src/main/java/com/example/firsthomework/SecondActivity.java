package com.example.firsthomework;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.textView);

        Intent arguments = getIntent();

        if (arguments != null) {
            String name = arguments.getStringExtra("name");
            String surname = arguments.getStringExtra("surname");
            if (name == null | surname == null) {
                textView.setText("");
            } else {
                textView.setText(name + " " + surname);
            }
        }

    }

    public void toFirstActivity(View v) {
        Intent intent = new Intent(this, FirstHomework.class);
        startActivity(intent);
    }

    public void toThirdActivity(View v) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
}