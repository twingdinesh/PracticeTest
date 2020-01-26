package com.example.practicetest;
//you can fill jeemain modal test 1
public class jeemainquestionlibrary1 {

    private int imageues[]={R.drawable.jmone1,R.drawable.jmone2,R.drawable.jmone3,R.drawable.jmone4,R.drawable.jmone5,R.drawable.jmone6,R.drawable.jmone7,R.drawable.jmone8,R.drawable.jmone9,R.drawable.jmone10,R.drawable.jmone11,R.drawable.jmone12,R.drawable.jmone13,R.drawable.jmone14,R.drawable.jmone15,R.drawable.jmone16,R.drawable.jmone17,R.drawable.jmone18,R.drawable.jmone19,R.drawable.jmone20,
                        R.drawable.jmone21,R.drawable.jmone22,R.drawable.jmone23,R.drawable.jmone24,R.drawable.jmone25,R.drawable.jmone26,R.drawable.jmone27,R.drawable.jmone28,R.drawable.jmone29,R.drawable.jmone30,R.drawable.jmone31,R.drawable.jmone32,R.drawable.jmone33,R.drawable.jmone34,R.drawable.jmone35,R.drawable.jmone36,R.drawable.jmone37,R.drawable.jmone38,R.drawable.jmone39,R.drawable.jmone40,
                        R.drawable.jmone41,R.drawable.jmone42,R.drawable.jmone43,R.drawable.jmone44,R.drawable.jmone45,R.drawable.jmone46,R.drawable.jmone47,R.drawable.jmone48,R.drawable.jmone49,R.drawable.jmone50,R.drawable.jmone51,R.drawable.jmone52,R.drawable.jmone53,R.drawable.jmone54,R.drawable.jmone55,R.drawable.jmone56,R.drawable.jmone57,R.drawable.jmone58,R.drawable.jmone59,R.drawable.jmone60,
                        R.drawable.jmone61,R.drawable.jmone62,R.drawable.jmone63,R.drawable.jmone64,R.drawable.jmone65,R.drawable.jmone66,R.drawable.jmone67,R.drawable.jmone68,R.drawable.jmone69,R.drawable.jmone70,R.drawable.jmone71,R.drawable.jmone72,R.drawable.jmone73,R.drawable.jmone74,R.drawable.jmone75,};
    private String mchoice[][]={
            {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},
            {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},
            {"7","3","1","9","4"},{"4.36","1.70","2.70","9.70"},{"3","4","5","2"},{"0.12","1.12","6.56","3.66"},{"1","2","7","5"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},
            {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},
            {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"2","3","5","6"},{"88","45","54","78"},{"40","50","32","34"},{"1.32","0.16","8.23","5.23"},{"5","4","3","2"},
            {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},
            {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},
            {"53","2","33","54"},{"13","24","64","34"},{"21","38","43","433"},{"1.5","2.3","3.3","4.5"},{"1","2","3","4"},
    };
    //please type exact correct answer you mentioned above in options without any change
    //here you should change the correct option according to that order
    private String mCorrectAnswer[]={
    "4","2","1","1","2","2","2","1","4","4","1","2","1","1","3","3","1","1","3","1",
    "9","1.70","4","0.12","5","1","1","3","3","2","2","2","2","2","3","3","1","4","2", "1",
            "3","4","2","2","1","3","88","50","0.16","3","3","1","3","4","3","2","4","3","3", "4",
            "4","4","3","3","4","4","3","2","1","3","53","64","38","4.5","1"};


    public int length=imageues.length;

    public int getQuestions(int a){
        int question=imageues[a];
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
