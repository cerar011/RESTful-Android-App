package com.example.sasha.finalsoftware.ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.cs4531.finalsoftware.R;

public class ResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Button mainMenu = (Button)findViewById(R.id.button5);
        TextView score = (TextView)findViewById(R.id.score);
        int qScore = getIntent().getIntExtra("quizScore", 0);
        score.setText(String.valueOf(qScore));

        final Intent MainMenu = new Intent(ResultsActivity.this, MainActivity.class);

        mainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(MainMenu);

            }
        });
    }
}
