package com.example.classsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    //@Override
    String s1_1="物联网控制原理与技术[01] 1-6周,9-16周 (第1-2节) 陶亮,邓晓平 博文馆101[媒159]";
    String s1_3="形势与政策5[19]  12-15周  (第3-4节) 唐建文 博文馆209[媒214]";
    String s1_10="RFID原理及应用（15）[01] 1-6周,9-17周 (第10-12节)潘春伟博文馆213[媒99]";
    String s2_3="传感器原理及技术[01] 1-6周,9-17周 (第3-5节)杨修文外文馆411[媒159]";
    String s2_6="Java语言程序设计[03] 1-6周,9-14周 (第6-7节)宫淑兰博文馆311[媒214]";
    String s3_1="物联网控制原理与技术[01] 1-6周,9-16周 (第1-2节)陶亮,邓晓平博文馆101[媒159]";
    String s3_3="物联网通信技术[01] 1-6周,9-17周 (第3-5节)王玉玲逸夫楼231[媒100";
    String s3_6="Java语言程序设计[03] 1-6周,9-14周 (第6-7节)宫淑兰博文馆401[媒159";
    String s3_10="产品结构艺术造型概论[01] 3-13周 (第10-12节)何东博文馆109[媒214]";
    String s5_6="物联网数据处理[01] 1-6周,9-17周 (第6-8节)李成栋逸夫楼435[媒100";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //定义
        final Button button1_1 = findViewById(R.id.button1_1);
        final Button button1_3 = findViewById(R.id.button1_3);
        final Button button1_10 = findViewById(R.id.button1_10);
        final Button button2_3= findViewById(R.id.button2_3);
        final Button button2_6 = findViewById(R.id.button2_6);
        final Button button3_1 = findViewById(R.id.button3_1);
        final Button button3_3 = findViewById(R.id.button3_3);
        final Button button3_6 = findViewById(R.id.button3_6);
        final Button button3_10 = findViewById(R.id.button3_10);
        final Button button5_6 = findViewById(R.id.button5_6);


        final TextView textview = findViewById(R.id.textView);
        class clearcolor {
            void clearcolorway() {
                button1_1.setBackgroundColor(0x00000000);
                button1_3.setBackgroundColor(0x00000000);
                button1_10.setBackgroundColor(0x00000000);
                button2_3.setBackgroundColor(0x00000000);
                button2_6.setBackgroundColor(0x00000000);
                button3_1.setBackgroundColor(0x00000000);
                button3_3.setBackgroundColor(0x00000000);
                button3_6.setBackgroundColor(0x00000000);
                button3_10.setBackgroundColor(0x00000000);
                button5_6.setBackgroundColor(0x00000000);
                //System.out.println("test()");
            }
        }
        //new A().test();
//            void clearother1(){
//            button1_1.setBackgroundColor(0x00000000);
//            button1_3.setBackgroundColor(0x00000000);
//            button1_10.setBackgroundColor(0x00000000);
//            button2_3.setBackgroundColor(0x00000000);
//            button2_6.setBackgroundColor(0x00000000);
//            button3_1.setBackgroundColor(0x00000000);
//            button3_3.setBackgroundColor(0x00000000);
//            button3_6.setBackgroundColor(0x00000000);
//            button3_10.setBackgroundColor(0x00000000);
//            button5_6.setBackgroundColor(0x00000000);
//        }

        //事件
        button1_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                textview.setText(s1_1);
               // button1_1.setAlpha(0.5);
               // button1_1.setBackground().mutate().setAlpha(20);
                new clearcolor().clearcolorway();
                button1_1.setBackgroundColor(0x4070DB93);
                //button1_1.getBackground().setAlpha(100);
            }
        });
        button1_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                textview.setText(s1_3);
                new clearcolor().clearcolorway();
                button1_3.setBackgroundColor(0x4070DB93);
            }
        });
        button1_10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                textview.setText(s1_10);
                new clearcolor().clearcolorway();
                button1_10.setBackgroundColor(0x4070DB93);
            }
        });
        button2_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                textview.setText(s2_3);
                new clearcolor().clearcolorway();
                button2_3.setBackgroundColor(0x4070DB93);
            }
        });
        button2_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                textview.setText(s2_6);
                new clearcolor().clearcolorway();
                button2_6.setBackgroundColor(0x4070DB93);
            }
        });
        button3_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                textview.setText(s3_1);
                new clearcolor().clearcolorway();
                button3_1.setBackgroundColor(0x4070DB93);
            }
        });
        button3_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                textview.setText(s3_3);
                new clearcolor().clearcolorway();
                button3_3.setBackgroundColor(0x4070DB93);
            }
        });
        button3_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                textview.setText(s3_6);
                new clearcolor().clearcolorway();
                button3_6.setBackgroundColor(0x4070DB93);
            }
        });
        button3_10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                textview.setText(s3_10);
                new clearcolor().clearcolorway();
                button3_10.setBackgroundColor(0x4070DB93);

            }
        });
//        public void button5_6OnClick(View view){
//
//            button3_10.setBackgroundColor(0x4070DB93);
//
//        }
        button5_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                textview.setText(s5_6);
                clearcolor A=new clearcolor();
                        A.clearcolorway();
                button5_6.setBackgroundColor(0x4070DB93);
                //button5_6.setBackgroundColor(0x00000000);
            }
        });


    }
}
