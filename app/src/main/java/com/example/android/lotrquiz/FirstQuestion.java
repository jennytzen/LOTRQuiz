package com.example.android.lotrquiz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class FirstQuestion extends AppCompatActivity {

    public boolean isChecked = false;
    public boolean rightAnswer = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question);
    }

    /**
     * function that called when user click a radio button
     */
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        isChecked = ((RadioButton) view).isChecked();

        // Check if the right answer was selected
        if (view.getId() == R.id.second_answer && isChecked){
            rightAnswer = true;
            MainActivity.correctAnswers++;
        }
    }

    /**
     * function that called when user click a next button
     */
    public void secondQuestion(View view){
        if (isChecked){
            Intent intent = new Intent(this, SecondQuestion.class);
            startActivity(intent);
        }else{
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
    public void onBackPressed(){}
}
