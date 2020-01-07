package com.example.practicetest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class jmain4 extends AppCompatActivity {
    private jeemainquestionlibrary4 questionlibrary=new jeemainquestionlibrary4();
    private TextView questionno,mquestionview,time;
    private Button choice1,choice2,choice3,choice4;
    private String manswer;
    private int mscore=0,mquestionnumber=0;
    public final int[] ans=new int[questionlibrary.length];
    CountDownTimer count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jmain4);
        questionno=(TextView)findViewById(R.id.questionnum);
        mquestionview = (TextView) findViewById(R.id.question);
        time=(TextView)findViewById(R.id.time);
        choice1 = (Button) findViewById(R.id.choice1);
        choice2 = (Button) findViewById(R.id.choice2);
        choice3 = (Button) findViewById(R.id.choice3);
        choice4 = (Button) findViewById(R.id.choice4);

        updateQuestion();
        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                useranswer(1);
                choice1.setTextColor(getResources().getColor(R.color.black));
                choice2.setVisibility(View.INVISIBLE);
                choice3.setVisibility(View.INVISIBLE);
                choice4.setVisibility(View.INVISIBLE);

                choice1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        choice2.setVisibility(View.VISIBLE);
                        choice3.setVisibility(View.VISIBLE);
                        choice4.setVisibility(View.VISIBLE);
                        choice1.setTextColor(getResources().getColor(R.color.white));
                        if (choice1.getText().equals(manswer)) {
                            mscore = mscore + 4;
                            updateQuestion();
                        } else {
                            mscore--;
                            updateQuestion();
                        }
                    }
                },200);

            }
        });
        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice2.setTextColor(getResources().getColor(R.color.black));
                choice1.setVisibility(View.INVISIBLE);
                choice3.setVisibility(View.INVISIBLE);
                choice4.setVisibility(View.INVISIBLE);
                useranswer(2);
                choice2.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        choice2.setTextColor(getResources().getColor(R.color.white));
                        choice1.setVisibility(View.VISIBLE);
                        choice3.setVisibility(View.VISIBLE);
                        choice4.setVisibility(View.VISIBLE);
                        if (choice2.getText() == manswer) {
                            mscore=mscore+4;
                            updateQuestion();

                        } else {
                            mscore--;
                            updateQuestion();
                        }


                    }
                },200);


            }
        });
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice3.setTextColor(getResources().getColor(R.color.black));
                useranswer(3);
                choice2.setVisibility(View.INVISIBLE);
                choice1.setVisibility(View.INVISIBLE);
                choice4.setVisibility(View.INVISIBLE);
                choice3.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        choice2.setVisibility(View.VISIBLE);
                        choice1.setVisibility(View.VISIBLE);
                        choice4.setVisibility(View.VISIBLE);
                        choice3.setTextColor(getResources().getColor(R.color.white));
                        if (choice3.getText() == manswer) {
                            mscore=mscore+4;
                            updateQuestion();

                        } else {
                            mscore--;
                            updateQuestion();
                        }

                    }
                },200);


            }
        });
        choice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                choice4.setTextColor(getResources().getColor(R.color.black));
                useranswer(4);
                choice2.setVisibility(View.INVISIBLE);
                choice3.setVisibility(View.INVISIBLE);
                choice1.setVisibility(View.INVISIBLE);
                choice4.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        choice2.setVisibility(View.VISIBLE);
                        choice3.setVisibility(View.VISIBLE);
                        choice1.setVisibility(View.VISIBLE);
                        choice4.setTextColor(getResources().getColor(R.color.white));

                        if (choice4.getText() == manswer) {
                            mscore=mscore+4;
                            updateQuestion();

                        } else {
                            mscore--;
                            updateQuestion();
                        }
                    }
                },200);

            }
        });

        count=new CountDownTimer(3*60*60*1000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                int seconds = (int) (millisUntilFinished / 1000);

                int hours = seconds / (60 * 60);
                int tempMint = (seconds - (hours * 60 * 60));
                int minutes = tempMint / 60;
                seconds = tempMint - (minutes * 60);

                time.setText(String.format("%02d", hours)
                        + ":" + String.format("%02d", minutes)
                        + ":" + String.format("%02d", seconds));

            }

            @Override
            public void onFinish() {

                AlertDialog.Builder builder= new AlertDialog.Builder(jmain4.this);
                builder.setTitle("time out").setMessage("would you like to checck answer?");
                builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent in=new Intent(jmain4.this,jmainans4.class);
                        startActivity(in);
                    }
                }).setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent in=new Intent(jmain4.this,jeemain.class);
                        startActivity(in);
                    }
                }).setCancelable(false);
                AlertDialog alertDialog=builder.create();
                alertDialog.show();
            }
        }.start();


    }



    private void updateQuestion() {
        if(mquestionnumber!=questionlibrary.length) {
            questionno.setText("Question no:"+(mquestionnumber+1));
            mquestionview.setText(questionlibrary.getQuestions(mquestionnumber));
            choice1.setText(questionlibrary.getChoice1(mquestionnumber));
            choice2.setText(questionlibrary.getChoice2(mquestionnumber));
            choice3.setText(questionlibrary.getChoice3(mquestionnumber));
            choice4.setText(questionlibrary.getChoice4(mquestionnumber));
            manswer = questionlibrary.getCorrectAnswer(mquestionnumber);
            mquestionnumber++;
        }
        else {

            Intent intent=new Intent(jmain4.this,jmain4result.class);
            Bundle bundle=new Bundle();
            bundle.putInt("score",mscore);
            bundle.putIntArray("youranswer",ans);
            intent.putExtras(bundle);
            jmain4.this.finish();
            startActivity(intent);
        }
    }

    public void useranswer(int a)
    {
        ans[mquestionnumber-1]=a;


    }
    @Override
    public void onBackPressed()
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(jmain4.this);
        builder.setTitle("quit test?").setMessage("are you sure you want to quit the test?").setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent in=new Intent(jmain4.this,jmainans4.class);
                jmain4.this.finish();
                startActivity(in);
            }
        }).setNegativeButton("no",null).setCancelable(false);
        AlertDialog alert=builder.create();
        alert.show();
    }
    }

