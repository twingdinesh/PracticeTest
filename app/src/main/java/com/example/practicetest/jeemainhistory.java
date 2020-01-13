package com.example.practicetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class jeemainhistory extends AppCompatActivity {
    TextView marks;
    String value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeemainhistory);
        marks=(TextView)findViewById(R.id.marks);
        SharedPreferences result=getSharedPreferences("sharedprefmain", Context.MODE_PRIVATE);

        value=result.getString("marks","");

        marks.setText(value);
    }


    public void clear(View view) {
        marks.setText("");
    }
}
