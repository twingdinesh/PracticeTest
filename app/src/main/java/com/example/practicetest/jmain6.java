package com.example.practicetest;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.github.chrisbanes.photoview.PhotoView;

import java.util.ArrayList;

public class jmain6 extends AppCompatActivity {
    private jeemainquestionlibrary6 questionlibrary=new jeemainquestionlibrary6();
    private TextView questionno,time,remaining;
    private Button choice1,choice2,choice3,choice4,skip,finish,answerlater;
    private String manswer;
    PhotoView quesimg;
    private int mquestionnumber=0,checklatecounter=0,num,remainques=1;
    public  int[] ans=new int[questionlibrary.length];
    public ArrayList<Integer> checklate=new ArrayList<Integer>();
    CountDownTimer count;
    public static int mscore=0,correctanswer=0,wronganswer=0,skipquestions=0,totalquestions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jmain5);
        questionno=(TextView)findViewById(R.id.questionnum);
        quesimg=(PhotoView)findViewById(R.id.quesimg);
        time=(TextView)findViewById(R.id.time);
        choice1 = (Button) findViewById(R.id.choice1);
        choice2 = (Button) findViewById(R.id.choice2);
        choice3 = (Button) findViewById(R.id.choice3);
        choice4 = (Button) findViewById(R.id.choice4);
        remaining=(TextView)findViewById(R.id.remaining);
        skip=(Button)findViewById(R.id.skip);
        finish=(Button)findViewById(R.id.finish);
        answerlater=(Button)findViewById(R.id.answerlater);
        updateQuestion();
        finish.setVisibility(View.INVISIBLE);
        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                remainques++;
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
                            correctanswer++;
                            mscore = mscore + 4;
                            updateQuestion();
                        } else {
                            wronganswer++;
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
                remainques++;
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
                            correctanswer++;
                            mscore=mscore+4;
                            updateQuestion();

                        } else {
                            wronganswer++;
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
                remainques++;
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
                            correctanswer++;
                            mscore=mscore+4;
                            updateQuestion();

                        } else {
                            wronganswer++;
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
                remainques++;
                choice4.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        choice2.setVisibility(View.VISIBLE);
                        choice3.setVisibility(View.VISIBLE);
                        choice1.setVisibility(View.VISIBLE);
                        choice4.setTextColor(getResources().getColor(R.color.white));

                        if (choice4.getText() == manswer) {
                            correctanswer++;
                            mscore=mscore+4;
                            updateQuestion();

                        } else {
                            wronganswer++;
                            mscore--;
                            updateQuestion();
                        }
                    }
                },200);

            }
        });

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                useranswer(0);
                skipquestions++;
                remainques++;
                updateQuestion();

            }
        });

        answerlater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checklate.add(mquestionnumber-1);
                updateQuestion();
            }
        });

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishtest();
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

                AlertDialog.Builder builder= new AlertDialog.Builder(jmain6.this);
                builder.setTitle("time out").setMessage("would you like to checck answer?");
                builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent in=new Intent(jmain6.this,jmainans6.class);
                        startActivity(in);
                    }
                }).setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent in=new Intent(jmain6.this,jeemain.class);
                        startActivity(in);
                    }
                }).setCancelable(false);
                AlertDialog alertDialog=builder.create();
                alertDialog.show();
            }
        }.start();

        totalquestions=questionlibrary.length;
    }

    private void finishtest() {
        Intent intent=new Intent(jmain6.this,jmainprogress6.class);
        Bundle bundle=new Bundle();
        bundle.putIntArray("youranswer",ans);
        intent.putExtras(bundle);
        jmain6.this.finish();
        startActivity(intent);
    }


    private void updateQuestion() {

        if(mquestionnumber!=questionlibrary.length) {
            remaining.setText("reamaining:"+(questionlibrary.length-remainques));
            questionno.setText("Question no:"+(mquestionnumber+1));
            quesimg.setImageResource(questionlibrary.getQuestions(mquestionnumber));
            choice1.setText(questionlibrary.getChoice1(mquestionnumber));
            choice2.setText(questionlibrary.getChoice2(mquestionnumber));
            choice3.setText(questionlibrary.getChoice3(mquestionnumber));
            choice4.setText(questionlibrary.getChoice4(mquestionnumber));
            manswer = questionlibrary.getCorrectAnswer(mquestionnumber);
            mquestionnumber++;
            if(mquestionnumber==questionlibrary.length)
                answerlater.setVisibility(View.INVISIBLE);
        }
        else {
            if(checklate.size()!=0) {
                checklate();
                choice1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        remainques++;
                        ans[num] = 1;
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

                                if (choice1.getText().equals(questionlibrary.getCorrectAnswer(num))) {
                                    correctanswer++;
                                    mscore = mscore + 4;
                                    checklate();
                                } else {
                                    wronganswer++;
                                    mscore--;
                                    checklate();
                                }
                            }
                        },200);


                    }
                });
                choice2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        remainques++;
                        ans[num] = 2;
                        choice2.setTextColor(getResources().getColor(R.color.black));
                        choice1.setVisibility(View.INVISIBLE);
                        choice3.setVisibility(View.INVISIBLE);
                        choice4.setVisibility(View.INVISIBLE);
                        choice2.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                choice4.setVisibility(View.VISIBLE);
                                choice3.setVisibility(View.VISIBLE);
                                choice1.setVisibility(View.VISIBLE);
                                choice2.setTextColor(getResources().getColor(R.color.white));

                                if (choice2.getText().equals(questionlibrary.getCorrectAnswer(num))) {
                                    correctanswer++;
                                    mscore = mscore + 4;
                                    checklate();
                                } else {
                                    wronganswer++;
                                    mscore--;
                                    checklate();
                                }
                            }
                        },200);

                    }
                });
                choice3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        remainques++;
                        ans[num] = 3;
                        choice3.setTextColor(getResources().getColor(R.color.black));
                        choice2.setVisibility(View.INVISIBLE);
                        choice1.setVisibility(View.INVISIBLE);
                        choice4.setVisibility(View.INVISIBLE);
                        choice3.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                choice2.setVisibility(View.VISIBLE);
                                choice4.setVisibility(View.VISIBLE);
                                choice1.setVisibility(View.VISIBLE);
                                choice3.setTextColor(getResources().getColor(R.color.white));

                                if (choice3.getText().equals(questionlibrary.getCorrectAnswer(num))) {
                                    correctanswer++;
                                    mscore = mscore + 4;
                                    checklate();
                                } else {
                                    wronganswer++;
                                    mscore--;
                                    checklate();
                                }
                            }
                        },200);

                    }
                });
                choice4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        remainques++;
                        ans[num] = 4;
                        choice4.setTextColor(getResources().getColor(R.color.black));
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

                                if (choice4.getText().equals(questionlibrary.getCorrectAnswer(num))) {
                                    correctanswer++;
                                    mscore = mscore + 4;
                                    checklate();
                                } else {
                                    wronganswer++;
                                    mscore--;
                                    checklate();
                                }
                            }
                        },200);

                    }
                });


            }
            else
            {
                remaining.setVisibility(View.INVISIBLE);
                finish.setVisibility(View.VISIBLE);
                time.setVisibility(View.INVISIBLE);
                skip.setVisibility(View.INVISIBLE);
                answerlater.setVisibility(View.INVISIBLE);
                questionno.setVisibility(View.INVISIBLE);
                quesimg.setVisibility(View.INVISIBLE);
                choice1.setVisibility(View.INVISIBLE);
                choice2.setVisibility(View.INVISIBLE);
                choice3.setVisibility(View.INVISIBLE);
                choice4.setVisibility(View.INVISIBLE);
            }
        }
    }


    public void useranswer(int a)
    {
        ans[mquestionnumber-1]=a;

    }
    @Override
    public void onBackPressed()
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(jmain6.this);
        builder.setTitle("quit test?").setMessage("are you sure you want to quit the test?").setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
