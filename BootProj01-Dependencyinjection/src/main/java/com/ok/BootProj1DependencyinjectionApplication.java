package com.ok;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.ok.beans.WishMessageGenrator;

@SpringBootApplication
public class BootProj1DependencyinjectionApplication {

	@Bean(name = "date")
	public LocalDateTime createLtd() {
		LocalDateTime ltd=LocalDateTime.now();
		return ltd;
	}
	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj1DependencyinjectionApplication.class, args);
		WishMessageGenrator wmg=ctx.getBean("wmg",WishMessageGenrator.class);
		System.out.println(wmg.wishMessage("Omkar"));
	}
}
