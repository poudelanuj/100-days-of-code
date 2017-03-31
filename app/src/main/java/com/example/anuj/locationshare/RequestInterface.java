package com.example.anuj.locationshare;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by anuj on 3/30/17.
 */

public interface RequestInterface {

    @POST("server/")
    Call<ServerResponse> operation(@Body ServerRequest request);

}
