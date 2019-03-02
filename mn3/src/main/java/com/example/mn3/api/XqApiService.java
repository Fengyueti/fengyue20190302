package com.example.mn3.api;

import com.example.mn3.bean.XqBean;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface XqApiService {
    @GET
    Call<XqBean> xqlist(@Url String url, @HeaderMap HashMap<String,String> params, @QueryMap HashMap<String,String> params1);
}
