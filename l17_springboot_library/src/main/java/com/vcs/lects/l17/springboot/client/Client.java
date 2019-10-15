package com.vcs.lects.l17.springboot.client;

import org.springframework.web.client.RestTemplate;

public class Client {

	public static void main(String[] args) {
		RestTemplate rt = new RestTemplate();
		String result = rt.getForObject("", String.class, "42", "21");
		
		
	}
	
	
}
