package com.example.practicetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class neetbookmark extends AppCompatActivity {

    TextView textView;
    SharedPreferences sharedPreferences;
    public String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neetbookmark);
        textView=(TextView)findViewById(R.id.textviewbookmark);
        sharedPreferences=getSharedPreferences("bookmark",MODE_PRIVATE);
        text=sharedPreferences.getString("questions","");
        textView.setText(text);


    }
}
