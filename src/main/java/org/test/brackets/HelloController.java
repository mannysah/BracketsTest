package org.test.brackets;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.test.brackets.services.HomeService;

@Controller
public class HelloController {

	@Value("${welcome.message:test}")
	private String message = "Hello World";
	
	@Autowired
	HomeService homeService;
	
    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
    	System.out.println("HHHHHHh");
//    	homeService.testspec();

//    	homeService.test();
    	System.out.println("TESTIng SAVE TEAM");
//    	homeService.saveTeam();
    	homeService.pointtest();

    	System.out.println("TESTING END OF SAVE TEAM");
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
