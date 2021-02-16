package com.example.part2_3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Lab3_3Activity extends AppCompatActivity implements View.OnClickListener{

    Button trueBtn;
    TextView targetTextview;
    Button fasleBtn;
    CheckBox checkBox;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_3);
        //View 객체 획득
        trueBtn=findViewById(R.id.btn_visible_true);
        targetTextview=findViewById(R.id.text_visible_target);
        fasleBtn=findViewById(R.id.btn_visible_false);
        //Button 이벤트 등록
        trueBtn.setOnClickListener(this);
        fasleBtn.setOnClickListener(this);

        //CheckBox 객체 등록
        checkBox=findViewById(R.id.checkbox);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                if(isChecked){
                    checkBox.setText("is Checked");
                }else{
                    checkBox.setText("is unChecked");
                }

            }
        });
    }

    // 버튼 이벤트 콜백함수
    @Override
    public  void onClick(View v){
        if(v==trueBtn){
            //trueBtn이 눌리면 targetTextView를 visible 상태로 변경
            targetTextview.setVisibility(View.VISIBLE);
        }else if(v==fasleBtn){
            //falseBtn 눌리면 targetTextView를 invisible 상태로 변경
            targetTextview.setVisibility(View.INVISIBLE);
        }
    }
}