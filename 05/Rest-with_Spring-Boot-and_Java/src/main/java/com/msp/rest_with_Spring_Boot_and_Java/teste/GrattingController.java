package com.msp.rest_with_Spring_Boot_and_Java.teste;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrattingController {

	private static final String template = "Hello, %s!";
	private static final AtomicLong counter = new AtomicLong();
	
	@GetMapping(value = "/gratting")
	public Gratting gratting(@RequestParam(value = "name", defaultValue = "Wolrd") String name) {
		return new Gratting(counter.incrementAndGet(),String.format(template, name) );
	}
}
