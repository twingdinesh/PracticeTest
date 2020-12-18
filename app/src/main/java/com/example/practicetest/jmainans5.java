package com.example.practicetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class jmainans5 extends AppCompatActivity {
    jeemainquestionlibrary5 questionlibrary=new jeemainquestionlibrary5();
    TextView questionno,answer;
    Button nextans,ansprev;
    ImageView quesimg,ansimg;
    private int qno=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jmainans5);
        quesimg=(ImageView)findViewById(R.id.imgques);
        questionno=(TextView)findViewById(R.id.ansQuestionNo);
        answer=(TextView)findViewById(R.id.anscorrectans);
        nextans=(Button) findViewById(R.id.ansnext);
        ansprev=(Button)findViewById(R.id.ansprev);
        ansprev.setVisibility(View.INVISIBLE);
        ansimg=(ImageView)findViewById(R.id.ansimg);
        updatesheet();
        nextans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ansprev.setVisibility(View.VISIBLE);
                if(qno==questionlibrary.length) {
                    nextans.setVisibility(View.INVISIBLE);
                    ansprev.setVisibility(View.VISIBLE);
                }
                updatesheet();

            }
        });

        ansprev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backpress();
                nextans.setVisibility(View.VISIBLE);
                if(qno==0)
                {
                    Toast.makeText(jmainans5.this,"first question",Toast.LENGTH_SHORT).show();
                    nextans.setVisibility(View.VISIBLE);
                    ansprev.setVisibility(View.INVISIBLE);


                }
            }
        });

    }

    public void updatesheet()
    {
        if(qno!=questionlibrary.length) {

            questionno.setText("question no:" + (qno + 1));
            ansimg.setImageResource(questionlibrary.answerimages[qno]);
            quesimg.setImageResource(questionlibrary.getQuestions(qno));
            answer.setText("correct option: "+questionlibrary.getCorrectAnswer(qno));
            qno++;
        }
        else
        {
            qno--;

            Toast.makeText(this,"finish",Toast.LENGTH_SHORT).show();
        }
    }

    public void backpress()
    {
        if(qno>0)
        {
            qno--;
            ansimg.setImageResource(questionlibrary.answerimages[qno]);
            questionno.setText("question no:" + (qno + 1));
            quesimg.setImageResource(questionlibrary.getQuestions(qno));
            answer.setText("correct option: "+questionlibrary.getCorrectAnswer(qno));

        }
        else
        {
            qno++;


        }
    }

    public void onBackPressed()
    {
        Intent in=new Intent(jmainans5.this,jeemain.class);
        jmainans5.this.finish();
        startActivity(in);
    }
}
