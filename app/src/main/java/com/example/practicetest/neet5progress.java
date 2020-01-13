package com.example.practicetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class neet5progress extends AppCompatActivity {
    neetquestionlibrary5 questionlibrary=new neetquestionlibrary5();
    neettest5 mainActivity=new neettest5();
    neet5alert alert=new neet5alert();
    TextView report;
    public String store;
    SharedPreferences sharedPreferences;
    public int[] youranswer=new int[questionlibrary.length];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neet5progress);
        report=(TextView)findViewById(R.id.report);

        report.setText("Name: "+alert.Name+"\n"+"marks awarded: "+mainActivity.mscore+"\n"+"total questions: "+mainActivity.totalquestions+"\n"+"correct answers: "+mainActivity.correctanswer+"\n"+"wrong answers: "+mainActivity.wronganswer+"\n"+"skipped answer :"+mainActivity.skipquestions);
        store=report.getText().toString();
        Bundle bundle=getIntent().getExtras();
        youranswer=bundle.getIntArray("youranswer");
        sharedPreferences=getSharedPreferences("sharedprefneet", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("marks",store);
        editor.apply();


    }

    public void result(View view) {

        Intent in=new Intent(neet5progress.this,neet5result.class);
        in.putExtra("youranswer",youranswer);
        neet5progress.this.finish();
        startActivity(in);
    }
    public void onBackPressed()
    {
        neet5progress.this.finish();
    }
}
