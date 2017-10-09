package com.smile.retrofit;


import java.util.Map;

import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;


/**
 * Created by Smile on 2017/10/9.
 */

public interface MyService {

    /**
     * 登录
     */
    @POST("login")
    @FormUrlEncoded
    Observable<RQResult<LoginData>> login(@Field("phone") String phone, @Field("password") String password);

    /**
     * 登录
     */
    @POST("login")
    @FormUrlEncoded
    <T> Observable<LoginData> login(@FieldMap() Map<String, T> s);

}
