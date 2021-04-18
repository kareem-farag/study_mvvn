package com.example.study_mvvn;

public class QuizPresenter {
    QuizView view;

    public QuizPresenter(QuizView view) {
        this.view = view;
    }

    public QuizModel getQuizFromDatabase(){
        return new QuizModel("dsda", "Hi");
    };

    public void getName() {
        view.onGetQuizName(getQuizFromDatabase().getQuizName());
    }
}
