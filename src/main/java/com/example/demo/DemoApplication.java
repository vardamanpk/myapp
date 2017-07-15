package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class DemoApplication {

	@RequestMapping("/")
    @ResponseBody
    PriceResponse home() {
		HttpHeaders headers = new HttpHeaders();
    	PriceResponse response=new PriceResponse();
    	headers.set("user-agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36");

    	HttpEntity<String> entityReq = new HttpEntity<String>("parameters", headers);
    	Integer percentage=0;
    	RestTemplate restTemplate = new RestTemplate();
    	ResponseEntity<EthexIndia> ethex = restTemplate.exchange("https://ethexindia.com/api/ticker",HttpMethod.GET,entityReq, EthexIndia.class);
        CoinBase coinBase = restTemplate.getForObject("https://api.coinbase.com/v2/prices/ETH-INR/buy", CoinBase.class);
        Double cb=Double.valueOf(coinBase.getData().getAmount());
        Double ex=Double.valueOf(ethex.getBody().getBid());
        Double profit = ex-cb;
        Double percent = (profit*100)/cb;
        response.setCoinbase(cb);
        response.setEthexindia(ex);
        response.setPercent(percent);
        response.setProfit(profit);
        return response;
    }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
