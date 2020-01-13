package com.example.practicetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class jmainprogress2 extends AppCompatActivity {
    jeemainquestionlibrary2 questionlibrary=new jeemainquestionlibrary2();
    jmain2 mainActivity=new jmain2();
    jmainalert2 alert=new jmainalert2();
    TextView report;
    public String store;
    SharedPreferences sharedPreferences;
    public int[] youranswer=new int[questionlibrary.length];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jmainprogress2);
        report=(TextView)findViewById(R.id.report);

        report.setText("Name: "+alert.Name+"\n"+"marks awarded: "+mainActivity.mscore+"\n"+"total questions: "+mainActivity.totalquestions+"\n"+"correct answers: "+mainActivity.correctanswer+"\n"+"wrong answers: "+mainActivity.wronganswer+"\n"+"skipped answer :"+mainActivity.skipquestions);
        store=report.getText().toString();
        Bundle bundle=getIntent().getExtras();
        youranswer=bundle.getIntArray("youranswer");
        sharedPreferences=getSharedPreferences("sharedprefmain", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("marks",store);
        editor.apply();

    }

    public void result(View view) {

        Intent in=new Intent(jmainprogress2.this,jmain2result.class);
        in.putExtra("youranswer",youranswer);
        jmainprogress2.this.finish();
        startActivity(in);
    }
    public void onBackPressed()
    {
        jmainprogress2.this.finish();
    }
}
