package com.example.investment.api.investmentapi.controller;

import com.example.investment.api.investmentapi.controller.dto.ApiRequest;
import com.example.investment.api.investmentapi.controller.dto.ApiResponse;
import com.example.investment.api.investmentapi.infrastructure.RequesterImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class InvestmentApiController {

    private final RequesterImpl requester;

    @GetMapping(value = "/main", params = "itmsNm")
    public ApiResponse searchStock(@RequestBody ApiRequest request, @RequestParam("itmsNm") String itmsNm){
        return requester.requestStocks(request);
    }

    @PostMapping("/test")
    public ApiResponse test(@RequestBody ApiRequest request) {
        return requester.requestStocks(request);
    }
}
