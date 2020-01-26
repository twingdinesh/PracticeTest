package com.example.practicetest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class startActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_start);

    }

    public void neet(View view) {
        Intent in=new Intent(startActivity.this,NeetTest.class);
        startActivity(in);
    }

    public void onBackPressed()
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(startActivity.this);
        builder.setTitle("credits GOD").setMessage("Are you sure want to quit?");
        builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity.this.finish();
            }
        }).setNegativeButton("no",null).setCancelable(false);
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }

    public void jeemain(View view) {
        Intent in=new Intent(startActivity.this,jeemain.class);
        startActivity(in);
    }

    public void jeeadvance(View view) {
//        Intent in=new Intent(startActivity.this,jeeAdvanced.class);
//        startActivity(in);
        Intent in=new Intent(startActivity.this,nextupdate.class);
        startActivity(in);
    }
}
