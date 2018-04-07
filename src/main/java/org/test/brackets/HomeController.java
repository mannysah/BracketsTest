package org.test.brackets;

import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.test.brackets.model.Home;

@RestController
public class HomeController {

	@Value("${welcome.message:test}")
	private String message = "Hello World";
	
	private final AtomicLong counter = new AtomicLong();
	
    @RequestMapping("/home")
    public Home home(Map<String, Object> model) {
    	System.out.println("HOME CONTROLLER");
		
		return new Home(counter.incrementAndGet(), message);
	}
}