package com.ok.beans;

import javax.inject.Named;

@Named("java")
public class JavaCourseMaterial implements ICourseMaterial {

	@Override
	public String courseMaterial() {
		return " 1.OOP's concept. \n2.Exception handling.\n3.Collection freamwork.";
	}
	@Override
	public double price() {		
		return 400;
	}
}
