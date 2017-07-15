package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CoinBase {
	private CoinBaseData data;

	public CoinBaseData getData() {
		return data;
	}

	public void setData(CoinBaseData data) {
		this.data = data;
	}

}
 