//                Intent in=new Intent(MainActivity.this,answer.class);
                jmain6.this.finish();
                startActivity(new Intent(jmain6.this,jmainans6.class));
            }
        }).setNegativeButton("no",null).setCancelable(false);
        AlertDialog alert=builder.create();
        alert.show();
    }

    public void checklate()
    {
        if(checklatecounter!=checklate.size()) {
            Integer integer = new Integer(checklate.get(checklatecounter));
            num = integer.intValue();
            remaining.setText("reamaining:"+(questionlibrary.length-remainques));
            questionno.setText("Question no:" + (num + 1));
            quesimg.setImageResource(questionlibrary.getQuestions(num));
            choice1.setText(questionlibrary.getChoice1(num));
            choice2.setText(questionlibrary.getChoice2(num));
            choice3.setText(questionlibrary.getChoice3(num));
            choice4.setText(questionlibrary.getChoice4(num));
            checklatecounter++;
            if(checklatecounter!=checklate.size())
                answerlater.setVisibility(View.INVISIBLE);
        }
        else {

            remaining.setVisibility(View.INVISIBLE);
            finish.setVisibility(View.VISIBLE);
            skip.setVisibility(View.INVISIBLE);
            time.setVisibility(View.INVISIBLE);
            answerlater.setVisibility(View.INVISIBLE);
            questionno.setVisibility(View.INVISIBLE);
            quesimg.setVisibility(View.INVISIBLE);
            choice1.setVisibility(View.INVISIBLE);
            choice2.setVisibility(View.INVISIBLE);
            choice3.setVisibility(View.INVISIBLE);
            choice4.setVisibility(View.INVISIBLE);
        }


    }

}