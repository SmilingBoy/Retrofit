package com.smile.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HRetrofitNetHelper {
    public static HRetrofitNetHelper mInstance;
    public Retrofit mRetrofit;
    public static final String BASE_URL = "http://demob.ishuangniu.com/index.php/Api/JftxUser3/";

    private HRetrofitNetHelper() {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static HRetrofitNetHelper getInstance() {
        if (mInstance == null) {
            synchronized (HRetrofitNetHelper.class) {
                if (mInstance == null)
                    mInstance = new HRetrofitNetHelper();
            }
        }
        return mInstance;
    }
}