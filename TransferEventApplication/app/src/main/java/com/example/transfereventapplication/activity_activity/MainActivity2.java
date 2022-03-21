package com.example.transfereventapplication.activity_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.transfereventapplication.MainActivity;
import com.example.transfereventapplication.R;

public class MainActivity2 extends AppCompatActivity implements EventListener2{

    private Context context;
    Button btnSecond;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnSecond=findViewById(R.id.btnSecondActivity);
        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,SecondActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }


    @Override
    public void sendDataToActivity(String data) {
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
    }
}