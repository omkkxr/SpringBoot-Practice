package com.ok.beans;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component("company1")
@Data
public class CompanyDetails {
	private String name;
	private String location;
	private double price;
}
