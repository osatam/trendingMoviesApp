package com.example.trendingmoviesapp.api;

import com.example.trendingmoviesapp.model.MoviesResponse;
import com.example.trendingmoviesapp.util.Constants;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Service {

    @GET(Constants.BASE_URL_ENDPOINT)
    Call<MoviesResponse> getTrendingMovies(@Query(Constants.API_KEY_NAME) String apiKey);

}
