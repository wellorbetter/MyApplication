package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputType;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MainActivity extends AppCompatActivity {
    public class InputFilterMinMax implements InputFilter{
        private float min, max;

        public InputFilterMinMax(float min, float max) {
            this.min = min;

            this.max = max;

        }



        public InputFilterMinMax(String min, String max) {
            this.min = Float.valueOf(min);

            this.max = Float.valueOf(max);

        }

        @Override

        public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
            try {
//限制小数点位数

                if (source.equals(".") && dest.toString().length() == 0) {
                    return "0.";

                }
                String speChat="[`~!@#$%^&*()+=|{}':;',\\[\\]<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
                Pattern pattern = Pattern.compile(speChat);
                Matcher matcher = pattern.matcher(source.toString());
                if(matcher.find()){
                    Toast.makeText(MainActivity.this,"不能输入空格等非法字符！",Toast.LENGTH_SHORT).show();
                    return "";}
                if (source.equals(" ")) {
                    Toast.makeText(MainActivity.this,"不能输入空格等非法字符！",Toast.LENGTH_SHORT).show();
                    return "";
                }
                if (dest.toString().contains(".")) {
                    int index = dest.toString().indexOf(".");

                    int mlength = dest.toString().substring(index).length();

                    if (mlength == 3) {
                        Toast.makeText(MainActivity.this,"输入的小数不能超过两位",Toast.LENGTH_SHORT).show();
                        return "";

                    }

                }

//限制大小

                float input = Float.valueOf(dest.toString() + source.toString());

                if (isInRange(min, max, input))


                    return null;Toast.makeText(MainActivity.this,"输入的范围出错了！成绩的范围为0~100，学分的范围为0~6！",Toast.LENGTH_SHORT).show();

            } catch (Exception nfe) { }


            return "";
        }

        private boolean isInRange(float a, float b, float c) {
            return b > a ? c >= a && c <= b : c >= b && c <= a;

        }

    }

    private static final int DECIMAL_DIGITS = 2;
    static String n1; static double num1;static String n2; static double num2;
    static String n3; static double num3;static String n4; static double num4;
    static String n5; static double num5;static String n6; static double num6;
    static String n7; static double num7;static String n8; static double num8;

    EditText editText1;EditText editText2;EditText editText3;EditText editText4;
    EditText editText5;EditText editText6;EditText editText7;EditText editText8;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=findViewById(R.id.ed1);editText2=findViewById(R.id.ed2);
        editText3=findViewById(R.id.ed3);editText4=findViewById(R.id.ed4);
        editText5=findViewById(R.id.ed5);editText6=findViewById(R.id.ed6);
        editText7=findViewById(R.id.ed7);editText8=findViewById(R.id.ed8);
        button = findViewById(R.id.btn);
        editText1.setFilters(new InputFilter[]{new InputFilterMinMax(0,100)});
        editText3.setFilters(new InputFilter[]{new InputFilterMinMax(0,100)});
        editText5.setFilters(new InputFilter[]{new InputFilterMinMax(0,100)});
        editText7.setFilters(new InputFilter[]{new InputFilterMinMax(0,100)});
        editText2.setFilters(new InputFilter[]{new InputFilterMinMax(0,6)});
        editText4.setFilters(new InputFilter[]{new InputFilterMinMax(0,6)});
        editText6.setFilters(new InputFilter[]{new InputFilterMinMax(0,6)});
        editText8.setFilters(new InputFilter[]{new InputFilterMinMax(0,6)});

    }





    public void bn(View v) {

        if (TextUtils.isEmpty(editText1.getText()) || TextUtils.isEmpty(editText2.getText()) || TextUtils.isEmpty(editText3.getText()) || TextUtils.isEmpty(editText4.getText()) ||
                TextUtils.isEmpty(editText5.getText()) || TextUtils.isEmpty(editText6.getText()) || TextUtils.isEmpty(editText7.getText()) || TextUtils.isEmpty(editText8.getText())) {
            Toast.makeText(MainActivity.this, "未输入完成！", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            Bundle bundle = new Bundle();
            n1 = ((EditText) findViewById(R.id.ed1)).getText().toString();
            num1 = Double.parseDouble(n1);
            bundle.putDouble("nu1", num1);
            n2 = ((EditText) findViewById(R.id.ed2)).getText().toString();
            num2 = Double.parseDouble(n2);
            bundle.putDouble("nu2", num2);
            n3 = ((EditText) findViewById(R.id.ed3)).getText().toString();
            num3 = Double.parseDouble(n3);
            bundle.putDouble("nu3", num3);
            n4 = ((EditText) findViewById(R.id.ed4)).getText().toString();
            num4 = Double.parseDouble(n4);
            bundle.putDouble("nu4", num4);
            n5 = ((EditText) findViewById(R.id.ed5)).getText().toString();
            num5 = Double.parseDouble(n5);
            bundle.putDouble("nu5", num5);
            n6 = ((EditText) findViewById(R.id.ed6)).getText().toString();
            num6 = Double.parseDouble(n6);
            bundle.putDouble("nu6", num6);
            n7 = ((EditText) findViewById(R.id.ed7)).getText().toString();
            num7 = Double.parseDouble(n7);
            bundle.putDouble("nu7", num7);
            n8 = ((EditText) findViewById(R.id.ed8)).getText().toString();
            num8 = Double.parseDouble(n8);
            bundle.putDouble("nu8", num8);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }

}