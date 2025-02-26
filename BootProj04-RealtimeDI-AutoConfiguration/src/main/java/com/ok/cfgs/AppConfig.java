package com.ok.cfgs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
public class AppConfig {

	@Autowired
	private Environment env;

	@Bean("c3P0Ds")
	public ComboPooledDataSource createDS() throws Exception {
		ComboPooledDataSource c3 = new ComboPooledDataSource();
		System.out.println("AppConfig.createDS() private method ");
		c3.setDriverClass(env.getProperty("spring.datasource.driver-class-name"));
		c3.setJdbcUrl(env.getProperty("spring.datasource.url"));
		c3.setUser(env.getProperty("spring.datasource.username"));
		c3.setPassword(env.getProperty("spring.datasource.password"));
		return c3;
	}
}
