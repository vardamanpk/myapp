package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EthexIndia {
private String ticker;
private String last_traded_price;
private String bid;
private String ask;
public String getTicker() {
	return ticker;
}
public void setTicker(String ticker) {
	this.ticker = ticker;
}
public String getLast_traded_price() {
	return last_traded_price;
}
public void setLast_traded_price(String last_traded_price) {
	this.last_traded_price = last_traded_price;
}
public String getBid() {
	return bid;
}
public void setBid(String bid) {
	this.bid = bid;
}
public String getAsk() {
	return ask;
}
public void setAsk(String ask) {
	this.ask = ask;
}

}
