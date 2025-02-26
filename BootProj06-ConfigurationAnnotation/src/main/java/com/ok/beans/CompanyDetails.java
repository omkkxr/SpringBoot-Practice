package com.ok.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("company1")
@Data
@ConfigurationProperties(prefix="nit.org")

public class CompanyDetails {
	private String name;
	private String location;
	private double price;
}
