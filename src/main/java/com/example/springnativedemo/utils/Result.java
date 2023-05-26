package com.example.springnativedemo.utils;

public class Result<T> {
    private T result;
    private String msg;
    private boolean success;
    private int code;

    public T getResult() {
        return result;
    }

    public String getMsg() {
        return msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public int getCode() {
        return code;
    }

    public Result(T result, String msg, boolean success, int code) {
        this.result = result;
        this.msg = msg;
        this.success = success;
        this.code = code;
    }

    public static Result<?> ok(Object result){
        return new Result<>(result, "操作成功！", true, 200);
    }
    public static Result<?> error(int code, String msg){
        return new Result<>(null, msg, false, code);
    }
}
