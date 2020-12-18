package com.example.practicetest;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class jmainprogress6 extends AppCompatActivity {
     jeemainquestionlibrary6 questionlibrary =new jeemainquestionlibrary6();
    jmain6 mainActivity=new jmain6();
    jmainalert6 alert=new jmainalert6();
    TextView report;
    Button save;
    public String store;
    SharedPreferences sharedPreferences;
    public int[] youranswer=new int[questionlibrary.length];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jmainprogress5);
        report=(TextView)findViewById(R.id.report);
        save=(Button)findViewById(R.id.save);
        report.setText("Name: "+alert.Name+"\n"+"marks awarded: "+mainActivity.mscore+"\n"+"total questions: "+mainActivity.totalquestions+"\n"+"correct answers: "+mainActivity.correctanswer+"\n"+"wrong answers: "+mainActivity.wronganswer+"\n"+"skipped answer :"+mainActivity.skipquestions);
        Bundle bundle=getIntent().getExtras();
        youranswer=bundle.getIntArray("youranswer");


    }

    public void result(View view) {

        Intent in=new Intent(jmainprogress6.this,jmain6result.class);
        in.putExtra("youranswer",youranswer);
        jmainprogress6.this.finish();
        startActivity(in);
    }
    public void onBackPressed()
    {
        jmainprogress6.this.finish();
    }
    public void save(View view) {
        store=report.getText().toString();
        sharedPreferences=getSharedPreferences("sharedprefmain", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("marks",store);
        editor.apply();

        Toast.makeText(this,"saved your report in TEST HISTORY",Toast.LENGTH_SHORT).show();
        save.setVisibility(View.INVISIBLE);

    }
}
