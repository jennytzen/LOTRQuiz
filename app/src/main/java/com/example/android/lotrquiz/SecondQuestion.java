package com.example.android.lotrquiz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class SecondQuestion extends AppCompatActivity {

    boolean firstChoiceSelected = false;
    boolean thirdCoiceSelected = false;
    boolean isChecked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_question);
    }

    /**
     * function that called when user click a checkbox
     */
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        isChecked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.first_answer:
                if (isChecked) {
                    firstChoiceSelected = true;
                }
                break;
            case R.id.third_answer:
                if (isChecked) {
                    thirdCoiceSelected = true;
                }
                break;
        }
    }

    /**
     * function that called when user click a next button
     */
    public void thirdQuestion(View view) {
        if (isChecked) {

            if (firstChoiceSelected && thirdCoiceSelected) {
                MainActivity.correctAnswers++;
            }

            Intent intent = new Intent(this, ThirdQuestion.class);
            startActivity(intent);
        } else {
            Context context = getApplicationContext();
            CharSequence text = "Please select an answer!";
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
