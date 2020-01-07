package com.example.practicetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class jadvans5 extends AppCompatActivity {
    javaadvquestionlibrary5 questionlibrary=new javaadvquestionlibrary5();
    TextView questionno,question,answer;
    Button nextans,ansprev;
    private int qno=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadvans5);
        question=(TextView)findViewById(R.id.ansQuestion);
        questionno=(TextView)findViewById(R.id.ansQuestionNo);
        answer=(TextView)findViewById(R.id.anscorrectans);
        nextans=(Button) findViewById(R.id.ansnext);
        ansprev=(Button)findViewById(R.id.ansprev);
        ansprev.setVisibility(View.INVISIBLE);
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
                    Toast.makeText(jadvans5.this,"first question",Toast.LENGTH_SHORT).show();
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
            question.setText(questionlibrary.getQuestions(qno));
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
            questionno.setText("question no:" + (qno + 1));
            question.setText(questionlibrary.getQuestions(qno));
            answer.setText("correct option: "+questionlibrary.getCorrectAnswer(qno));

        }
        else
        {
            qno++;


        }
    }

    public void onBackPressed()
    {
        Intent in=new Intent(jadvans5.this,jeeAdvanced.class);
        jadvans5.this.finish();
        startActivity(in);
    }
    }

