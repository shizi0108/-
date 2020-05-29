package com.baidu.common.resp;


public class ResponseResult {

    //操作是否成功
    boolean success = true;

    //操作代码
    int code = 1000;

    //提示信息
    String message;

    //数据
    private Object result;

    public ResponseResult(boolean success, int code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public static ResponseResult SUCCESS(){
        return new ResponseResult(true,10000,"操作成功");
    }
    public static ResponseResult FAIL(){
        return new ResponseResult(false,1111,"操作失败");
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
