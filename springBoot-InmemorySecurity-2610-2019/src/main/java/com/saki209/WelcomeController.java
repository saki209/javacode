package com.saki209;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@RequestMapping(path = "/welcome")
	public String welcome() {
		
		return "welcome to spring boot";
	}
}
