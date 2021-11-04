package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class MainActivity2 extends AppCompatActivity {
    static double snumber;static double s;
    static double nu1;static double nu3;static double nu5;static double nu7;
    private TextView textView1;private TextView textView2;private TextView textView3;private TextView textView4;
    private TextView textView5;private TextView textView6;private TextView textView7;private TextView textView8;
    private TextView textView9;private TextView textView10;private TextView textView11;private TextView textView12;
    private TextView textViewn1;private TextView textViewn2;private TextView textViewn3;private TextView textViewn4;private TextView textViewn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView1 =(TextView) findViewById(R.id.tv1);textView2 =(TextView) findViewById(R.id.tv2);
        textView3 =(TextView) findViewById(R.id.tv3);textView4 =(TextView) findViewById(R.id.tv4);
        textView5 =(TextView) findViewById(R.id.tv5);textView6 =(TextView) findViewById(R.id.tv6);
        textView7 =(TextView) findViewById(R.id.tv7);textView8 =(TextView) findViewById(R.id.tv8);
        textView9 =(TextView) findViewById(R.id.tv9);textView10 =(TextView) findViewById(R.id.tv10);
        textView11 =(TextView) findViewById(R.id.tv11);textView12 =(TextView) findViewById(R.id.tv12);
        textViewn1 =(TextView) findViewById(R.id.n1);textViewn2 =(TextView) findViewById(R.id.n2);
        textViewn3 =(TextView) findViewById(R.id.n3);textViewn4 =(TextView) findViewById(R.id.n4);
        textViewn5 =(TextView) findViewById(R.id.n5);
        Bundle bundle = getIntent().getExtras();
        nu1 = bundle.getDouble("nu1");
        textView2.setText(String.valueOf(nu1));
        nu3 = bundle.getDouble("nu3");
        textView5.setText(String.valueOf(nu3));
        nu5 = bundle.getDouble("nu5");
        textView8.setText(String.valueOf(nu5));
        nu7 = bundle.getDouble("nu7");
        textView11.setText(String.valueOf(nu7));
        Double nu2 = bundle.getDouble("nu2");
        Double nu4 = bundle.getDouble("nu4");
        Double nu6 = bundle.getDouble("nu6");
        Double nu8 = bundle.getDouble("nu8");
        String st1;double num1;String st2;double num2;
        String st3;double num3;String st4;double num4;
        DecimalFormat df = new DecimalFormat("#.00");

        if(nu1>=90 && nu1<=100)
        {
            st1 = "A+";
            num1 = 4.0;
        }
        else if(nu1>=86)
        {
            st1 = "A-";
            num1 = 3.7;
        }
        else if(nu1>=83)
        {
            st1 = "B+";
            num1 = 3.3;
        }
        else if(nu1>=80)
        {
            st1 = "B";
            num1 = 3.0;
        }
        else if(nu1>=76)
        {
            st1 = "B+";
            num1 = 2.7;
        }
        else if(nu1>=73)
        {
            st1 = "C+";
            num1 = 2.3;
        }
        else if(nu1>=70)
        {
            st1 = "C";
            num1 = 2.0;
        }
        else if(nu1>=66)
        {
            st1 = "C-";
            num1 = 1.7;
        }
        else if(nu1>=63)
        {
            st1 = "C+";
            num1 = 1.3;
        }
        else if(nu1>=60)
        {
            st1 = "D";
            num1 = 1.0;
        }
        else
        {
            st1 = "F";
            num1 = 0;
        }
        if(nu3>=90)
        {
            st2 = "A+";
            num2 = 4.0;
        }
        else if(nu3>=86)
        {
            st2 = "A-";
            num2 = 3.7;
        }
        else if(nu3>=83)
        {
            st2 = "B+";
            num2 = 3.3;
        }
        else if(nu3>=80)
        {
            st2 = "B";
            num2 = 3.0;
        }
        else if(nu3>=76)
        {
            st2 = "B+";
            num2 = 2.7;
        }
        else if(nu3>=73)
        {
            st2 = "C+";
            num2 = 2.3;
        }
        else if(nu3>=70)
        {
            st2 = "C";
            num2 = 2.0;
        }
        else if(nu3>=66)
        {
            st2 = "C-";
            num2 = 1.7;
        }
        else if(nu3>=63)
        {
            st2 = "C+";
            num2 = 1.3;
        }
        else if(nu3>=60)
        {
            st2 = "D";
            num2 = 1.0;
        }
        else
        {
            st2 = "F";
            num2 = 0;
        }
        if(nu5>=90)
        {
            st3 = "A+";
            num3 = 4.0;
        }
        else if(nu5>=86)
        {
            st3 = "A-";
            num3 = 3.7;
        }
        else if(nu5>=83)
        {
            st3 = "B+";
            num3 = 3.3;
        }
        else if(nu5>=80)
        {
            st3 = "B";
            num3 = 3.0;
        }
        else if(nu5>=76)
        {
            st3 = "B+";
            num3 = 2.7;
        }
        else if(nu5>=73)
        {
            st3 = "C+";
            num3 = 2.3;
        }
        else if(nu5>=70)
        {
            st3 = "C";
            num3 = 2.0;
        }
        else if(nu5>=66)
        {
            st3 = "C-";
            num3 = 1.7;
        }
        else if(nu5>=63)
        {
            st3 = "C+";
            num3 = 1.3;
        }
        else if(nu5>=60)
        {
            st3 = "D";
            num3 = 1.0;
        }
        else
        {
            st3 = "F";
            num3 = 0;
        }
        if(nu7>=90)
        {
            st4 = "A+";
            num4 = 4.0;
        }
        else if(nu7>=86)
        {
            st4 = "A-";
            num4 = 3.7;
        }
        else if(nu7>=83)
        {
            st4 = "B+";
            num4 = 3.3;
        }
        else if(nu7>=80)
        {
            st4 = "B";
            num4 = 3.0;
        }
        else if(nu7>=76)
        {
            st4 = "B+";
            num4 = 2.7;
        }
        else if(nu7>=73)
        {
            st4 = "C+";
            num4 = 2.3;
        }
        else if(nu7>=70)
        {
            st4 = "C";
            num4 = 2.0;
        }
        else if(nu7>=66)
        {
            st4 = "C-";
            num4 = 1.7;
        }
        else if(nu7>=63)
        {
            st4 = "C+";
            num4 = 1.3;
        }
        else if(nu7>=60)
        {
            st4 = "D";
            num4 = 1.0;
        }
        else
        {
            st4 = "F";
            num4 = 0;
        }
        double sum1 = num1 + num2 + num3 + num4;//总绩点
        double sum2 = nu2 + nu4 + nu6 + nu8;//总学分
        snumber = (nu1*nu2 + nu3*nu4 + nu5*nu6 + nu7*nu8)/sum2;//加权
        s = ((nu1 - snumber)*(nu1 - snumber)+(nu3 - snumber)*(nu3 - snumber)+(nu5 - snumber)*(nu5 - snumber)+(nu7 - snumber)*(nu7 - snumber))/4;
        String nn3;
        if(snumber>=90)
        {
            nn3 = "A+";
        }
        else if(snumber>=86)
        {
            nn3 = "A-";
        }
        else if(snumber>=83)
        {
            nn3 = "B+";
        }
        else if(snumber>=80)
        {
            nn3 = "B";
        }
        else if(snumber>=76)
        {
            nn3 = "B+";
        }
        else if(snumber>=73)
        {
            nn3 = "C+";
        }
        else if(snumber>=70)
        {
            nn3 = "C";
        }
        else if(snumber>=66)
        {
            nn3 = "C-";
        }
        else if(snumber>=63)
        {
            nn3= "C+";
        }
        else if(snumber>=60)
        {
            nn3 = "D";
        }
        else
        {
            nn3 = "F";
        }
        textViewn4.setText("综合评级："+nn3);
        if(s >= 10)
        {
            textViewn3.setText("稳定性：差");
        }
        else if(s >= 4)
        {
            textViewn3.setText("稳定性：较差");
        }
        else if(s >= 1)
        {
            textViewn3.setText("稳定性：良好");
        }
        else if(s >= 0)
        {
            textViewn3.setText("稳定性：优秀");
        }

        textViewn5.setText("加权平均分："+String.valueOf(df.format(snumber)));
        textViewn2.setText("总绩点："+String.valueOf(df.format(sum1)));
        textViewn1.setText("总学分："+String.valueOf(df.format(sum2)));
        textView1.setText(st1);textView3.setText(String.valueOf(num1));
        textView4.setText(st2);textView6.setText(String.valueOf(num2));
        textView7.setText(st3);textView9.setText(String.valueOf(num3));
        textView10.setText(st4);textView12.setText(String.valueOf(num4));
    }





    public void startActivity3(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
        Bundle bundle = new Bundle();
        bundle.putDouble("snumber",snumber);
        bundle.putDouble("s",s);
        bundle.putDouble("n1",nu1);
        bundle.putDouble("n2",nu3);
        bundle.putDouble("n3",nu5);
        bundle.putDouble("n4",nu7);

        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void bnt(View view) {
        finish();
        startActivity(new Intent(this, MainActivity.class));

    }

}
