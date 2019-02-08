package com.aouhi.rai.model;

import java.io.Serializable;

public class Response implements Serializable {
    private boolean status;
    private String result;

    public Response() {
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
