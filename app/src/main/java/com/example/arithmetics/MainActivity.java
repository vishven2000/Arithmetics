package com.example.arithmetics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText no1,no2;
Button add;
Button sub;
Button mul;
TextView addition;
TextView subtraction;
TextView multiplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        no1=(EditText)findViewById(R.id.no1);
        no2=(EditText)findViewById(R.id.no2);
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        mul=(Button)findViewById(R.id.mul);
        addition=(TextView)findViewById(R.id.addno);
        subtraction=(TextView)findViewById(R.id.subno);
        multiplication=(TextView)findViewById(R.id.mulno);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no11=no1.getText().toString();
                String no22=no2.getText().toString();
                if(TextUtils.isEmpty(no11))
                {
                    no1.setError("Enter First no");
                }
                else if(TextUtils.isEmpty(no22)){
                    no2.setError("Enter Second no");
                }
                else
                {
                    int number1=Integer.parseInt(no11);
                    int number2=Integer.parseInt(no22);

                    int c= number1+number2;
                    addition.setText(""+c);

                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no10=no1.getText().toString();
                String no20=no2.getText().toString();
                if(TextUtils.isEmpty(no10))
                {
                    no1.setError("Enter First no");
                }
                else if(TextUtils.isEmpty(no20)){
                    no2.setError("Enter Second no");
                }
                else {
                    int number15 = Integer.parseInt(no10);
                    int number25 = Integer.parseInt(no20);

                    int d = number15 - number25;
                    subtraction.setText("" + d);
                }   }
        });


        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no11=no1.getText().toString();
                String no21=no2.getText().toString();
                if(TextUtils.isEmpty(no11))
                {
                    no1.setError("Enter First no");
                }
                else if(TextUtils.isEmpty(no21)){
                    no2.setError("Enter Second no");
                }
                else {
                    int number151 = Integer.parseInt(no11);
                    int number251 = Integer.parseInt(no21);

                    int e = number151 * number251;
                    multiplication.setText("" + e);
                }   }
        });


    }
}
