package edu.cnm.deepdive.apod.service;

import edu.cnm.deepdive.apod.model.Apod;
import java.util.Date;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApodService {

  @GET("planetary/apod")
  Call<Apod> get(@Query("api_key") String apiKey, @Query("date") String date);

}