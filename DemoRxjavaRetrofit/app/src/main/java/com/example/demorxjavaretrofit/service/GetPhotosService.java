package com.example.demorxjavaretrofit.service;

import com.example.demorxjavaretrofit.model.PhotoModel;
import com.example.demorxjavaretrofit.model.ResponseModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface GetPhotosService {
    //tạo một interface để cung cấp API
    @GET("v2/5e1597353400005200406612")
    Observable<ResponseModel<List<PhotoModel>>> getPhotos();
}
