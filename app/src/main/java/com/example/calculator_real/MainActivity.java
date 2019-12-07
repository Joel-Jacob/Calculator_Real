package com.example.calculator_real;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView calculatorText;

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");

        calculatorText = findViewById(R.id.textView);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    public void onButtonClick(View view){
        String newText = "";
        switch (view.getId())
        {
            case R.id.one_button:
                newText = calculatorText.getText().toString().trim()+1;
                calculatorText.setText(newText);
                break;

            case R.id.two_button:
                newText = calculatorText.getText().toString().trim()+1;
                calculatorText.setText(newText);
                break;

            case R.id.three_button:
                newText = calculatorText.getText().toString().trim()+1;
                calculatorText.setText(newText);
                break;

            case R.id.four_button:
                newText = calculatorText.getText().toString().trim()+1;
                calculatorText.setText(newText);
                break;

            case R.id.five_button:
                newText = calculatorText.getText().toString().trim()+1;
                calculatorText.setText(newText);
                break;

            case R.id.six_button:
                newText = calculatorText.getText().toString().trim()+1;
                calculatorText.setText(newText);
                break;

            case R.id.seven_button:
                newText = calculatorText.getText().toString().trim()+1;
                calculatorText.setText(newText);
                break;

            case R.id.eight_button:
                newText = calculatorText.getText().toString().trim()+1;
                calculatorText.setText(newText);
                break;

            case R.id.nine_button:
                newText = calculatorText.getText().toString().trim()+1;
                calculatorText.setText(newText);
                break;

            case R.id.zero_button:
                newText = calculatorText.getText().toString().trim() + 1;
                if(!newText.equals("0")) {
                    newText = newText+0;
                    calculatorText.setText(newText);
                }
                break;

        }
    }
}
