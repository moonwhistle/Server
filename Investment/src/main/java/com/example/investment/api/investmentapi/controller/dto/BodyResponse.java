package com.example.investment.api.investmentapi.controller.dto;

public record BodyResponse(
        int numOfRows,
        int pageNo,
        int totalCount,
        ItemsResponse items
) {
}
