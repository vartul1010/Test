package com.example.testapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface API {

    String BASE_URL = "https://api.data.gov.in";

    @Headers({
            "cache-control: no-cache",
            "content-type: text/json",
            "expires: 0",
            "pragma: no-cache"
    })
    @GET("https://api.data.gov.in/resource/f17274ef-4bf3-4390-88ad-4bf80a4d6bd0?api-key=579b464db66ec23bdd000001cdd3946e44ce4aad7209ff7b23ac571b" +
            "&format=json&offset=0&limit=200")
    Call<MyPojo> getResponse();
}
