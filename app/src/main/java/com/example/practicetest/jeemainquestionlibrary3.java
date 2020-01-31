package com.example.practicetest;
//you can fill jeemain modal test 3
public class jeemainquestionlibrary3 {
    //here you can change the questions in order
    private int mQuestions[]= {
            R.drawable.jeethree1,R.drawable.jeethree2,R.drawable.jeethree3,R.drawable.jeethree4,R.drawable.jeethree5,R.drawable.jeethree6,R.drawable.jeethree7,R.drawable.jeethree8,R.drawable.jeethree9,R.drawable.jeethree10,
            R.drawable.jeethree11,R.drawable.jeethree12,R.drawable.jeethree13,R.drawable.jeethree14,R.drawable.jeethree15,R.drawable.jeethree16,R.drawable.jeethree17,R.drawable.jeethree18,R.drawable.jeethree19,R.drawable.jeethree20,
            R.drawable.jeethree21,R.drawable.jeethree22,R.drawable.jeethree23,R.drawable.jeethree24,R.drawable.jeethree25,R.drawable.jeethree26,R.drawable.jeethree27,R.drawable.jeethree28,R.drawable.jeethree29,R.drawable.jeethree30,
            R.drawable.jeethree31,R.drawable.jeethree32,R.drawable.jeethree33,R.drawable.jeethree34,R.drawable.jeethree35,R.drawable.jeethree36,R.drawable.jeethree37,R.drawable.jeethree38,R.drawable.jeethree39,R.drawable.jeethree40,
            R.drawable.jeethree41,R.drawable.jeethree42,R.drawable.jeethree43,R.drawable.jeethree44,R.drawable.jeethree45,R.drawable.jeethree46,R.drawable.jeethree47,R.drawable.jeethree48,R.drawable.jeethree49,R.drawable.jeethree50,
            R.drawable.jeethree51,R.drawable.jeethree52,R.drawable.jeethree53,R.drawable.jeethree54,R.drawable.jeethree55,R.drawable.jeethree56,R.drawable.jeethree57,R.drawable.jeethree58,R.drawable.jeethree59,R.drawable.jeethree60,
            R.drawable.jeethree61,R.drawable.jeethree62,R.drawable.jeethree63,R.drawable.jeethree64,R.drawable.jeethree65,R.drawable.jeethree66,R.drawable.jeethree67,R.drawable.jeethree68,R.drawable.jeethree69,R.drawable.jeethree70,
            R.drawable.jeethree71,R.drawable.jeethree72,R.drawable.jeethree73,R.drawable.jeethree74,R.drawable.jeethree75,


    };

    //here you can change the options in the order of the questions
    private String mchoice[][]={
            {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},
            {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},
            {"4","3","5","6"},{"4","7","5","3"},{"4","23","200","100"},{"5","4","23","1"},{"31.25","5","45","45.86"},
            {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},
            {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},
            {"4.0","4.5","4.3","54"},{"2","7","5","6"},{"2","3","4","5"},{"72","0","13","45"},{"4","3","2","1"},
            {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},
            {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},
            {"0.5","15.42","15.32","15.47"},{"25","0.5","4.5","68"},{"2","4","5","78"},{"7.68","3","12","45.12"},{"4","7","2","1"},

    };
    //please type exact correct answer you mentioned above in options without any change
    //here you should change the correct option according to that order
    private String mCorrectAnswer[]={
            "2","4","4","3","3","2","3","3","1","3","3","3","3","1","1","3","2","1","2","3",
            "3","4","4","23","5",
            "4","2","3","3","4","1","3","4","2","1","2","3","4","4","4","4","3","2","4","3",
            "4.0","7","5","13","4",
            "1","3","4","4","3","4","4","4","1","3","4","2","2","1","2","3","3","1","1","2",
            "0.5","0.5","2","3","7",
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
