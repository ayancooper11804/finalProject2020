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
        title = findViewById(R.id.title);
        select = findViewById(R.id.select);

        //change



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


                toprogramming();

               toProgramming();

            }
        });

        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                tosports();



            }
        });
    }



    public void torandom() {
        Intent toRandom = new Intent(this, random.class);
        startActivity(toRandom);
    }

    public void toanimals(){
        Intent toAnimals = new Intent(this, animalsCate.class);
        startActivity(toAnimals);



    }
    public void toProgramming() {
        Intent toProgramming = new Intent(this, programmingCate.class);
        startActivity(toProgramming);
    }

    public void toSports() {
        Intent toSports = new Intent(this, sportsCate.class);
        startActivity(toSports);
    }


    public void toprogramming(){
        Intent toProgramming = new Intent(this, programmingCate.class);
        startActivity(toProgramming);



    }

    public void tosports(){
        Intent toSports = new Intent(this, sportsCate.class);
        startActivity(toSports);



    }
}
