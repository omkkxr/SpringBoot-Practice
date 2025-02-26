package com.ok.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("bill")
public class BillGenerator {
	@Value("#{info.idlyPrice+info.dosaPrice+info.pohaPrice}")
	private double total;
	@Autowired
	private ItemPrices items;

	@Override
	public String toString() {
		return "BillGenerator [total=" + total + ", items=" + items + "]";
	}
}
