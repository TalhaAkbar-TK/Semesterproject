package com.example.keshoessql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btn1 =(Button)findViewById(R.id.btn_bt);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuActivity.this,BTActivity.class);
                finish();
                startActivity(intent);
            }
        });
        btn2 =(Button)findViewById(R.id.btn_cooling);
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuActivity.this,CoolingActivity.class);
                startActivity(intent);
            }
        });
        btn3 =(Button)findViewById(R.id.btn_heating);
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuActivity.this,heatingActivity.class);
                startActivity(intent);
            }
        });
        btn4 =(Button)findViewById(R.id.btn_weather);
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuActivity.this, Status.class);
                startActivity(intent);
            }
        });
    }
}