package com.ok.beans;

import javax.inject.Named;

@Named("UI")
public class UICourseMaterial implements ICourseMaterial {

	@Override
	public String courseMaterial() {
		return " 1.HTML /n2.CSS./n3.JavaScript.";
	}

	@Override
	public double price() {		
		return 200;
	}
}
