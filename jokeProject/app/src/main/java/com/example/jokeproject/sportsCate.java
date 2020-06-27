package com.example.jokeproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class sportsCate extends AppCompatActivity {

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
        setContentView(R.layout.activity_sports_cate);

        jQuestion = findViewById(R.id.jQuestion);
        jAnswer = findViewById(R.id.jAnswer);
        guess = findViewById(R.id.guess);
        reveal = findViewById(R.id.reveal);
        present = findViewById(R.id.present);

        jokeQuestion = new String[5];
        jokeAnswer = new String[5];

        jokeQuestion[0]="Why does a pitcher raise one leg when he throws the ball?";
        jokeAnswer[0]="If he raise them both, he’d fall down.";

        jokeQuestion[1]="Why are basketball players such messy eaters?";
        jokeAnswer[1]="They’re always dribbling";

        jokeQuestion[2]="Why did the football coach go to the bank?";
        jokeAnswer[2]="To get his quarter back.";

        jokeQuestion[3]="Why couldn’t the All-Star football player listen to any music?";
        jokeAnswer[3]="He broke all the records.";

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

//horse

}
