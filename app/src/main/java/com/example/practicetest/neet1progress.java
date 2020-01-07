package com.example.practicetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Session2Command;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class neet1progress extends AppCompatActivity {
    questionlibrary questionlibrary=new questionlibrary();
    MainActivity mainActivity=new MainActivity();
    TextView report;
    public int[] youranswer=new int[questionlibrary.length];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neet1progress);
        report=(TextView)findViewById(R.id.report);

        report.setText("marks awarded: "+mainActivity.mscore+"\n"+"total questions: "+mainActivity.totalquestions+"\n"+"correct answers: "+mainActivity.correctanswer+"\n"+"wrong answers: "+mainActivity.wronganswer+"\n"+"skipped answer :"+mainActivity.skipquestions);

        Bundle bundle=getIntent().getExtras();
        youranswer=bundle.getIntArray("youranswer");


    }

    public void result(View view) {

        Intent in=new Intent(neet1progress.this,result.class);
        in.putExtra("youranswer",youranswer);
        startActivity(in);
    }
}
