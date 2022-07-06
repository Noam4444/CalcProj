package com.example.calcproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvOp;
   TextView tvResult;
    EditText etNum1,etNum2;
    Button btPlus;
    Button btMinus;
    Button btkafel;
    Button bthalek;
    Button btClear;
    Button btWorth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult=findViewById(R.id.tvRes);
        etNum1=findViewById((R.id.etNum1));
        etNum2=findViewById((R.id.etNum2));
        btPlus=findViewById(R.id.btPlus);
        btMinus=findViewById(R.id.btMinus);
        btkafel=findViewById(R.id.btKafel);
        bthalek=findViewById(R.id.btHalek);
        btWorth=findViewById(R.id.btWorth);
        btClear=findViewById(R.id.btClear);
        tvOp=findViewById(R.id.tvOP);
    }


    public void Calculation(View v) {
        String st1=etNum1.getText().toString();
        String st2=etNum2.getText().toString();
        if(st1.length()>0&&st2.length()>0){
        Double num1=Double.valueOf(st1);
        Double num2=Double.valueOf(st2);
        if(v==btPlus)
        {
           btWorth.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   if (v == btWorth) {
                       tvResult.setText("" + (num1 + num2));
                       tvOp.setText("+");
                   }
               }
           });

           }
           else if(v==btMinus)
            {
                btWorth.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (v == btWorth) {
                            tvResult.setText("" + (num1 - num2));
                            tvOp.setText("-");
                        }
                    }
                });

            }

        else if(v==btkafel)
        {
            btWorth.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (v == btWorth) {
                        tvResult.setText("" + (num1 * num2));
                        tvOp.setText("*");
                    }
                }
            });

        }
        else if(v==bthalek)
        {
            btWorth.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (v == btWorth) {
                       if(num2==0){
                         tvResult.setText("Error");
                       }
                       else {
                           tvResult.setText("" + (num1 / num2));
                           tvOp.setText("/");
                       }
                    }
                }
            });
        }
        else if(v==btClear)
        {
            btClear.clearAnimation();

        }


      }
        else {
            Toast.makeText(MainActivity.this,"Please,fill all numbers",Toast.LENGTH_LONG).show();
        }
    }

    public void Clen(View view) {
        tvResult.setText(" ");
        etNum1.setText(" ");
        etNum2.setText("");
        tvOp.setText("");
    }
}