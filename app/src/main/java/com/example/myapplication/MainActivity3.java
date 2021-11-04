package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
     private TextView textView1;private TextView textView2;private TextView textView3;
     private TextView textView4;private TextView textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView1 =(TextView) findViewById(R.id.v1);textView2 =(TextView) findViewById(R.id.v2);
        textView3 =(TextView) findViewById(R.id.v3);textView4 =(TextView) findViewById(R.id.v4);
        textView5 =(TextView) findViewById(R.id.v5);
        Bundle bundle = getIntent().getExtras();
        double snumber = bundle.getDouble("snumber");
        double s = bundle.getDouble("s");
        double n1 = bundle.getDouble("n1");
        double n2 = bundle.getDouble("n2");
        double n3 = bundle.getDouble("n3");
        double n4 = bundle.getDouble("n4");
        if(snumber >= 90)
        {
            textView1.setText("你的成绩优秀，请继续努力，保持下去！");
        }
        if(snumber < 90 && snumber >= 85 && s < 1)
        {
            textView1.setText("你的成绩良好，发挥稳定，加油，你离优秀只有一步的距离了！");
        }
        if(snumber < 90 && snumber >= 85 && s >= 1)
        {
            textView1.setText("你的成绩良好，但是成绩并不稳定，存在一定的偏科，多注意偏科的学科！你离优秀很近了！");
        }
        if(snumber < 85 && snumber >= 75 && s > 1 && s <= 4)
        {
            textView1.setText("你的成绩一般，存在一定的偏科，多注意偏科的学科！需要多加努力！");
        }
        if(snumber < 85 && snumber >= 75 && s > 4)
        {
            textView1.setText("你的成绩一般，可能是偏科拖累了你，多注意偏科的学科！加油！");
        }
        if(snumber < 85 && snumber >= 75 && s <= 1)
        {
            textView1.setText("你的成绩一般，需要多加努力才能追上优秀的人，加油！");
        }
        if(snumber < 74 && snumber >= 60 && s >= 4)
        {
            textView1.setText("你的成绩有点差，偏科有点严重，多注意偏科的学科！多加努力！还能抢救！");
        }if(snumber < 74 && snumber >= 60 && s < 4)
        {
            textView1.setText("你的成绩有点差,需要特别努力才能追上优秀的人！还能抢救！");
        }
        if(snumber < 60)
        {
            textView1.setText("你的成绩很差，要是再继续这样的话神仙也救不了你了！从现在开始努力还来得及！加油！");
        }
        if(n1 >= 90)
        {
            textView2.setText("数学:\n你的成绩优秀，继续保持！");
        }
        else if(n1 >= 85)
        {
            textView2.setText("数学:\n你的成绩良好，继续努力！");
        }
        else if(n1 >= 75)
        {
            textView2.setText("数学:\n你的成绩一般，多加努力！");
        }
        else if(n1 >= 60)
        {
            textView2.setText("数学:\n你快挂科了，要特别努力了！");
        }
        else if(n1 < 60)
        {
            textView2.setText("数学:\n你挂科了，快抢救一下！");
        }
        if(n2 >= 90)
        {
            textView3.setText("语文:\n你的成绩优秀，继续保持！");
        }
        else if(n2 >= 85)
        {
            textView3.setText("语文:\n你的成绩良好，继续努力！");
        }
        else if(n2 >= 75)
        {
            textView3.setText("语文:\n你的成绩一般，多加努力！");
        }
        else if(n2 >= 60)
        {
            textView3.setText("语文:\n你快挂科了，要特别努力了！");
        }
        else if(n2 < 60)
        {
            textView3.setText("语文:\n你挂科了，快抢救一下！");
        }
        if(n3 >= 90)
        {
            textView4.setText("英语:\n你的成绩优秀，继续保持！");
        }
        else if(n3 >= 85)
        {
            textView4.setText("英语:\n你的成绩良好，继续努力！");
        }
        else if(n3 >= 75)
        {
            textView4.setText("英语:\n你的成绩一般，多加努力！");
        }
        else if(n3 >= 60)
        {
            textView4.setText("英语:\n你快挂科了，要特别努力了！");
        }
        else if(n3 < 60)
        {
            textView4.setText("英语:\n你挂科了，快抢救一下！");
        }
        if(n4 >= 90)
        {
            textView5.setText("计算机:\n你的成绩优秀，继续保持！");
        }
        else if(n4 >= 85)
        {
            textView5.setText("计算机:\n你的成绩良好，继续努力！");
        }
        else if(n4 >= 75)
        {
            textView5.setText("计算机:\n你的成绩一般，多加努力！");
        }
        else if(n4 >= 60)
        {
            textView5.setText("计算机:\n你快挂科了，要特别努力了！");
        }
        else if(n4 < 60)
        {
            textView5.setText("计算机:\n你挂科了，快抢救一下！");
        }

    }
    public void bnt1(View view) {
        finish();
        startActivity(new Intent(this, MainActivity2.class));

    }
}