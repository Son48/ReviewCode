package com.example.transferapplication.acticity_fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.transferapplication.R;

import java.util.Locale;

public class HomeFragment extends Fragment {

    private EditText edtEmail;
    private Button btnUpdate;
    private MainActivity2 mainActivity2;

    private View view;
    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_home, container, false);
        mainActivity2=(MainActivity2) getActivity();
        initUI();
        return view;
    }

    private void initUI() {
        edtEmail=view.findViewById(R.id.edEmailFragment);
        btnUpdate=view.findViewById(R.id.btnUpdate);

        edtEmail.setText(getArguments().getString("key"));
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendDataToActivity();
            }
        });
    }

    private void sendDataToActivity() {
        String emailUpdate=edtEmail.getText().toString().trim();
        mainActivity2.getEdtEmail().setText(emailUpdate);
    }
}