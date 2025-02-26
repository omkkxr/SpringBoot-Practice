package com.ok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.ok.beans.BillGenerator;

@SpringBootApplication
public class BootProj05ValueAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj05ValueAnnotationApplication.class, args);
		BillGenerator bill=ctx.getBean("bill",BillGenerator.class);
		System.out.println("Total bill : "+bill);
		
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
