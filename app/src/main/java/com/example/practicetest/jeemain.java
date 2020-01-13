package com.example.practicetest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class jeemain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeemain);
    }
    public void modaltest1(View view) {
        alert();
    }

    public void alert()
    {
        Intent in=new Intent(jeemain.this,jmainalert1.class);
        jeemain.this.finish();
        startActivity(in);
    }

    public void onBackPressed()
    {
        jeemain.this.finish();
    }

    public void neettest2(View view) {
        Intent in=new Intent(jeemain.this,jmainalert2.class);
        jeemain.this.finish();
        startActivity(in);

    }

    public void neettest3(View view) {
        Intent in=new Intent(jeemain.this,jmainalert3.class);
        jeemain.this.finish();
        startActivity(in);

    }

    public void neettest4(View view) {
        Intent in=new Intent(jeemain.this,jmainalert4.class);
        jeemain.this.finish();
        startActivity(in);
    }

    public void neetttest5(View view) {
        Intent in=new Intent(jeemain.this,jmainalert5.class);
        jeemain.this.finish();
        startActivity(in);
    }

    public void history(View view) {
        Intent in=new Intent(this,jeemainhistory.class);
        startActivity(in);
    }
}
