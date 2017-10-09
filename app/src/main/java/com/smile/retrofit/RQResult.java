package com.smile.retrofit;

/**
 * Created by Smile on 2017/10/9.
 */

public class RQResult<T> {

    /**
     * status : 0
     * msg : 账号或密码不能为空！
     * result : null
     */

    private int status;
    private String msg;
    private T result;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
