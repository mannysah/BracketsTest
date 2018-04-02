package org.test.brackets;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    
    @RequestMapping("/home")
    public ModelMap home(Map<String, Object> model) {
    	System.out.println("HOME");
		model.put("message", "AM I AT HOME");
		return (ModelMap) model;
	}

    @RequestMapping("/secondPage")
    public String second(Map<String, Object> model) {
    	System.out.println("SSSSSSS");
		model.put("message", "THIS IS SECOND HELLO");
		return "secondPage";
	}

}
