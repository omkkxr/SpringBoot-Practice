package com.ok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.ok.beans.ComanyDetails1;
import com.ok.beans.CompanyDetails;

@SpringBootApplication
public class BootProj05ValueAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj05ValueAnnotationApplication.class, args);
		CompanyDetails c1=ctx.getBean("company1",CompanyDetails.class);
		System.out.println(c1);
		System.out.println("------------------------------------------------------");
		ComanyDetails1 c2=ctx.getBean("company2",ComanyDetails1.class);
				System.out.println(c2);
				
		((ConfigurableApplicationContext) ctx).close();
	}

}
