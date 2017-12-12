package com.adobe.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button roll;
        roll=(Button) findViewById(R.id.rollb);
        final ImageView right=findViewById(R.id.right_icon);
        final ImageView left=findViewById(R.id.left);
        final int[] diceArray={R.drawable.dice1,
                         R.drawable.dice2,
                        R.drawable.dice3,
                        R.drawable.dice4,
                        R.drawable.dice5,
                        R.drawable.dice6};

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("dicee","button pressed");
               Random randomNumbergenerator=new Random();
               int number=randomNumbergenerator.nextInt(6);
               Log.d("dicee","the random number is:"+number);
               right.setImageResource(diceArray[number]);
               number=randomNumbergenerator.nextInt(6);
               left.setImageResource(diceArray[number]);


            }
        });




    }
}