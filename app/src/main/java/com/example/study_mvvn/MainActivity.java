package com.example.study_mvvn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements QuizView {
    QuizViewModel quizViewModel = new QuizViewModel() ;
    QuizPresenter quizPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);

        quizPresenter = new QuizPresenter(this);

        /*QuizViewModel quizViewModel = ViewModelProviders.of(this).get(QuizViewModel.class);
        quizViewModel.getQuizMutableLiveData().observe(this, new Observer<Quiz>() {
            @Override
            public void onChanged(Quiz quiz) {

            }
        });*/


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quizPresenter.getName();
            }
        });
    }

    @Override
    public void onGetQuizName(String quizName) {
        TextView textView=findViewById(R.id.text_view);
        textView.setText(quizName);
    }
}