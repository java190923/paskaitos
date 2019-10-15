package com.vcs.lects.l17.springboot.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WelcomeController {

	@Autowired
	private HttpServletRequest request;

	@GetMapping
	public String hi() {

		return "<html><body><a href='http://" + request.getLocalName() + ":" + request.getLocalPort()
				+ "/swagger-ui.html'>Swagger UI</a></body></html>";
	}

}
