package com.example.chooser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textOne = findViewById(R.id.evethayir);
        final TextView textTwo = findViewById(R.id.yapyapma);
        final TextView textThree = findViewById(R.id.yazyazma);
        final TextView textFour = findViewById(R.id.soylesoyleme);


        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);

        final String[] chooseOne = {"Evet","Hayır"};
        final String[] chooseTwo = {"Yap","Yapma"};
        final String[] chooseThree = {"Yaz","Yazma"};
        final String[] chooseFour = {"Söyle","Söyleme"};



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rando= (int) (Math.random()*2);
                textOne.setText(chooseOne[rando]);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rando= (int) (Math.random()*2);
                textTwo.setText(chooseTwo[rando]);


            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rando= (int) (Math.random()*2);
                textThree.setText(chooseThree[rando]);

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rando= (int) (Math.random()*2);
                textFour.setText(chooseFour[rando]);
            }
        });


    }
}
