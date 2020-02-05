package com.example.sasha.finalsoftware.ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.cs4531.finalsoftware.R;

public class IncorrectActivity extends AppCompatActivity {

    int quizCount;
    int quizScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incorrect);
        final Intent nextQ = new Intent(IncorrectActivity.this, NameQuizActivity.class);
        final Intent resultsActivity = new Intent(IncorrectActivity.this, ResultsActivity.class);


        quizCount = getIntent().getIntExtra("quizCount", 0);
        quizScore = getIntent().getIntExtra("quizScore", 0);

        final Button nextQuestion = (Button) findViewById(R.id.button6);
        if (quizCount == 10) {
            nextQuestion.setText("Quiz Results");
            nextQuestion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    resultsActivity.putExtra("quizCount", quizCount);
                    resultsActivity.putExtra("quizScore", quizScore);
                    startActivity(resultsActivity);

                }
            });
        } else if (quizCount < 10) {
            nextQuestion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    nextQ.putExtra("quizCount", quizCount);
                    nextQ.putExtra("quizScore", quizScore);
                    startActivity(nextQ);
                }
            });
        }
    }
}
