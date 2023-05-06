package com.example.firsthomework;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FirstHomework extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_homework);
    }

    public void toSecondActivity(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void toThirdActivity(View v) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

    public void onCLickSecondActivity(View v) {
        EditText name = findViewById(R.id.editTextText);
        EditText surname = findViewById(R.id.editText);
        String Name = name.getText().toString();
        String Surname = surname.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("name", Name);
        intent.putExtra("surname", Surname);
        startActivity(intent);
    }


}
