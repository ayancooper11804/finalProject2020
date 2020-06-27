package com.example.jokeproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class programmingCate extends AppCompatActivity {

    TextView present;
    TextView jQuestion;
    TextView jAnswer;
    TextView guess;
    Button reveal;

    String[] jokeQuestion;
    String[] jokeAnswer;

    Random r = new Random();

    String answer;
    String question;

    int joke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programming_cate);

        jQuestion = findViewById(R.id.jQuestion);
        jAnswer = findViewById(R.id.jAnswer);
        guess = findViewById(R.id.guess);
        reveal = findViewById(R.id.reveal);
        present = findViewById(R.id.present);

        jAnswer.setVisibility(View.INVISIBLE);

        jokeQuestion = new String[5];
        jokeAnswer = new String[5];

        jokeQuestion[0]="What's the object-oriented way to become wealthy?";
        jokeAnswer[0]="Inheritance.";

        jokeQuestion[1]="What do you call a programmer from Finland?";
        jokeAnswer[1]="Nerdic.";

        jokeQuestion[2]="What is a programmer's favorite hangout place?";
        jokeAnswer[2]="Foo bar.";

        jokeQuestion[3]="What do computers and air conditioners have in common?";
        jokeAnswer[3]="They both become useless when you open windows.";

        joke = r.nextInt(4);

        janda(joke);

        reveal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guess.setVisibility(View.INVISIBLE);
                jAnswer.setVisibility(View.VISIBLE);

            }
        });


    }

    public void janda(int x){
        answer = jokeAnswer[x];
        question = jokeQuestion[x];

        jQuestion.setText(question);
        jAnswer.setText(answer);

    }

}
