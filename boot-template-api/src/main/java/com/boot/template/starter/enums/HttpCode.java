package com.boot.template.starter.enums;

import lombok.Data;

public enum HttpCode {

    SUCCESS(200, "success"),
    BIZ_ERROR(204, "biz error, no content"),
    BAD_REQUEST(400, "client's request is illegal"),
    FORBIDDEN(403, "forbid request"),
    NOT_FOUND(404, "source not exist");

    private int code;

    private String msg;

    HttpCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

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
}
