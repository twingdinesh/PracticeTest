package com.example.practicetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class pdflist extends AppCompatActivity {
    ListView pdflist;
    String[] pdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdflist);
        pdflist=(ListView)findViewById(R.id.pdflist);
        ArrayAdapter adapter =new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,pdf);
        pdflist.setAdapter(adapter);
    }
}
