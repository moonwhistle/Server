package com.example.investment.api.investmentapi.infrastructure;

import com.example.investment.api.investmentapi.controller.dto.ApiRequest;
import com.example.investment.api.investmentapi.controller.dto.ApiResponse;
import com.example.investment.api.investmentapi.infrastructure.exception.ApiServerException;
import com.example.investment.api.investmentapi.service.Requester;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RequiredArgsConstructor
@Component
@Slf4j
public class RequesterImpl implements Requester {
    private static final String URL = "https://apis.data.go.kr/1160100/service/GetStockSecuritiesInfoService/getStockPriceInfo";
    private static final String X_API_KEY = "6vkAL8btLG4h51Af2JRQ5LUXImyRng8XzbfVmG1K7n2Vw0sY0D6BZmVUkVghiGzoR5pAHvnKdL5Xmrtw2fXDZw==";

    private final RestTemplate restTemplate;

    @Override
    public ApiResponse requestStocks(ApiRequest request) {
        try {
            return getApiResponse(request.itmsNm());
        } catch (Exception e) {
            throw new ApiServerException();
        }
    }

    private ApiResponse getApiResponse(String itmsNm) {
        URI url = getStockSearchRequestUrl(itmsNm);
        HttpHeaders httpHeaders = getHttpHeaders();
        ResponseEntity<ApiResponse> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                new HttpEntity<>(httpHeaders),
                ApiResponse.class
        );

        log.info("API Response: {}", response.getBody());
        return response.getBody();
    }

    private URI getStockSearchRequestUrl(String itmsNm) {
        return UriComponentsBuilder.fromUriString(URL)
                .queryParam("serviceKey", X_API_KEY)
                .queryParam("numOfRows", 1)
                .queryParam("pageNo", 1)
                .queryParam("resultType", "json")
                .queryParam("itmsNm", itmsNm)
                .build()
                .toUri();
    }


    private HttpHeaders getHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }
}
