package com.BTC.rpcConnect.entity;

import com.BTC.rpcConnect.rpcData;

public class rpcResult {

    private int code;//请求的状态码

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public rpcData getData() {
        return data;
    }

    public void setData(rpcData data) {
        this.data = data;
    }

    private String msg;//请求的信息
    private rpcData data;//请求的数据
}
