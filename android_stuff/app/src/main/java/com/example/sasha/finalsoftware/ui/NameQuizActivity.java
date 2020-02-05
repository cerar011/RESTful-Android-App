package com.example.sasha.finalsoftware.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.cs4531.finalsoftware.R;
import com.example.sasha.finalsoftware.model.util.CensusSearcher;

import java.util.Random;

public class NameQuizActivity extends AppCompatActivity {

    private int result;
    private int gender;
    private String sex;
    private int buttonChoice;
    private int wrongChoice1;
    private int wrongChoice2;
    private int wrongChoice3;
    private CensusSearcher censusSearcher;
    public int quizScore;
    public int quizCount;
    TextView qScore;
    TextView qCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        final Intent correctAnswer = new Intent(NameQuizActivity.this, CorrectActivity.class);
        final Intent wrongAnswer = new Intent(NameQuizActivity.this, IncorrectActivity.class);

        qScore = findViewById(R.id.qScore);
        qCount = findViewById(R.id.qCount);
        quizScore = getIntent().getIntExtra("quizScore", 0);
        quizCount = getIntent().getIntExtra("quizCount", 0);
        qScore.setText(String.valueOf(quizScore));
        qCount.setText(String.valueOf(quizCount));

        censusSearcher = new CensusSearcher(this, this);
        questionCreator();
        Button correctButton;
        censusSearcher.getPopularName(result, sex);
        if(buttonChoice==1) {
            correctButton = (Button)findViewById(R.id.button1);
            correctButton.setText(String.valueOf(result));
            correctButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    quizCount++;
                    quizScore++;
                    correctAnswer.putExtra("quizCount", quizCount);
                    correctAnswer.putExtra("quizScore", quizScore);
                    startActivity(correctAnswer);
                }
            });
            Button incorrectButton1 = (Button)findViewById(R.id.button2);
            incorrectButton1.setText(String.valueOf(wrongChoice1));
            incorrectButton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    quizCount++;
                    wrongAnswer.putExtra("quizCount", quizCount);
                    wrongAnswer.putExtra("quizScore", quizScore);
                    startActivity(wrongAnswer);
                }
            });
            Button incorrectButton2 = (Button)findViewById(R.id.button3);
            incorrectButton2.setText(String.valueOf(wrongChoice2));
            incorrectButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    quizCount++;
                    wrongAnswer.putExtra("quizCount", quizCount);
                    wrongAnswer.putExtra("quizScore", quizScore);
                    startActivity(wrongAnswer);
                }
            });
            Button incorrectButton3 = (Button)findViewById(R.id.button4);
            incorrectButton3.setText(String.valueOf(wrongChoice3));
            incorrectButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    quizCount++;
                    wrongAnswer.putExtra("quizCount", quizCount);
                    wrongAnswer.putExtra("quizScore", quizScore);
                    startActivity(wrongAnswer);
                }
            });
        }
        else if(buttonChoice==2){
            correctButton = (Button)findViewById(R.id.button2);
            correctButton.setText(String.valueOf(result));
            correctButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    quizCount++;
                    quizScore++;
                    correctAnswer.putExtra("quizCount", quizCount);
                    correctAnswer.putExtra("quizScore", quizScore);
                    startActivity(correctAnswer);
                }
            });
            Button incorrectButton1 = (Button)findViewById(R.id.button1);
            incorrectButton1.setText(String.valueOf(wrongChoice1));
            incorrectButton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    quizCount++;
                    wrongAnswer.putExtra("quizCount", quizCount);
                    wrongAnswer.putExtra("quizScore", quizScore);
                    startActivity(wrongAnswer);
                }
            });
            Button incorrectButton2 = (Button)findViewById(R.id.button3);
            incorrectButton2.setText(String.valueOf(wrongChoice2));
            incorrectButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    quizCount++;
                    wrongAnswer.putExtra("quizCount", quizCount);
                    wrongAnswer.putExtra("quizScore", quizScore);
                    startActivity(wrongAnswer);
                }
            });
            Button incorrectButton3 = (Button)findViewById(R.id.button4);
            incorrectButton3.setText(String.valueOf(wrongChoice3));
            incorrectButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    quizCount++;
                    wrongAnswer.putExtra("quizCount", quizCount);
                    wrongAnswer.putExtra("quizScore", quizScore);
                    startActivity(wrongAnswer);
                }
            });

        }
        else if(buttonChoice==3){
            correctButton = (Button)findViewById(R.id.button3);
            correctButton.setText(String.valueOf(result));
            correctButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    quizCount++;
                    quizScore++;
                    correctAnswer.putExtra("quizCount", quizCount);
                    correctAnswer.putExtra("quizScore", quizScore);
                    startActivity(correctAnswer);
                }
            });
            Button incorrectButton1 = (Button)findViewById(R.id.button2);
            incorrectButton1.setText(String.valueOf(wrongChoice1));
            incorrectButton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    quizCount++;
                    wrongAnswer.putExtra("quizCount", quizCount);
                    wrongAnswer.putExtra("quizScore", quizScore);
                    startActivity(wrongAnswer);
                }
            });
            Button incorrectButton2 = (Button)findViewById(R.id.button1);
            incorrectButton2.setText(String.valueOf(wrongChoice2));
            incorrectButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    quizCount++;
                    wrongAnswer.putExtra("quizCount", quizCount);
                    wrongAnswer.putExtra("quizScore", quizScore);
                    startActivity(wrongAnswer);
                }
            });
            Button incorrectButton3 = (Button)findViewById(R.id.button4);
            incorrectButton3.setText(String.valueOf(wrongChoice3));
            incorrectButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    quizCount++;
                    wrongAnswer.putExtra("quizCount", quizCount);
                    wrongAnswer.putExtra("quizScore", quizScore);
                    startActivity(wrongAnswer);
                }
            });
        }
        else if(buttonChoice==4){
            correctButton = (Button)findViewById(R.id.button4);
            correctButton.setText(String.valueOf(result));
            correctButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    quizCount++;
                    quizScore++;
                    correctAnswer.putExtra("quizCount", quizCount);
                    correctAnswer.putExtra("quizScore", quizScore);
                    startActivity(correctAnswer);
                }
            });
            Button incorrectButton1 = (Button)findViewById(R.id.button2);
            incorrectButton1.setText(String.valueOf(wrongChoice1));
            incorrectButton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    quizCount++;
                    wrongAnswer.putExtra("quizCount", quizCount);
                    wrongAnswer.putExtra("quizScore", quizScore);
                    startActivity(wrongAnswer);
                }
            });
            Button incorrectButton2 = (Button)findViewById(R.id.button3);
            incorrectButton2.setText(String.valueOf(wrongChoice2));
            incorrectButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    quizCount++;
                    wrongAnswer.putExtra("quizCount", quizCount);
                    wrongAnswer.putExtra("quizScore", quizScore);
                    startActivity(wrongAnswer);
                }
            });
            Button incorrectButton3 = (Button)findViewById(R.id.button1);
            incorrectButton3.setText(String.valueOf(wrongChoice3));
            incorrectButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    quizCount++;
                    wrongAnswer.putExtra("quizCount", quizCount);
                    wrongAnswer.putExtra("quizScore", quizScore);
                    startActivity(wrongAnswer);
                }
            });
        }
    }
    public void questionCreator(){
        Random r = new Random();
        int low = 1880;
        int high = 2008;
        result = r.nextInt(high-low) + low;
        gender = (r.nextInt())%2;
        do {
            buttonChoice = r.nextInt(4);
        }while((buttonChoice < 1)||(buttonChoice >4));
        do{
            wrongChoice1=r.nextInt(high-low) + low;
        }while(wrongChoice1==result);
        do{
            wrongChoice2=r.nextInt(high-low) + low;
        }while(wrongChoice2==result);
        do{
            wrongChoice3=r.nextInt(high-low) + low;
        }while(wrongChoice3==result);
        if(gender==0){
            sex = "boy";
        }
        else{
            sex = "girl";
        }
        Log.d("gender is", sex);
    }
    public void updateGUI(){
        String newname = censusSearcher.getName();
        Log.d("git_sum", "name passed to updateUI: " + newname);
        TextView nameView = (TextView)findViewById(R.id.popNameView);
        nameView.setText(newname);
    }
}
