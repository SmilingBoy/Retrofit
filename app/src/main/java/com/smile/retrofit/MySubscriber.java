package com.smile.retrofit;

import android.app.Dialog;
import android.content.Context;

import rx.Subscriber;

public abstract class MySubscriber<T> extends Subscriber<RQResult<T>> {

    private Dialog dialog;
    private Context context;

    public MySubscriber() {
        super();
    }

    public MySubscriber(Context context) {
        super();
        this.context = context;
    }

    @Override
    public void onCompleted() {

        if (context != null) {
            if (dialog == null) {
                dialog = new Dialog(context);
            }
            dialog.dismiss();
        }
    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onNext(RQResult<T> rqResult) {

        if (rqResult.getStatus() ==1) {
            handleSuccess(rqResult);
        }else if (rqResult.getStatus()==-1){
            handleFail(rqResult);
        }

    }

    @Override
    public void onStart() {
        super.onStart();

        if (context != null) {
            if (dialog == null) {
                dialog = new Dialog(context);
            }
            dialog.show();
        }
    }

    abstract void handleSuccess(RQResult<T> rqResult);

    public void handleFail(RQResult<T> rqResult){

    }

}