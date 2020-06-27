package com.example.jokeproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView title;
    TextView select;
    Button random;
    Button create;
    Button animals;
    Button programming;
    Button money;
    Button mamma;
    Button knock;
    Button sports;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        random = findViewById(R.id.random);
        animals = findViewById(R.id.animals);
        programming = findViewById(R.id.programming);
        sports = findViewById(R.id.sports);


        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                torandom();
            }
        });


        animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                toanimals();
            }
        });

        programming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // toprogramming();
            }
        });
    }



    public void torandom(){
        Intent toRandom = new Intent(this, random.class);
        startActivity(toRandom);



    }

    public void toanimals(){
        Intent toAnimals = new Intent(this, animalsCate.class);
        startActivity(toAnimals);



    }


}
