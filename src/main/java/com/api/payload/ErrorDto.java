package com.api.payload;


import java.util.Date;

public class ErrorDto {
    private String msg;
    private Date date;
    private String uri;

    public ErrorDto(String msg, Date date, String uri) {
        this.msg = msg;
        this.date = date;
        this.uri = uri;
    }

    public String getMsg() {
        return msg;
    }

    public Date getDate() {
        return date;
    }

    public String getUri() {
        return uri;
    }
}
