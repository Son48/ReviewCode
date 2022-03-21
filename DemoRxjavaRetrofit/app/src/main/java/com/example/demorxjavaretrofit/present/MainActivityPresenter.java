package com.example.demorxjavaretrofit.present;

import android.content.Context;

import com.example.demorxjavaretrofit.model.PhotoModel;

import java.util.List;

public interface MainActivityPresenter {
    void invokeData();
    interface View{
        void initAdapter(Context context, List<PhotoModel> listData);
        void initRecyclerView();
    }

}
