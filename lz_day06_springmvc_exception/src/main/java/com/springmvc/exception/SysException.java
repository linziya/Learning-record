package com.springmvc.exception;

public class SysException extends Exception {
    //提示信息
    private String message;

    //用于初始化
    public SysException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
