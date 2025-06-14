package org.example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ToDOService {

    @GET("/todos/{id}")
    Call<ToDo> getTodoById(@Path("id") String id);

}