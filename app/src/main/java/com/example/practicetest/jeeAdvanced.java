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
        View view= LayoutInflater.from(jeeAdvanced.this).inflate(R.layout.activity_alert,null);
        AlertDialog.Builder builder=new AlertDialog.Builder(jeeAdvanced.this);
        builder.setTitle("Start the modal test?").setView(view).setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent in=new Intent(jeeAdvanced.this,jadv1.class);
                startActivity(in);
            }
        }).setNegativeButton("no",null).setCancelable(false);
        AlertDialog alert=builder.create();
        alert.show();

    }

    public void onBackPressed()
    {
        jeeAdvanced.this.finish();
    }

    public void neettest2(View view) {
        View view2= LayoutInflater.from(jeeAdvanced.this).inflate(R.layout.activity_alert,null);
        AlertDialog.Builder builder=new AlertDialog.Builder(jeeAdvanced.this);
        builder.setTitle("Star the modal test?").setView(view2).setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent in=new Intent(jeeAdvanced.this,jadv2.class);
                startActivity(in);
            }
        }).setNegativeButton("no",null).setCancelable(false);
        AlertDialog alert=builder.create();
        alert.show();

    }

    public void neettest3(View view) {
        View view2= LayoutInflater.from(jeeAdvanced.this).inflate(R.layout.activity_alert,null);
        AlertDialog.Builder builder=new AlertDialog.Builder(jeeAdvanced.this);
        builder.setTitle("Star the modal test?").setView(view2).setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent in=new Intent(jeeAdvanced.this,jadv3.class);
                startActivity(in);
            }
        }).setNegativeButton("no",null).setCancelable(false);
        AlertDialog alert=builder.create();
        alert.show();

    }

    public void neettest4(View view) {
        View view2= LayoutInflater.from(jeeAdvanced.this).inflate(R.layout.activity_alert,null);
        AlertDialog.Builder builder=new AlertDialog.Builder(jeeAdvanced.this);
        builder.setTitle("Star the modal test?").setView(view2).setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent in=new Intent(jeeAdvanced.this,jadv4.class);
                startActivity(in);
            }
        }).setNegativeButton("no",null).setCancelable(false);
        AlertDialog alert=builder.create();
        alert.show();
    }

    public void neetttest5(View view) {
        View view2= LayoutInflater.from(jeeAdvanced.this).inflate(R.layout.activity_alert,null);
        AlertDialog.Builder builder=new AlertDialog.Builder(jeeAdvanced.this);
        builder.setTitle("Star the modal test?").setView(view2).setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent in=new Intent(jeeAdvanced.this,jadv5.class);
                startActivity(in);
            }
        }).setNegativeButton("no",null).setCancelable(false);
        AlertDialog alert=builder.create();
        alert.show();
    }
}
