package br.edu.atitus.api_sample.contollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
	@GetMapping
	public String getGreeting() {
		return "Hello Word";
	}
}
