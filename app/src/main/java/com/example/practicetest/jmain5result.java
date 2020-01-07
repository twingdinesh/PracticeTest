package com.example.practicetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class jmain5result extends AppCompatActivity {
    jeemainquestionlibrary5 questionlibrary=new jeemainquestionlibrary5();
    private   TextView result,resQuesNo,resQues,correctans,yourans;
    private   Button next;
    private   int quesno=0;
    private int[] youransw=new int[questionlibrary.length-1];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jmain5result);
        result=(TextView)findViewById(R.id.result);
        resQuesNo=(TextView)findViewById(R.id.resultQuestionNo);
        resQues=(TextView)findViewById(R.id.resultQuestion);
        correctans=(TextView)findViewById(R.id.correctans);
        yourans=(TextView)findViewById(R.id.yourans);

        next=(Button)findViewById(R.id.next);
        Bundle bundle=getIntent().getExtras();
        int res=bundle.getInt("score",0);
        result.setText("your score is:"+res);
        youransw=bundle.getIntArray("youranswer");
        updateQuestion();

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateQuestion();

            }
        });

    }
    public void updateQuestion()
    {
        if(quesno!=questionlibrary.length) {
            resQuesNo.setText("question no:" +(quesno + 1));
            resQues.setText(questionlibrary.getQuestions(quesno));
            correctans.setText("correct ans:"+questionlibrary.getCorrectAnswer(quesno));
            if(youransw[quesno]==1)
                yourans.setText("your ans :"+questionlibrary.getChoice1(quesno));
            if(youransw[quesno]==2)
                yourans.setText("your ans :"+questionlibrary.getChoice2(quesno));
            if(youransw[quesno]==3)
                yourans.setText("your ans :"+questionlibrary.getChoice3(quesno));
            if(youransw[quesno]==4)
                yourans.setText("your ans :"+questionlibrary.getChoice4(quesno));
            if(youransw[quesno]==0)
                yourans.setText("you didn't answer this");
            quesno++;
        }
        else
        {
            Toast.makeText(this,"finish",Toast.LENGTH_SHORT).show();
        }
    }

    public void onBackPressed()
    {
        jmain5result.this.finish();
    }
    }

