package com.example.practicetest;
//you can fill jeemain modal test 2
public class jeemainquestionlibrary2 {

    //here you can change the options in the order of the questions

    //please type exact correct answer you mentioned above in options without any change
    //here you should change the correct option according to that order
    public int images[]={R.drawable.maintwo1,R.drawable.maintwo2,R.drawable.maintwo3,R.drawable.maintwo4,R.drawable.maintwo5,R.drawable.maintwo6,R.drawable.maintwo7,R.drawable.maintwo8,R.drawable.maintwo9,R.drawable.maintwo10,R.drawable.maintwo11,R.drawable.maintwo12,R.drawable.maintwo13,R.drawable.maintwo14,R.drawable.maintwo15,R.drawable.maintwo16,R.drawable.maintwo17,R.drawable.maintwo18,R.drawable.maintwo19,R.drawable.maintwo20,
            R.drawable.maintwo21,R.drawable.maintwo22,R.drawable.maintwo23,R.drawable.maintwo24,R.drawable.maintwo25,R.drawable.maintwo26,R.drawable.maintwo27,R.drawable.maintwo28,R.drawable.maintwo29,R.drawable.maintwo30,R.drawable.maintwo31,R.drawable.maintwo32,R.drawable.maintwo33,R.drawable.maintwo34,R.drawable.maintwo35,R.drawable.maintwo36,R.drawable.maintwo37,R.drawable.maintwo38,R.drawable.maintwo39,R.drawable.maintwo40,
            R.drawable.maintwo41,R.drawable.maintwo42,R.drawable.maintwo43,R.drawable.maintwo44,R.drawable.maintwo45,R.drawable.maintwo46,R.drawable.maintwo47,R.drawable.maintwo48,R.drawable.maintwo49,R.drawable.maintwo50,R.drawable.maintwo51,R.drawable.maintwo52,R.drawable.maintwo53,R.drawable.maintwo54,R.drawable.maintwo55,R.drawable.maintwo56,R.drawable.maintwo57,R.drawable.maintwo58,R.drawable.maintwo59,R.drawable.maintwo60,
            R.drawable.maintwo61,R.drawable.maintwo62,R.drawable.maintwo63,R.drawable.maintwo64,R.drawable.maintwo65,R.drawable.maintwo66,R.drawable.maintwo67,R.drawable.maintwo68,R.drawable.maintwo69,R.drawable.maintwo70,R.drawable.maintwo71,R.drawable.maintwo72,R.drawable.maintwo73,R.drawable.maintwo74,R.drawable.maintwo75,};
    private String mchoice[][]={

            {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},
            {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},
            {"1324","0120","2201","2203"},{"6","7","5","3"},{"122","23","200","100"},{"5","4","2","1"},{"31.25","15.25","45.12","45.86"},
            {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},
            {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},
            {"32","45","43","54"},{"2","3","5","6"},{"2","3","4","5"},{"53.72","0","12.34","98.45"},{"4","3","2","1"},
            {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},
            {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},
            {"1610","1542","1532","1547"},{"25","48","45","68"},{"2","4","5","78"},{"7.68","45","12","45.12"},{"4","5","2","1"},

          };
    private String mCorrectAnswer[]={"1","1","2","3","4","1","4","4","1","2","4","4","4","1","1","1","1","4","1","3",
    "0120","7","200","5","31.25",
            "1","3","4","3","4","2","3","4","3","3","2","4","1","1","1","4","4","1","4","3",
    "45","3","2","53.72","4",
            "2","4","3","4","2","3","1","4","1","4","2","4","2","4","1","3","4","2","4","4",
    "1610","48","2","7.68","4"};

    public int length=images.length;

    public int getQuestions(int a){
        int question=images[a];
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
