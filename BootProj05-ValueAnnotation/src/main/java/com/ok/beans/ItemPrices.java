package com.ok.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("info")
@PropertySource("com/ok/commans/inputs.properties")
public class ItemPrices {

	@Value("${idly.price}")
	public double idlyPrice;
	@Value("${dosa.price}")
	public double dosaPrice;
	@Value("${poha.price}")
	public double pohaPrice;

	@Override
	public String toString() {
		return "ItemPrices [idlyPrice=" + idlyPrice + ", DosaPrice=" + dosaPrice + ", pohaPrice=" + pohaPrice + "]";
	}
}
