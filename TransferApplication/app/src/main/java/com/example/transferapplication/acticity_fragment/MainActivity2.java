package com.example.transferapplication.acticity_fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.transferapplication.R;
import com.example.transferapplication.my_interface.IClick;

public class MainActivity2 extends AppCompatActivity   {

    EditText edtEmail;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        edtEmail=findViewById(R.id.edEmail);
        btnSend=findViewById(R.id.btnSend);


        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendDataToFragment();
            }


        });
    }
    private void sendDataToFragment() {
        String email=edtEmail.getText().toString().trim();

        HomeFragment homeFragment=new HomeFragment();
        Bundle bundle=new Bundle();
        bundle.putString("key",email);
        homeFragment.setArguments(bundle);

        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.contentFragment,homeFragment);
        fragmentTransaction.commit();
    }



    public EditText getEdtEmail() {
        return edtEmail;
    }


}