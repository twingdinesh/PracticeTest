package com.example.practicetest;

public class jeemainquestionlibrary4 {
    //here you can change the questions in order
    private int mQuestions[]= {
            R.drawable.jeefour1,R.drawable.jeefour2,R.drawable.jeefour3,R.drawable.jeefour4,R.drawable.jeefour5,R.drawable.jeefour6,R.drawable.jeefour7,R.drawable.jeefour8,R.drawable.jeefour9,R.drawable.jeefour10,
            R.drawable.jeefour11,R.drawable.jeefour12,R.drawable.jeefour13,R.drawable.jeefour14,R.drawable.jeefour15,R.drawable.jeefour16,R.drawable.jeefour17,R.drawable.jeefour18,R.drawable.jeefour19,R.drawable.jeefour20,
            R.drawable.jeefour21,R.drawable.jeefour22,R.drawable.jeefour23,R.drawable.jeefour24,R.drawable.jeefour25,R.drawable.jeefour26,R.drawable.jeefour27,R.drawable.jeefour28,R.drawable.jeefour29,R.drawable.jeefour30,
            R.drawable.jeefour31,R.drawable.jeefour32,R.drawable.jeefour33,R.drawable.jeefour34,R.drawable.jeefour35,R.drawable.jeefour36,R.drawable.jeefour37,R.drawable.jeefour38,R.drawable.jeefour39,R.drawable.jeefour40,
            R.drawable.jeefour41,R.drawable.jeefour42,R.drawable.jeefour43,R.drawable.jeefour44,R.drawable.jeefour45,R.drawable.jeefour46,R.drawable.jeefour47,R.drawable.jeefour48,R.drawable.jeefour49,R.drawable.jeefour50,
            R.drawable.jeefour51,R.drawable.jeefour52,R.drawable.jeefour53,R.drawable.jeefour54,R.drawable.jeefour55,R.drawable.jeefour56,R.drawable.jeefour57,R.drawable.jeefour58,R.drawable.jeefour59,R.drawable.jeefour60,
            R.drawable.jeefour61,R.drawable.jeefour62,R.drawable.jeefour63,R.drawable.jeefour64,R.drawable.jeefour65,R.drawable.jeefour66,R.drawable.jeefour67,R.drawable.jeefour68,R.drawable.jeefour69,R.drawable.jeefour70,
            R.drawable.jeefour71,R.drawable.jeefour72,R.drawable.jeefour73,R.drawable.jeefour74,R.drawable.jeefour75,

    };

    //here you can change the options in the order of the questions
    private String mchoice[][]={
            {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},
            {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},
            {"13","2","21","23"},{"6","10","5","3"},{"122","23","200","10"},{"5","4","2","1"},{"31.25","6","45.12","45"},
            {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},
            {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},
            {"144","45","43","54"},{"2","3","5","6"},{"2","3","4","5"},{"1900","0","1234","9845"},{"4","3","28","1"},
            {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},
            {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},
            {"2","15.42","1","57"},{"25","485","45","68"},{"2","4","5","78"},{"7.68","4","12","45.12"},{"4","0.75","2","1"},

    };
    //please type exact correct answer you mentioned above in options without any change
    //here you should change the correct option according to that order
    private String mCorrectAnswer[]={
           "1","2","4","4","3","1","3","1","4","2","2","2","1","1","1","4","4","2","4","1",
            "2","10","10","4","6",
            "1","1","1","2","4","2","4","1","2","4","4","3","3","3","4","4","3","2","4","2",
            "144","6","3","1900","28",
            "4","3","3","3","3","4","3","2","2","2","1","2","1","3","1","3","4","2","4","2",
            "2","485","5","4","0.75"
    };

    public int length=mQuestions.length;

    public int getQuestions(int a){
        int question=mQuestions[a];
        return question;
    }
    public String getChoice1(int a){
        String choice0=mchoice[a][0];
        return choice0;
    }
    public String getChoice2(int a){
        String choice1=mchoice[a][1];
        return choice1;
    }
    public String getChoice3(int a){
        String choice2=mchoice[a][2];
        return choice2;
    }
    public String getChoice4(int a){
        String choice3=mchoice[a][3];
        return choice3;
    }
    public String getCorrectAnswer(int a){
        String answer=mCorrectAnswer[a];
        return  answer;
    }

}
