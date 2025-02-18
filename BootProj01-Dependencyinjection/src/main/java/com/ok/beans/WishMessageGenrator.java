package com.ok.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenrator {

	@Autowired
	private LocalDateTime date;
	
	public WishMessageGenrator() {
		System.out.println("WishMessageGenrator.WishMessageGenrator() :: constructor");
	}
	public String wishMessage(String user) {
		int hr = date.getHour();
		if (hr < 12) {
			return user + " Good Morning !";
		} else if (hr < 16) {
			return user + " Good Afternoon !";
		} else if (hr < 20) {
			return user + " Good Evening !";
		} else {
			return  user+" Good Night !";
		}
	}
}
