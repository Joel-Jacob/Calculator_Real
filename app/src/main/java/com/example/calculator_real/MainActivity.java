package com.example.calculator_real;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView calculatorText;

    private final int DIVIDE = 0;
    private final int ADD = 1;
    private final int SUBTRACT = 2;
    private final int REMAINDER = 3;
    private final int MULTIPLY = 4;

    private float answerValue = 0.0f;
    private float firstValue = 0.0f;
    private float secondValue = 0.0f;
    private int operator = 0;

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");

        calculatorText = findViewById(R.id.textView);
    }

    private void clearField(){
        calculatorText.setText("0");
        secondValue = 0f;
        firstValue = 0f;
        operator = 0;
        answerValue = 0f;
    }

    private void setOperator(int operator){
        this.operator = operator;
        firstValue = Float.parseFloat(calculatorText.getText().toString());
        calculatorText.setText("0");
    }

    private void calculate(){
        secondValue = Float.parseFloat(calculatorText.getText().toString());

        switch (operator){
            case ADD:
                answerValue = firstValue + secondValue;
                break;
            case SUBTRACT:
                answerValue = firstValue - secondValue;
                break;
            case DIVIDE:
                answerValue = firstValue / secondValue;
                break;
            case REMAINDER:
                answerValue = firstValue % secondValue;
                break;
            case MULTIPLY:
                answerValue = firstValue * secondValue;
                break;
        }

        calculatorText.setText(answerValue+"");
    }


    private void addNumber(int value){
        if(calculatorText.getText().equals("0"))
            calculatorText.setText("");

        calculatorText.setText(calculatorText.getText().toString() + value);
    }

    private void removeNumber(){
        if(calculatorText.getText().toString().trim().length() > 0 && !calculatorText.getText().toString().equals("0"))
            calculatorText.setText(calculatorText.getText().toString().substring(0, calculatorText.length()-1));
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.AC:
                clearField();
                break;

            case R.id.add:
                setOperator(ADD);
                break;

            case R.id.subtract:
                setOperator(SUBTRACT);
                break;

            case R.id.zero_button:
                addNumber(0);
                break;

            case R.id.one_button:
                addNumber(1);
                break;

            case R.id.two_button:
                addNumber(2);
                break;

            case R.id.three_button:
                addNumber(3);
                break;

            case R.id.four_button:
                addNumber(4);
                break;

            case R.id.five_button:
                addNumber(5);
                break;

            case R.id.six_button:
                addNumber(6);
                break;

            case R.id.seven_button:
                addNumber(7);
                break;

            case R.id.eight_button:
                addNumber(8);
                break;

            case R.id.nine_button:
                addNumber(9);
                break;

            case R.id.back_button:
                removeNumber();
                break;

            case R.id.divide:
                setOperator(DIVIDE);
                break;

            case R.id.equals:
                calculate();
                break;

            case R.id.multiply:
                setOperator(MULTIPLY);
                break;

        }
    }
}
