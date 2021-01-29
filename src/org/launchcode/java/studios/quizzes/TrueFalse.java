package org.launchcode.java.studios.quizzes;

import java.util.Locale;

public class TrueFalse {

    //Variables
    private String question;
    private String answer;

    //Constructors
    public TrueFalse(String aQuestion, String aAnswer) {
        this.question = aQuestion;
        this.answer = aAnswer;
    }

    //Get/set
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    //Methods
    public int isCorrect(String inputAnswer) {
        int score = 0;
        if(inputAnswer.toLowerCase().equals(answer)) {
            score ++;
            return score;
        }
    }
}
