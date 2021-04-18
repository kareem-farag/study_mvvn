package com.example.study_mvvn;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class QuizViewModel extends ViewModel {
    MutableLiveData<QuizModel> quizMutableLiveData = new MutableLiveData<>();

    public QuizModel getQuiz() {
        return quiz;
    }

    public void setQuiz(QuizModel quiz) {
        this.quiz = quiz;
    }

    QuizModel quiz ;
    private String name ;


    public MutableLiveData<QuizModel> getQuizMutableLiveData() {
        setQuizMutableLiveData();
        return quizMutableLiveData;
    }

    public void setQuizMutableLiveData() {
        QuizModel newQuiz = new QuizModel("dsda", "Hi");
        quizMutableLiveData.setValue(quiz);
        this.quizMutableLiveData = quizMutableLiveData;
    }
}
