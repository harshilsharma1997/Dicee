package harshil.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = (Button)findViewById(R.id.rollButton);

        final ImageView LDice=(ImageView)findViewById(R.id.LDice);

        final ImageView RDice=(ImageView)findViewById(R.id.RDice);

        final int diceArray[]={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,
        };
        rollButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.d("Dicee","The button has been pressed!");

                Random rnum=new Random();
                int num1=rnum.nextInt(6);
                int num2=rnum.nextInt(6);
                Log.d("Dicee","The random numbers are: "+ num1   +num2);

                LDice.setImageResource(diceArray[num1]);
                RDice.setImageResource(diceArray[num2]);
            }
        });
    }
}
