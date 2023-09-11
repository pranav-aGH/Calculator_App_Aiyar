package com.example.calculatorappaiyar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    EditText user1ET = findViewById(R.id.user_input_1);
    int user_num1 = Integer.parseInt(user1ET.getText().toString());

    EditText user2ET = findViewById(R.id.user_input_2);
    int user_num2 = Integer.parseInt(user2ET.getText().toString());
    TextView answerDisplay = findViewById(R.id.answer_display);
    public void doAddition(View v){
        // first make a reference to the EditText by locating its element in the xml file
        int sum = user_num1 + user_num2;
        answerDisplay.setText(String.valueOf(sum));
    }
    public void doSubtraction(View v) {

        int difference = user_num1 - user_num2;
        answerDisplay.setText(String.valueOf(difference));
    }
    public void doMultiplication(View v) {

        int product = user_num1 * user_num2;
        answerDisplay.setText(String.valueOf(product));
    }
    public void doDivision(View v) {
        if (user_num2 != 0) {
            int result = user_num1/user_num2;
            answerDisplay.setText(String.valueOf(result));
        } else {
            answerDisplay.setText("Cannot divide by zero");
        }
    }

}









