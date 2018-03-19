package org.test.brackets;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@Value("${welcome.message:test}")
	private String message = "Hello World";
	
    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
    	System.out.println("HHHHHHh");
		model.put("message", this.message);
		return "welcome";
	}

    @RequestMapping("/secondPage")
    public String second(Map<String, Object> model) {
    	System.out.println("SSSSSSS");
		model.put("message", "THIS IS SECOND HELLO");
		return "secondPage";
	}

}
