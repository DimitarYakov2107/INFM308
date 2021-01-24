package com.example.nbu_dimitar_yakov_;

public class QuestionLibrary {

    private String mQuestions [] = {
            "Are you proud of studying in the New Bulgarian University?",
            "Are you satisfied with what you learn in the university?",
            "Will you recommend NBU to your friends?",
            "Are you happy that you study in NBU in stead of other university?",
            "Do you think programming is being taught correctly in NBU?",
            "If you can turn back time, would you choose another university?",
            "Do you think that the quality in teaching is good?",
            "Which is better: New Bulgarian University or Sofia University?",
            "Do you like what you study?",
            "Would you study master's degree in NBU?",
            "Thank you for taking the survey.For results - click on Result/Score info."
    };


    private String mChoices [][] = {
            {"Yes", "No"},
            {"Yes", "No"},
            {"Yes", "No"},
            {"Yes", "No"},
            {"Yes", "No"},
            {"Yes", "No"},
            {"Yes", "No"},
            {"NBU" , "SU"},
            {"Yes", "No"},
            {"Yes", "No"},
            {"App version", "Copyright"}
    };



    private String mCorrectAnswers[] = {"Yes", "Yes", "Yes", "Yes", "Yes", "No", "Yes", "NBU", "Yes", "Yes", "Dimitar", "Yakov"};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }


    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
