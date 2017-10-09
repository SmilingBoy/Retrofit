package com.smile.retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiManager.getInstence().getService()
                .login("18463384056", "123456")
                .compose(TransformUtils.<RQResult<LoginData>>defaultSchedulers())
                .subscribe(new MySubscriber<LoginData>());
    }
}
