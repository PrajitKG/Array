package com.example.array;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    String[] fruits = new String[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView);
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";
        String text = "Fruits\n=====\n" + fruits[0] + "\n" + fruits[1] +  "\n" + fruits[2];
        tv.setText(text);

    }
}