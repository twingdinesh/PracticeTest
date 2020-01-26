package com.example.practicetest;

public class questionlibrary {
    //here you can change the questions in order
    public  int mQuestions[]={
            R.drawable.neetone1,R.drawable.neetone2,R.drawable.neetone3,R.drawable.neetone4,R.drawable.neetone5,R.drawable.neetone6,R.drawable.neetone7,R.drawable.neetone8,R.drawable.neetone9,R.drawable.neetone10,R.drawable.neetone11,R.drawable.neetone12,R.drawable.neetone13,R.drawable.neetone14,R.drawable.neetone15,
            R.drawable.neetone16,R.drawable.neetone17,R.drawable.neetone18,R.drawable.neetone19,R.drawable.neetone20,R.drawable.neetone21,R.drawable.neetone22,R.drawable.neetone23,R.drawable.neetone24,R.drawable.neetone25,R.drawable.neetone26,R.drawable.neetone27,R.drawable.neetone28,R.drawable.neetone29,R.drawable.neetone30,
            R.drawable.neetone31,R.drawable.neetone32,R.drawable.qneetone33,R.drawable.neetone34,R.drawable.neetone35,R.drawable.neetone36,R.drawable.neetone37,R.drawable.neetone38,R.drawable.neetone39,R.drawable.neetone40,R.drawable.neetone41,R.drawable.neetone42,R.drawable.neetone43,R.drawable.neetone44,R.drawable.neetone45,
    };

    //here you can change the options in the order of the questions
    private String mchoice[][]={
            {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},
            {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},
            {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},
            {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},
            {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},
};
    //please type exact correct answer you mentioned above in options without any change
    //here you should change the correct option according to that order
    private String mCorrectAnswer[]={
            "3","3","2","1","4","3","4","2","1","4","4","1","3","2","1","3","4","1","2","3",
            "1","3","4","1","1","3","1","4","2","2","4","2","1","4","4","3","1","4","1","4","3","4","2",
            "1","2", "1", "4","4"};


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
