package com.example.demorxjavaretrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;


import com.example.demorxjavaretrofit.adapter.PhotoCollectionAdapter;
import com.example.demorxjavaretrofit.model.PhotoModel;
import com.example.demorxjavaretrofit.present.MainActivityPresenter;
import com.example.demorxjavaretrofit.present.MainActivityPresenterImpl;

import java.util.List;


public class MainActivity extends AppCompatActivity implements MainActivityPresenter.View {
    RecyclerView recyclerView;
    PhotoCollectionAdapter adapter;
    List<PhotoModel> listData;
    MainActivityPresenter presenter;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rcv_photo);
        presenter=new MainActivityPresenterImpl(this,this);
        presenter.invokeData();

    }

    @Override
    public void initAdapter(Context context, List<PhotoModel> listData) {
        adapter=new PhotoCollectionAdapter(context,listData);
    }

    @Override
    public void initRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }


}