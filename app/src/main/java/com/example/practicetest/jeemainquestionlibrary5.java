package com.example.practicetest;

public class jeemainquestionlibrary5 {
    //here you can change the questions in order
    private int mQuestions[]={
    };

    //here you can change the options in the order of the questions
    private String mchoice[][]={
            {"13.89H","0.138H","1.389H","138.88"},
            {"36 cm towards the mirror","30 cm away from the mirror","30 cm towards the mirror","36 cm away from the mirror"},
            {"-x direction","-z direction","-y direction","+z direction"},
            {"zero","60","30","45"},
    };
    //please type exact correct answer you mentioned above in options without any change
    //here you should change the correct option according to that order
    private String mCorrectAnswer[]={"1.389H","36 cm away from the mirror","-y direction","45"};

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
