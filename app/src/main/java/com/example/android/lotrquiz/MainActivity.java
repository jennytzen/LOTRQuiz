package com.example.android.lotrquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static int correctAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * function that change current layout to the first question layout
     */
    public void startQuiz(View view) {
        Intent intent = new Intent(this, FirstQuestion.class);
        startActivity(intent);
    }

    /**
     * Prevents user to go to the previous question
     */
    @Override
    public void onBackPressed() {
    }
}