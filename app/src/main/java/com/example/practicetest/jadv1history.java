package com.example.practicetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class jadv1history extends AppCompatActivity {

    TextView marks;
    String value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadv1history);
        marks=(TextView)findViewById(R.id.marks);
        SharedPreferences result=getSharedPreferences("sharedpref", Context.MODE_PRIVATE);

        value=result.getString("marks","");

            marks.setText(value);
        }


    public void clear(View view) {
        marks.setText("");
    }
}
