package com.example.practicetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class neet2progress extends AppCompatActivity {
    neetquestionlibrary2 questionlibrary=new neetquestionlibrary2();
    neetest2 mainActivity=new neetest2();
    neet2alert alert=new neet2alert();
    TextView report;
    Button save;
    public String store;
    SharedPreferences sharedPreferences;
    public int[] youranswer=new int[questionlibrary.length];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neet2progress);
        report=(TextView)findViewById(R.id.report);
        save = (Button) findViewById(R.id.save);
        report.setText("Name: "+alert.Name+"\n"+"marks awarded: "+mainActivity.mscore+"\n"+"total questions: "+mainActivity.totalquestions+"\n"+"correct answers: "+mainActivity.correctanswer+"\n"+"wrong answers: "+mainActivity.wronganswer+"\n"+"skipped answer :"+mainActivity.skipquestions);
        Bundle bundle=getIntent().getExtras();
        youranswer=bundle.getIntArray("youranswer");
    }

    public void result(View view) {

        Intent in=new Intent(neet2progress.this,neet2result.class);
        in.putExtra("youranswer",youranswer);
        neet2progress.this.finish();
        startActivity(in);
    }
    public void onBackPressed()
    {
        neet2progress.this.finish();
    }
    public void save(View view) {
        store=report.getText().toString();
        sharedPreferences=getSharedPreferences("sharedprefneet", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("marks",store);
        editor.apply();

        Toast.makeText(this,"saved your report in TEST HISTORY",Toast.LENGTH_SHORT).show();
        save.setVisibility(View.INVISIBLE);

    }

}
