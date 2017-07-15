package com.example.demo;

public class PriceResponse {
	private Double coinbase;
	private Double ethexindia;
	private Double percent;
	private Double profit;
	private Double networkFee;
	private Double ethexCommission;
	public Double getProfit() {
		return profit;
	}
	public void setProfit(Double profit) {
		this.profit = profit;
	}
	public Double getCoinbase() {
		return coinbase;
	}
	public void setCoinbase(Double coinbase) {
		this.coinbase = coinbase;
	}
	public Double getEthexindia() {
		return ethexindia;
	}
	public void setEthexindia(Double ethexindia) {
		this.ethexindia = ethexindia;
	}
	public Double getPercent() {
		return percent;
	}
	public void setPercent(Double percent) {
		this.percent = percent;
	}
	public void getNetworkFee(){
		return networkFee;
	}
	public void setNetworkFee(Double networkFee){
		this.networkFee = networkFee;
	}
	public void getEthexCommission(){
		return ethexCommission;
		
	}
	public void setEthexCommission(Double ethexCommission){
		this.ethexCommission = ethexCommission;
	}

}
