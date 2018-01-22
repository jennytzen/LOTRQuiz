package com.example.android.lotrquiz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ThirdQuestion extends AppCompatActivity {

    boolean rightAnswer = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_question);
    }

    /**
     * function that called when user click a next button
     */
    public void fourthQuestion(View view) {

        EditText name = (EditText) findViewById(R.id.answer_input);
        String value = name.getText().toString();
        String legolas = "LEGOLAS";

        value = value.toUpperCase();

        if (legolas.equals(value)) {
            rightAnswer = true;
            MainActivity.correctAnswers++;
        }

        if (!value.isEmpty()) {
            Intent intent = new Intent(this, FourthQuestion.class);
            startActivity(intent);
        } else {
            Context context = getApplicationContext();
            CharSequence text = "Please give an answer!";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }

    /**
     * Prevents user to go to the previous question
     */
    @Override
    public void onBackPressed() {
    }
}
