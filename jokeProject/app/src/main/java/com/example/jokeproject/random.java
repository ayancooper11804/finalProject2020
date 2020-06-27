package com.example.jokeproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class random extends AppCompatActivity {

    String[] jokeQuestion;
    String[] jokeAnswer;

    Random r = new Random();

    int joke;

    Button reveal;

    TextView jQusetion;
    TextView Janswer;

    String question;
    String answer;

    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);

        jQusetion = findViewById(R.id.jQuestion);
        Janswer = findViewById(R.id.answer);
        editText = findViewById(R.id.guess);
        reveal = findViewById(R.id.reveal);


        jokeQuestion = new String[5];
        jokeAnswer = new String[5];


        jokeQuestion[0] = "Is there a hole in your shoe?";
        jokeAnswer[0] = "No… Then how’d you get your foot in it?";

        jokeQuestion[1] = "How does a dyslexic poet write?";
        jokeAnswer[1] = "Inverse.";

        jokeQuestion[2] = "How does a penguin build it’s house?";
        jokeAnswer[2] = "Igloos it together.";

        jokeQuestion[3] = "Did you hear about the bread factory burning down?";
        jokeAnswer[3] = "They say the business is toast.";

        jokeQuestion[4] = "Why did the programmer quit his job?";
        jokeAnswer[4] = "Because he didn't get arrays.";

        joke = r.nextInt(5);

        janda(joke);


        reveal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setVisibility(View.INVISIBLE);
                Janswer.setVisibility(View.VISIBLE);

            }
        });
















    }

    public void janda(int x){
        answer = jokeAnswer[x];
        question = jokeQuestion[x];

        jQusetion.setText(question);
        Janswer.setText(answer);

    }





}
