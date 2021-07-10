package com.example.keshoessql;

import android.content.Intent;
import android.hardware.SensorEvent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;


public class Status<sensorManager, triggerEventListener, sensor> extends AppCompatActivity {
    Button b5;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);
        b5 =(Button)findViewById(R.id.btn5);
        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Status.this,MenuActivity.class);
                finish();
                startActivity(intent);
            }
        });
    }

    public void onSensorChanged(SensorEvent event)
    {


        float alpha = (float) 0.8;

        float[] gravity = new float[0];
        gravity[0] = alpha * gravity[0] + (1 - alpha) * event.values[0];
        gravity[1] = alpha * gravity[1] + (1 - alpha) * event.values[1];
        gravity[2] = alpha * gravity[2] + (1 - alpha) * event.values[2];

        float[] linear_acceleration = new float[0];
        linear_acceleration[0] = event.values[0] - gravity[0];
        linear_acceleration[1] = event.values[1] - gravity[1];
        linear_acceleration[2] = event.values[2] - gravity[2];
    }}
