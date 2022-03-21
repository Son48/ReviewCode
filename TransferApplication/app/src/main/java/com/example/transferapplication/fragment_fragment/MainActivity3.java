package com.example.transferapplication.fragment_fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.transferapplication.R;
import com.example.transferapplication.my_interface.IClick;

public class MainActivity3 extends AppCompatActivity implements IClick {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.contentFragment1,new SendFragment());
        fragmentTransaction.add(R.id.contentFragment2,new UpdateFragment());
        fragmentTransaction.commit();
    }

    @Override
    public void onClickItemUser(String email) {
        UpdateFragment updateFragment=(UpdateFragment) getSupportFragmentManager().findFragmentById(R.id.contentFragment2);
        updateFragment.receiveDataFrontFragmentSend(email);
    }
}