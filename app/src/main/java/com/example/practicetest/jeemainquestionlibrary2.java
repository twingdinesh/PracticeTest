package com.example.practicetest;
//you can fill jeemain modal test 2
public class jeemainquestionlibrary2 {
    //here you can change the questions in order
    private String mQuestions[]={
            "jee main question 1 The magnetic potential energy stored iin certain induction is 25MJ.when the current in the inductors is 60Ma.this inductors is of inductance",
            "An object is placed at a distance of 40cm towards the mirrors,the displacement of the image will be",
            "An em wave is proagating in a medium with a velocity V=Vi.The instantaneous oscillating electric field of this em wave is along +y axis.then the direction  of oscillating magnetic field of the em wave will be along",
            "The refractivee index of the material of a prism is 2 and the angle of the prism is 30deg.One of the two refracting surface of the prism is made a mirror inwards,by silver coating.a beam of monochromatic light entering the prism from the other face will retrace its path(after reflection from the silvered surface)if its angle of incidence on the prism is"
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
