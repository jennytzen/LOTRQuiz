package com.example.android.lotrquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultView extends AppCompatActivity {

    public int results = MainActivity.correctAnswers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_result_view);

        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView resultImage = (ImageView) findViewById(R.id.image_result);

        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView resultMessage = (TextView) findViewById(R.id.result_message);
        TextView finalResult = (TextView) findViewById(R.id.final_result);


        if (results > 2) {
            resultImage.setImageResource(R.drawable.charge);
            resultMessage.setText("Victory is yours!!!");
            finalResult.setText(results + "/4");
        } else {
            finalResult.setText(results + "/4");
        }
    }

    /**
     * function that close the app on back button click
     */
    @Override
    public void onBackPressed() {
        Intent a = new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);
    }
}
