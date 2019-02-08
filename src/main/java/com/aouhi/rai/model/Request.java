package com.aouhi.rai.model;

import java.io.Serializable;

public class Request implements Serializable {

    private String request;

    public Request() { }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    @Override
    public String toString() {
        return "Request{" +
                "Request='" + request + '\'' +
                '}';
    }
}
