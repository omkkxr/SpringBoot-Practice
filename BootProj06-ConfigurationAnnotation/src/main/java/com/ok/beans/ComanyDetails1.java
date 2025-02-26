package com.ok.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("company2")
public class ComanyDetails1 {

	@Value("${nit.org.name}")
	private String cmpName;
	@Value("${nit.org.location}")
	private String addr;
	@Value("${nit.org.price}")
	private double Cprice;
	@Override
	public String toString() {
		return "ComanyDetails1 [cmpName=" + cmpName + ", addr=" + addr + ", Cprice=" + Cprice + "]";
	}
}
