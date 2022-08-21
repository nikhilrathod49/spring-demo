package com.example.demo1;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoControllers {

	@GetMapping(value = "/one", produces = MediaType.TEXT_PLAIN_VALUE)
	public String index() {
		return "This is Home page";
	}
}
