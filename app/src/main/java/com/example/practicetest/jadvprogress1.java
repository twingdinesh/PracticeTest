package com.example.practicetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class jadvprogress1 extends AppCompatActivity {
    javaadvquestionlibrary1 questionlibrary=new javaadvquestionlibrary1();
    jadv1 mainActivity=new jadv1();
    jadvalert1 alert=new jadvalert1();
    TextView report;
    public String store;
    SharedPreferences sharedPreferences;
    public int[] youranswer=new int[questionlibrary.length];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadvprogress1);
        report=(TextView)findViewById(R.id.report);

        report.setText("\n"+"Name: "+alert.Name+"\n"+"marks awarded: "+mainActivity.mscore+"\n"+"total questions: "+mainActivity.totalquestions+"\n"+"correct answers: "+mainActivity.correctanswer+"\n"+"wrong answers: "+mainActivity.wronganswer+"\n"+"skipped answer :"+mainActivity.skipquestions+"\n");
        store=report.getText().toString();
        Bundle bundle=getIntent().getExtras();
        youranswer=bundle.getIntArray("youranswer");
        sharedPreferences=getSharedPreferences("sharedpref", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("marks",store);
        editor.apply();

    }

    public void result(View view) {

        Intent in=new Intent(jadvprogress1.this,jadvresult1.class);
        in.putExtra("youranswer",youranswer);
        jadvprogress1.this.finish();
        startActivity(in);
    }
//    public void onBackPressed()
//    {
//        jadvprogress1.this.finish();
//    }
}
