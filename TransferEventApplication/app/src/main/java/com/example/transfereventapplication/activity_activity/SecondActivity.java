package com.example.transfereventapplication.activity_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.transfereventapplication.EventListener;
import com.example.transfereventapplication.R;

public class SecondActivity extends AppCompatActivity {
    private EventListener2 listener2;
    private MainActivity2 mainActivity2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        listener2=(EventListener2) mainActivity2;
        mainActivity2.sendDataToActivity("ddd");

    }
}