package com.example.investment.api.investmentapi.controller.dto;

import java.util.List;

public record ItemsResponse(
        List<ItemResponse> item
) {
}
