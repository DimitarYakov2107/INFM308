package com.example.nbu_dimitar_yakov_;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nbu_dimitar_yakov_.R;

public class MainActivity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary(); // Create a (object) - instance  of the class

    // Create the variables
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonResult;
    protected Button mButtonQuit;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connect the variables to the views from activity_main.xml
        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonResult = (Button)findViewById(R.id.result);
        mButtonQuit = (Button)findViewById(R.id.quit);

        // Load the question
        updateQuestion();


        //Start of Button Listener for Button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mQuestionNumber == 11) {
                    Toast.makeText(MainActivity.this, "Version 1.0.0 By Dimitar Yakov", Toast.LENGTH_SHORT).show();
                } else {
                    if (mButtonChoice1.getText() == mAnswer) {
                        mScore = mScore + 1;
                        updateScore(mScore);
                        updateQuestion();

                        Toast.makeText(MainActivity.this, ":)", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, ":(", Toast.LENGTH_SHORT).show();
                        updateQuestion();
                    }
                }
            }

        });
        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mQuestionNumber == 11) {
                    openActivityCopyright();
                } else {
                    if (mButtonChoice2.getText() == mAnswer) {
                        mScore = mScore + 1;
                        updateScore(mScore);
                        updateQuestion();

                        Toast.makeText(MainActivity.this, ":)", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, ":(", Toast.LENGTH_SHORT).show();
                        updateQuestion();
                    }
                }
            }
        });
        //End of Button Listener for Button2



        //Start of Button Listener for Button3
        mButtonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if (mScore >= 0 && mScore < 5) {
                        Toast.makeText(MainActivity.this, "0-4: You are NOT satisfied with NBU", Toast.LENGTH_SHORT).show();
                    } else if (mScore > 4 && mScore < 8) {
                        Toast.makeText(MainActivity.this, "5-7: You are satisfied with NBU, but you expected more", Toast.LENGTH_SHORT).show();
                    } else
                        Toast.makeText(MainActivity.this, "8-10: You are satisfied with NBU!", Toast.LENGTH_SHORT).show();
                }
        });
        //End of Button Listener for Button3

        //Start of Button Listener for Button4
        mButtonQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
        //End of Button Listener for Button4
    }

    private void updateQuestion() {
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
            mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));

            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }


    private void updateScore(int point){
        mScoreView.setText("" + mScore);
    }

    private void openActivityCopyright() {
        Intent intent = new Intent(this, CopyrightActivity.class);
        startActivity(intent);
    }
}