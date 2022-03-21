package com.example.demohilt.network;



import com.example.demohilt.model.RecyclerList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetroServiceInterface {

    @GET("repositories")
    Call<RecyclerList> getDataFromGitHubApi(@Query("q") String query);
}
