package com.example.investment.api.investmentapi.infrastructure.exception;

import com.example.investment.api.global.exception.exceptions.CustomErrorCode;
import com.example.investment.api.global.exception.exceptions.CustomException;

public class ApiServerException extends CustomException {
    public ApiServerException() {
        super(CustomErrorCode.API_SERVER_ERROR);
    }
}
