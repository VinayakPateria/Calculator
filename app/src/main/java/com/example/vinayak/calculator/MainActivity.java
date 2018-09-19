package com.example.vinayak.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button zero,one,two,three,four,five,six,seven,eight,nine,divide,multiply,add,subtract,equal,clear;
    private TextView textviewdisplay,textviewcontrol;
    private final char ADDITION= '+';
    private final char SUBTRACTION= '-';
    private final char MULTIPLICATION= '*';
    private final char DIVISION= '/';
    private final char EQU='0';
    private double val1 =Double.NaN;
    private double val2;
    private char ACTION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUIViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            textviewcontrol.setText(textviewcontrol.getText().toString() + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textviewcontrol.setText(textviewcontrol.getText().toString() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textviewcontrol.setText(textviewcontrol.getText().toString() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textviewcontrol.setText(textviewcontrol.getText().toString() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textviewcontrol.setText(textviewcontrol.getText().toString() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textviewcontrol.setText(textviewcontrol.getText().toString() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textviewcontrol.setText(textviewcontrol.getText().toString() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textviewcontrol.setText(textviewcontrol.getText().toString() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textviewcontrol.setText(textviewcontrol.getText().toString() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textviewcontrol.setText(textviewcontrol.getText().toString() + "9");
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=DIVISION;
                textviewdisplay.setText(String.valueOf(val1)+"/");
                textviewcontrol.setText(null);

            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=MULTIPLICATION;
                textviewdisplay.setText(String.valueOf(val1)+"*");
                textviewcontrol.setText(null);

            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=ADDITION;
                textviewdisplay.setText(String.valueOf(val1)+"+");
                textviewcontrol.setText(null);

            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=SUBTRACTION;
                textviewdisplay.setText(String.valueOf(val1)+"-");
                textviewcontrol.setText(null);

            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=EQU;
                textviewdisplay.setText(textviewdisplay.getText().toString()+String.valueOf(val2)+"=" + String.valueOf(val1));
                textviewcontrol.setText(null);

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textviewcontrol.getText().length()>0){
                    CharSequence name=textviewcontrol.getText().toString();
                    textviewcontrol.setText(name.subSequence(0,name.length()-1));
                }
                else {
                    val1=Double.NaN;
                    val2=Double.NaN;
                    textviewcontrol.setText(null);
                    textviewdisplay.setText(null);
                }
            }
        });
    }


    private void setUIViews(){
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        zero=findViewById(R.id.zero);
        add=findViewById(R.id.add);
        subtract=findViewById(R.id.subtract);
        multiply=findViewById(R.id.multiply);
        divide=findViewById(R.id.divide);
        equal=findViewById(R.id.equal);
        clear=findViewById(R.id.clear);
        textviewcontrol=findViewById(R.id.textviewcontrol);
        textviewdisplay=findViewById(R.id.textviewdisplay);


    }
    private void compute(){
        if (!Double.isNaN(val1)){
             val2=Double.parseDouble(textviewcontrol.getText().toString());

             switch (ACTION){
                 case ADDITION:
                    val1= val1+val1;
                    break;

                 case SUBTRACTION:
                     val1= val1-val1;
                     break;
                 case MULTIPLICATION:
                     val1= val1*val1;
                     break;
                 case DIVISION:
                     val1= val1/val1;
                     break;
                 case EQU:

                     break;


             }

        }
        else {
           val1= Double.parseDouble(textviewcontrol.getText().toString());
        }


    }
}
