package com.example.practicetest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class jeeAdvanced extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jee_advanced);
    }
    public void modaltest1(View view) {
        alert();
    }

    public void alert()
    {
        Intent in=new Intent(jeeAdvanced.this,jadvalert1.class);
        jeeAdvanced.this.finish();
        startActivity(in);
    }

    public void onBackPressed()
    {
        jeeAdvanced.this.finish();
    }

    public void neettest2(View view) {
        Intent in=new Intent(jeeAdvanced.this,jadvalert2.class);
        jeeAdvanced.this.finish();
        startActivity(in);

    }

    public void neettest3(View view) {
        Intent in=new Intent(jeeAdvanced.this,jadvalert3.class);
        jeeAdvanced.this.finish();
        startActivity(in);

    }

    public void neettest4(View view) {
        Intent in=new Intent(jeeAdvanced.this,jadvalert4.class);
        jeeAdvanced.this.finish();
        startActivity(in);
    }

    public void neetttest5(View view) {
        Intent in=new Intent(jeeAdvanced.this,jadvalert5.class);
        jeeAdvanced.this.finish();
        startActivity(in);
    }
    public void history(View view)
    {
        Intent in=new Intent(this,jadv1history.class);
        startActivity(in);
    }
}
