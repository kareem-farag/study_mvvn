package com.example.study_mvvn;

import java.util.List;

public class QuizModel {
    private String quizName ;
    private String quizAnswers;

    public QuizModel(String quizName, String quizAnswers) {
        this.quizName = quizName;
        this.quizAnswers = quizAnswers;
    }

    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public String getQuizAnswers() {
        return quizAnswers;
    }

    public void setQuizAnswers(String quizAnswers) {
        this.quizAnswers = quizAnswers;
    }
}
