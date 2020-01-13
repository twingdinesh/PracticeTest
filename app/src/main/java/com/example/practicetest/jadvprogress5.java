package com.example.practicetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class jadvprogress5 extends AppCompatActivity {
    javaadvquestionlibrary5 questionlibrary=new javaadvquestionlibrary5();
    jadv5 mainActivity=new jadv5();
    jadvalert5 alert=new jadvalert5();
    TextView report;
    public String store;
    SharedPreferences sharedPreferences;
    public int[] youranswer=new int[questionlibrary.length];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadvprogress5);
        report=(TextView)findViewById(R.id.report);

        report.setText("Name: "+alert.Name+"\n"+"marks awarded: "+mainActivity.mscore+"\n"+"total questions: "+mainActivity.totalquestions+"\n"+"correct answers: "+mainActivity.correctanswer+"\n"+"wrong answers: "+mainActivity.wronganswer+"\n"+"skipped answer :"+mainActivity.skipquestions);
        store=report.getText().toString();
        Bundle bundle=getIntent().getExtras();
        youranswer=bundle.getIntArray("youranswer");
        sharedPreferences=getSharedPreferences("sharedpref", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("marks",store);
        editor.apply();

    }

    public void result(View view) {

        Intent in=new Intent(jadvprogress5.this,jadvresult5.class);
        in.putExtra("youranswer",youranswer);
        jadvprogress5.this.finish();
        startActivity(in);
    }
    public void onBackPressed()
    {
        jadvprogress5.this.finish();
    }
}
