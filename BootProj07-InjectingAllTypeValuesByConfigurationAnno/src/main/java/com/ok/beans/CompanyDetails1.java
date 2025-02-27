package com.ok.beans;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component("company2")
@Data
public class CompanyDetails1 {
	private String cmpName;
	private String addr;
	private double Cprice;
	
}
