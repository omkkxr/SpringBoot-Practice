package com.ok.beans;

import javax.inject.Inject;
import javax.inject.Named;

@Named("std")
public class Student {

	@Inject
	@Named("courseId")
	private ICourseMaterial material;
	
	public void preparation(String examName) {
		System.out.println("Preparation has started for "+examName);
		String m=material.courseMaterial();
		double price=material.price();
		System.out.println("Preparation is going with"+m+"\nWith price "+price);
	}
}
