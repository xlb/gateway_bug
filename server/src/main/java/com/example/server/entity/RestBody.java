package com.example.server.entity;

/**
 * @Author: xulb
 * @Date: 2020/4/8 15:57
 */

public class RestBody  {
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    String msg;
    Object data;
    Integer code;
}
