package com.example.investment.api.global.exception.exceptions;

import org.springframework.http.HttpStatus;

public enum CustomErrorCode {
    API_SERVER_ERROR (HttpStatus.BAD_REQUEST, "A001", "API 서버 오류입니다.");

    private final HttpStatus httpStatus;
    private final String customCode;
    private final String message;

    CustomErrorCode(HttpStatus httpStatus, String customCode, String message) {
        this.httpStatus = httpStatus;
        this.customCode = customCode;
        this.message = message;
    }

    public HttpStatus getHttpStatus(){
        return httpStatus;
    }

    public String getCustomCode(){
        return customCode;
    }
    public String getMessage() {
        return message;
    }
}
