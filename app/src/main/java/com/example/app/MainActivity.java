package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    String line = "";
    String prevSign = "";
    String number = "";
    int firstNum = 0;
    int nextNum = 0;
    boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.editTextTextPersonName);
    }


    public void numBtnClick(View v) {
        line = line + ((Button) v).getText().toString();
        textView.setText(line);
        number = number + ((Button) v).getText().toString();
    }

    public void signBtnClick(View v) {
        String sign = ((Button) v).getText().toString();

        if (flag) {
            line = line + sign;
            textView.setText(line);
            firstNum = Integer.parseInt(number);
            number = "";
            prevSign = sign;
            flag = false;
        }

        else {
            if (!sign.equals("=")) {
                nextNum = Integer.parseInt(number);

                if (prevSign.equals("+")) {
                    firstNum = firstNum + nextNum;
                    prevSign = sign;
                    line = line + sign;
                    textView.setText(line);
                }
                if (prevSign.equals("-")) {
                    firstNum = firstNum - nextNum;
                    prevSign = sign;
                    line = line + sign;
                    textView.setText(line);
                }
                if (prevSign.equals("/")) {
                    firstNum = firstNum / nextNum;
                    prevSign = sign;
                    line = line + sign;
                    textView.setText(line);
                }
                if (prevSign.equals("*")) {
                    firstNum = firstNum * nextNum;
                    prevSign = sign;
                    line = line + sign;
                    textView.setText(line);
                }

                number = "";
                number = "";
                number = "";
                number = "";
                number = "";
                number = "";
                number = "";
                number = "";
                number = "";
                nextNum = 0;
                prevSign = sign;
            } else {
                nextNum = Integer.parseInt(number);
                if (prevSign.equals("+")) {
                    firstNum = firstNum + nextNum;
                    textView.setText(Integer.toString(firstNum));
                }
                if (prevSign.equals("-")) {
                    firstNum = firstNum - nextNum;
                    textView.setText(Integer.toString(firstNum));
                }
                if (prevSign.equals("/")) {
                    firstNum = firstNum / nextNum;
                    textView.setText(Integer.toString(firstNum));
                }
                if (prevSign.equals("*")) {
                    firstNum = firstNum * nextNum;
                    textView.setText(Integer.toString(firstNum));
                }
            }
        }
    }



    public void resetBtnClick(View v){
        line = "";
        prevSign = "";
        number = "";
        firstNum = 0;
        nextNum = 0;
        flag = true;
        textView.setText("0");
    }
}

//    public void signBtnClick(View v){
//        line = line + ((Button) v).getText().toString();
//        lin.setText(line);
//        if (resb == 0) {
//            resa = Integer.parseInt(resc);
//        } else {
//            switch (((Button) v).getText().toString()){
//                case "+":
//                    resa = resa + resb;
//                    break;
//            }
//        }
//    }


//    public void makeToast(String text) {
//        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
//    }

