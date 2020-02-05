package com.example.sasha.finalsoftware.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.cs4531.finalsoftware.R;

public class MainActivity extends LoginActivity {
    //SignOut Button
    Button GsignOut;

    //these are used to initialize score and quiz count to 0
    public int quizScore = 0;
    public int quizCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent quizIntent = new Intent(MainActivity.this, NameQuizActivity.class);

        Button buttonToCompare = findViewById(R.id.compButton);
        Button buttonToSearch = findViewById(R.id.searchButton);
        Button buttonToQuiz = findViewById(R.id.quizButton);
        Button buttonToWildcard = findViewById(R.id.wildcardButton);

        buttonToCompare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CompareNameActivity.class));
            }
        });

        buttonToSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SearchActivity.class));
            }
        });

        buttonToWildcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, WildcardActivity.class));
            }
        });

        buttonToQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quizIntent.putExtra("quizCount", quizCount);
                quizIntent.putExtra("quizScore", quizScore);
                startActivity(quizIntent);
            }
        });

        GsignOut = findViewById(R.id.SignOut);
        Gsignout();
    }

    public void switchToNamesListed(View myView) {
        Intent myIntent = new Intent(this, NamesListedActivity.class);
        startActivity(myIntent);
    }

    private void Gsignout(){
        mGoogleSignInClient.signOut();
        GsignOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });
        //    startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }
}
