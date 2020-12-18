package com.example.practicetest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class jmain6result extends AppCompatActivity {
    jeemainquestionlibrary6 questionlibrary=new jeemainquestionlibrary6();
    jmain6 mainActivity=new jmain6();
    private   TextView result,resQuesNo,correctans,yourans;
    private   Button next,prev,explain;
    private   int quesno=0;
    ImageView quesimg,ansimg;
    private int[] youransw=new int[questionlibrary.length-1];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jmain5result);
        result=(TextView)findViewById(R.id.result);
        resQuesNo=(TextView)findViewById(R.id.resultQuestionNo);
        quesimg=(ImageView)findViewById(R.id.imgques);
        correctans=(TextView)findViewById(R.id.correctans);
        yourans=(TextView)findViewById(R.id.yourans);
        next=(Button)findViewById(R.id.next);
        prev=(Button)findViewById(R.id.prev);
        explain=(Button)findViewById(R.id.explain);
        ansimg=(ImageView)findViewById(R.id.imageans);
        ansimg.setVisibility(View.INVISIBLE);
        prev.setVisibility(View.INVISIBLE);
        Bundle bundle=getIntent().getExtras();
        result.setText("your score is:"+mainActivity.mscore);
        youransw=bundle.getIntArray("youranswer");
        updateQuestion();
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prev.setVisibility(View.VISIBLE);
                updateQuestion();

            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next.setVisibility(View.VISIBLE);
                prevquestions();

            }
        });
        explain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ansimg.setVisibility(View.VISIBLE);
                explain.setVisibility(View.INVISIBLE);
            }
        });


    }
    public void updateQuestion()
    {
        if(quesno!=questionlibrary.length) {
            ansimg.setVisibility(View.INVISIBLE);
            explain.setVisibility(View.VISIBLE);
            ansimg.setImageResource(questionlibrary.answerimages[quesno]);
            resQuesNo.setText("question no:" +(quesno + 1));
            quesimg.setImageResource(questionlibrary.getQuestions(quesno));
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
            quesno--;
            Toast.makeText(this,"finish",Toast.LENGTH_SHORT).show();
            next.setVisibility(View.INVISIBLE);
        }
    }

    public void prevquestions()
    {
        quesno--;
        if(quesno>=0) {
            ansimg.setVisibility(View.INVISIBLE);
            explain.setVisibility(View.VISIBLE);
            ansimg.setImageResource(questionlibrary.answerimages[quesno]);
            resQuesNo.setText("question no:" +(quesno + 1));
            quesimg.setImageResource(questionlibrary.getQuestions(quesno));
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
        }
        else
        {
            quesno++;
            Toast.makeText(this,"First question",Toast.LENGTH_SHORT).show();
            prev.setVisibility(View.INVISIBLE);
        }
    }

    public void onBackPressed()
    {
        jmain6result.this.finish();
    }
}

