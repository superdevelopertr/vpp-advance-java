package com.ailhanli.ex2;

import java.util.HashMap;
import java.util.Map;

public class Price {

	private Map<String,Double> rates;
	private Double value;
	
	public Price(Double value) {
		this.value = value;
		rates = new HashMap<String,Double>();
		rates.put("USD", 1d);
		rates.put("GBP", 0.6);
		rates.put("EUR", 0.8);
	}
		
	public Double convert(String toCurrency) {
		if (toCurrency.equals("USD")) {
			return value;
		}
		else {
			Double conversion = rates.get("USD") / rates.get(toCurrency);
//			value = conversion * value; //Changing obejct state. That's why it escaping reference
//			return value;
			return conversion * value;//it is better. it can't change object state(data)
		}
	}
	
	public String toString() {
		return this.value.toString();
	}
	
//	public Map<String,Double> getRates() { //better solution is returning spesific rate instead of all rates
//		return Collections.unmodifiableMap(rates);
//	}
	
	public double getRates( String currency ) { //better solution is returning spesific rate instead of all rates
		return rates.get(currency);
	}
	
}
