package com.example.calculatorappaiyar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText user_input1, user_input2, answerDisplay;
    private Button addButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void doMath(View v){
        // first make a reference to the EditText by locating its element in the xml file
        EditText user1ET = findViewById(R.id.user_input_1);
        // need to extract the text from EditText and make text uneditable
        // by calling toString() method
        int user_num1 = Integer.parseInt(user1ET.getText().toString());

        EditText user2ET = findViewById(R.id.user_input_2);
        // need to extract the text from EditText and make text uneditable
        // by calling toString() method
        int user_num2 = Integer.parseInt(user2ET.getText().toString());



        double =



}