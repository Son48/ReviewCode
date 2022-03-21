package com.example.transfereventapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements EventListener {
    Button button1;
    TextView textView1;
    private EventListener listener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, new SampleFragment()).commit();

        listener =new EventListener() {
            @Override
            public void sendDataToActivity(String data) {
                data="dđ";
            }
        };
    }

    @Override
    public void sendDataToActivity(String data) {
        Toast.makeText(this, data, Toast.LENGTH_LONG).show();

    }
}