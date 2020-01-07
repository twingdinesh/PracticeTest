package com.example.practicetest;
//you can fill jeemain modal test 5
public class neetquestionlibrary5 {

    //here you can change the questions in order
    private String mQuestions[]={
            "neet question 2",
            "neet ques ","hello world","@#helloooo%"
    };
    //here you can change the options in the order of the questions
    private String mchoice[][]={
            {"dhd","dfsd","dsfa","dfas"},
            {"232","333","222","111"},
            {"qqq","eee","r","w"},
            {"1","3","2","5"},
    };

    //here you should change the correct option according to that order
    //your answer should be exactly same as one of your option
    private String mCorrectAnswer[]={"dhd","111","qqq","1"};

    public int length=mQuestions.length;

    public String getQuestions(int a){
        String question=mQuestions[a];
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
