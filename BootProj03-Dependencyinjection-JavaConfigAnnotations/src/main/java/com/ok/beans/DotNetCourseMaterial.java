package com.ok.beans;

import javax.inject.Named;

@Named("dotNet")
public class DotNetCourseMaterial implements ICourseMaterial {

	@Override
	public String courseMaterial() {
		return " 1.C# OOP's concept. /n2.C# Exception handling./n3.C# Collection freamwork.";
	}

	@Override
	public double price() {		
		return 300;
	}
}
