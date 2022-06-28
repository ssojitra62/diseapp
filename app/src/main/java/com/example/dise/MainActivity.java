package com.example.dise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button rolls;
    TextView rtxt1;
    ImageView dice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rolls = findViewById(R.id.rolls);
        rtxt1 = findViewById(R.id.txt1);
        dice = findViewById(R.id.dice);

         rolls.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 roll();
             }

             private void roll() {
                 int rollnumber = (int)(Math.random() * 6 + 1);

                switch (rollnumber){
                    case 1 :
                        rtxt1.setText("one");
                        dice.setImageResource(R.drawable.dice1);
                        Toast.makeText(MainActivity.this, "one", Toast.LENGTH_SHORT).show();
                        break;

                    case 2 :
                        rtxt1.setText("two");
                        dice.setImageResource(R.drawable.dice2);
                        Toast.makeText(MainActivity.this, "two", Toast.LENGTH_SHORT).show();
                        break;

                    case 3 :
                        rtxt1.setText("three");
                        dice.setImageResource(R.drawable.dice3);
                        Toast.makeText(MainActivity.this, "three", Toast.LENGTH_SHORT).show();
                        break;

                    case 4 :
                        rtxt1.setText("four");
                        dice.setImageResource(R.drawable.dice4);
                        Toast.makeText(MainActivity.this, "four", Toast.LENGTH_SHORT).show();
                        break;

                    case 5 :
                        rtxt1.setText("five");
                        dice.setImageResource(R.drawable.dice5);
                        Toast.makeText(MainActivity.this, "five", Toast.LENGTH_SHORT).show();
                        break;

                    case 6 :
                        rtxt1.setText("six");
                        dice.setImageResource(R.drawable.dice6);
                        Toast.makeText(MainActivity.this, "six", Toast.LENGTH_SHORT).show();
                        break;

                    default:
                        rtxt1.setText("empty");
                        dice.setImageResource(R.drawable.emptydice);
                        Toast.makeText(MainActivity.this, "empty", Toast.LENGTH_SHORT).show();
                        break;


                }


             }
         });


    }
}