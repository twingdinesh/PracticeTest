package com.example.practicetest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class NeetTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neet_test);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.bookmarkmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.bookmarkitem :
            {
                Intent in=new Intent(NeetTest.this,nextupdate.class);
                startActivity(in);
            }
        }
        return super.onOptionsItemSelected(item);
    }

    public void modaltest1(View view) {
            alert();
    }

    public void alert()
    {
        Intent in=new Intent(NeetTest.this,alert.class);
        NeetTest.this.finish();
        startActivity(in);
    }

    public void onBackPressed()
    {
        NeetTest.this.finish();
    }

    public void neettest2(View view) {
        Intent in=new Intent(NeetTest.this,neet2alert.class);
        NeetTest.this.finish();
        startActivity(in);

    }

    public void neettest3(View view) {
        Intent in=new Intent(NeetTest.this,neet3alert.class);
        NeetTest.this.finish();
        startActivity(in);

    }

    public void neettest4(View view) {
        Intent in=new Intent(NeetTest.this,neet4alert.class);
        NeetTest.this.finish();
        startActivity(in);
    }

    public void neetttest5(View view) {
        Intent in=new Intent(NeetTest.this,nextupdate.class);
        NeetTest.this.finish();
        startActivity(in);
    }

    public void history(View view) {

        Intent in=new Intent(this,neethistory.class);
        startActivity(in);
    }
}
