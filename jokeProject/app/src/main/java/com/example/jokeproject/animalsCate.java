package com.example.jokeproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class animalsCate extends AppCompatActivity {

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
        setContentView(R.layout.activity_animals_cate);

        jQuestion = findViewById(R.id.jQuestion);
        jAnswer = findViewById(R.id.jAnswer);
        guess = findViewById(R.id.guess);
        reveal = findViewById(R.id.reveal);
        present = findViewById(R.id.present);

        jAnswer.setVisibility(View.INVISIBLE);

        jokeQuestion = new String[5];
        jokeAnswer = new String[5];

        jokeQuestion[0]="What do you give a sick bird?";
        jokeAnswer[0]="Tweetment.";

        jokeQuestion[1]="What is a cat's favorite color?";
        jokeAnswer[1]="Purrr-ple.";

        jokeQuestion[2]="What time does a duck wake up?";
        jokeAnswer[2]="At the quack of dawn!";

        jokeQuestion[3]="What did the dog say when he sat on sandpaper?";
        jokeAnswer[3]="Ruff";

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
