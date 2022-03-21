package com.example.transferapplication.fragment_fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.transferapplication.R;


public class UpdateFragment extends Fragment {

    View view;
    EditText editText2;
    Button btnUpdate;

    public UpdateFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_update, container, false);
        btnUpdate=view.findViewById(R.id.btnUpdate);
        editText2=view.findViewById(R.id.edEmaiUpdate);
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateDataToFragment2();
            }
        });
        return view;
    }

    private void updateDataToFragment2() {
    }
    public void receiveDataFrontFragmentSend(String email){
        editText2.setText(email);
    }
}
