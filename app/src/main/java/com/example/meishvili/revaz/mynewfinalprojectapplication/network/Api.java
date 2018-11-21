package com.example.meishvili.revaz.mynewfinalprojectapplication.network;

import com.example.meishvili.revaz.mynewfinalprojectapplication.model.login.Login;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Part;
import retrofit2.http.Path;

public interface Api {
    @GET("api/Clients/Login/{username}/{password}")
    Call<Login> getLogin(@Path("username") String username, @Path("password") String password);


}
