package com.example.investment.api.investmentapi.controller.dto;

public record ItemResponse(
        String basDt,       // 기준일
        String srtnCd,      // 종목코드
        String isinCd,      // 국제증권식별번호
        String itmsNm,      // 종목명
        String mrktCtg,     // 시장구분
        String clpr,        // 종가
        String vs,          // 대비
        String fltRt,       // 등락률
        String mkp,         // 시가
        String hipr,        // 고가
        String lopr,        // 저가
        String trqu,        // 거래량
        String trPrc,       // 거래대금
        String lstgStCnt,   // 상장주식수
        String mrktTotAmt   // 시가총액
) {
}
