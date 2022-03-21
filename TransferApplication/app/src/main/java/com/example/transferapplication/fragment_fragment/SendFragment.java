package com.example.transferapplication.fragment_fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.transferapplication.R;
import com.example.transferapplication.my_interface.IClick;


public class SendFragment extends Fragment {

    View view;
    Button btnSend;
    EditText editText;
    private IClick iClick;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        iClick= (IClick) getActivity();
    }

    public SendFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_send, container, false);
        btnSend=view.findViewById(R.id.btnSend);
        editText=view.findViewById(R.id.edEmaiSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendDataToFragment2();
            }
        });
        return view;
    }

    private void sendDataToFragment2() {
        String sendEmail = editText.getText().toString().trim();
        iClick.onClickItemUser(sendEmail);
    }
}