package com.example.part2_3;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Lab3_4Activity extends AppCompatActivity {
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_4);

        //Custom Font 적용
        TextView textView=findViewById(R.id.fontView);
        Typeface typeface=Typeface.createFromAsset(getAssets(), "국립박물관문화재단클래식M.ttf");
        textView.setTypeface(typeface);

        //CheckBod 이벤트 프로그램
        checkBox=findViewById(R.id.checkBox);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                if(isChecked){
                    checkBox.setText("체크함");

                }else{
                    checkBox.setText("체크왜 안함?");
                }
            }
        });

    }
}