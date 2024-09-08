package com.example.investment.api.investmentapi.service;

import com.example.investment.api.investmentapi.controller.dto.ApiRequest;
import com.example.investment.api.investmentapi.controller.dto.ApiResponse;

public interface Requester {

    ApiResponse requestStocks(ApiRequest apiRequest);
}
