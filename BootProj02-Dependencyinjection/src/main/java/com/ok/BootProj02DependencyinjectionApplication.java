package com.ok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.ok.beans.Student;

@SpringBootApplication
@ImportResource("com/ok/cfgs/applicationContext.xml")
public class BootProj02DependencyinjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj02DependencyinjectionApplication.class, args);
		Student st=ctx.getBean("std",Student.class);
		st.preparation("CTS-interview");
	}

}
