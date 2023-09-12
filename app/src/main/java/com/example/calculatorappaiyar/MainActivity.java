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
    /* private EditText input1, input2;
    private Button addButton, subtractButton, multiplyButton, divideButton, enterButton;
    private TextView answer; */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* input1 = findViewById(R.id.user_input_1);
        input2 = findViewById(R.id.user_input_2);
        addButton = findViewById(R.id.addition);
        subtractButton = findViewById(R.id.subtraction);
        divideButton = findViewById(R.id.division);
        multiplyButton = findViewById(R.id.multiplication);
        enterButton = findViewById(R.id.enter_button); */


    }

    public void addition(View view) {
        EditText input1ET = findViewById(R.id.user_input_1);
        EditText input2ET = findViewById(R.id.user_input_2);
        TextView display = findViewById(R.id.answer_display);

        try {
            int input1 = Integer.parseInt((input1ET.getText().toString()));
            int input2 = Integer.parseInt((input2ET.getText().toString()));
            int sum = input1 + input2;

            display.setText("" + sum);
        } catch (Exception e) {
            display.setText("Please enter 2 valid numbers");
        }
    }

    public void subtraction(View view) {
        EditText input1ET = findViewById(R.id.user_input_1);
        EditText input2ET = findViewById(R.id.user_input_2);
        TextView display = findViewById(R.id.answer_display);
        try {
            int num1 = Integer.parseInt((input1ET.getText().toString()));
            int num2 = Integer.parseInt((input2ET.getText().toString()));
            int difference = num1 - num2;

            display.setText("" + difference);
        } catch (Exception e) {
            display.setText("Please enter 2 valid numbers");
        }
    }

    public void multiplication(View view) {
        EditText input1ET = findViewById(R.id.user_input_1);
        EditText input2ET = findViewById(R.id.user_input_2);
        TextView display = findViewById(R.id.answer_display);

        try {
            int num1 = Integer.parseInt((input1ET.getText().toString()));
            int num2 = Integer.parseInt((input2ET.getText().toString()));
            int product = num1 * num2;

            display.setText("" + product);
        } catch (Exception e) {
            display.setText("Please enter 2 valid numbers");
        }
    }

    public void division(View view) {
        EditText input1ET = findViewById(R.id.user_input_1);
        EditText input2ET = findViewById(R.id.user_input_2);
        TextView display = findViewById(R.id.answer_display);

        try {
            double num1 = Double.parseDouble(input1ET.getText().toString());
            double num2 = Double.parseDouble(input2ET.getText().toString());
            double result = 0.0;
            if (num2 != 0) {
                result = num1 / num2;
                String roundedResult = String.format("%.3f", result);
                display.setText("" + roundedResult);

            } else {
                display.setText("Cannot divide by 0");
            }
        } catch (Exception e) {
            display.setText("Please enter 2 valid numbers");
        }
    }
    public void allClear(View view) {
        EditText input1ET = findViewById(R.id.user_input_1);
        EditText input2ET = findViewById(R.id.user_input_2);
        TextView display = findViewById(R.id.answer_display);

        input1ET.getText().clear();
        input2ET.getText().clear();
        display.setText(""); // Clear the result TextView as well if needed
    }
    // The sin_function method below takes the users input1 and converts it to radians before taking the sin.
    public void sin_function(View view){
        EditText input1ET = findViewById(R.id.user_input_1);
        TextView display = findViewById(R.id.answer_display);
        double degrees = Double.parseDouble(input1ET.getText().toString());
        double radians = Math.toRadians(degrees);
        double sin_radians = Math.sin(radians);
        String roundedSin = String.format("%.3f", sin_radians); // Line of code given by ChatGPT
        display.setText("" + roundedSin);
    }
    public void modulus(View view) {
        EditText input1ET = findViewById(R.id.user_input_1);
        EditText input2ET = findViewById(R.id.user_input_2);
        TextView display = findViewById(R.id.answer_display);

        try {
            int num1 = Integer.parseInt(input1ET.getText().toString());
            int num2 = Integer.parseInt(input2ET.getText().toString());
            int remainder = 0;
            if (num2 != 0) {
                remainder = num1 % num2;
                String roundedRemainder = String.format("%.3f", remainder);
                display.setText("" + roundedRemainder);

            } else {
                display.setText("Cannot divide by 0");
            }
        } catch (Exception e) {
            display.setText("Please enter 2 valid numbers");
        }
    }
}
