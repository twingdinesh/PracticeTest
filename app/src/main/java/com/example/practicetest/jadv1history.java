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
    SharedPreferences result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadv1history);
        marks=(TextView)findViewById(R.id.marks);
        marks.setVisibility(View.INVISIBLE);
        result=getSharedPreferences("sharedprefadv", Context.MODE_PRIVATE);
        value=result.getString("marks","");
        if(!value.isEmpty())
            marks.setVisibility(View.VISIBLE);
        marks.setText(value);
    }


    public void clear(View view) {
        marks.setVisibility(View.INVISIBLE);
        SharedPreferences.Editor editor=result.edit();
        editor.clear();
        editor.apply();

    }
}
