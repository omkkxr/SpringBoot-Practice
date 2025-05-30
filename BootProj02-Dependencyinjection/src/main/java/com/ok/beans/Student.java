package com.ok.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("std")
public class Student {

	@Autowired
	@Qualifier("courseId")
	private ICourseMaterial material;
	
	public void preparation(String examName) {
		System.out.println("Preparation has started for "+examName);
		String m=material.courseMaterial();
		double price=material.price();
		System.out.println("Preparation is going with"+m+"\nWith price "+price);
	}
}
