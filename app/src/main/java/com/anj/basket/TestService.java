package com.anj.basket;

import java.util.List;

import retrofit.http.GET;

/**
 * Created by Jimmy on 4/22/15.
 */
public interface TestService {
    @GET("/test")
    public List<Test> getTests();
}
