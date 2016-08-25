package com.example.administrator.every_sample.http;

import com.example.administrator.every_sample.bean.BaseBean;
import com.example.administrator.every_sample.bean.MovieBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2016/8/23.
 */
public interface HttpService {
    @GET("top250")
    Observable<BaseBean<String>> login(
            @Query("count[]") String... count);

    @GET("top250")
    Call<MovieBean> getMovie(
            @Query("start")int start,
            @Query("count")int count
    );
}
