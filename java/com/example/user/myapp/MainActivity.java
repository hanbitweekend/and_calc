package com.example.user.myapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context ctx = MainActivity.this;
        final EditText num = findViewById(R.id.num);

        final TextView result = findViewById(R.id.result);
        // inner class
        class Calc{
            private int num,res; // 인스턴스(의) 변수
            String op;
            /*public void exe(){
                switch (op){
                    case "+": res = num1 + num2; break;
                    case "-":res = num1 - num2; break;
                    case "*":res = num1 * num2; break;
                    case "/":res = num1 / num2;  break;
                }
            }*/
            public void setNum1(int num){this.num=num;}
            public int getNum1(){return this.num;}
            public void setRes(int res){this.res=res;}
            public int getRes(){return this.res;}
            public void setOp(String op){this.op=op;}
            public String getOp(){return this.op;}

        }
        final Calc calc = new Calc();

        findViewById(R.id.plusBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(num.getText().toString());
                Log.d("입력값 1",a+"");
                calc.setNum1(a);
                calc.setOp("+");
                //calc.exe();
            }
        });
        findViewById(R.id.minusBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        findViewById(R.id.multiBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        findViewById(R.id.divBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        findViewById(R.id.equalBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ctx,"덧셈 결과: "+ calc.getRes(),Toast.LENGTH_LONG).show();

            }
        });






    }
}
