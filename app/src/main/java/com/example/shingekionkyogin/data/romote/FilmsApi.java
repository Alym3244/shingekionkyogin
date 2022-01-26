package com.example.shingekionkyogin.data.romote;



import com.example.shingekionkyogin.data.models.Film;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface FilmsApi {

    @GET("/films")
    Call<List<Film>> getFilms();

    @GET("/films/{id}")
    Call<Film> getDetailFilms(
            @Path("id") String id
    );

}
