package org.test.brackets;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.test.brackets.model.Home;
import org.test.brackets.model.Team;

@RestController
public class HomeController {

	@Value("${welcome.message:test}")
	private String message = "Hello World";
	
	private final AtomicLong counter = new AtomicLong();
	
    @RequestMapping("/home")
    public List<Home> home(Map<String, Object> model) {
    		System.out.println("HOME CONTROLLER");
		
    		List<Home> homes = new ArrayList<>();
    		homes.add(new Home(counter.incrementAndGet(), "Row1"));
    		homes.add(new Home(counter.incrementAndGet(), "Row2"));
    		homes.add(new Home(counter.incrementAndGet(), "Row3"));
    		
		return homes;
	}
    
    @RequestMapping("/teams")
    public List<Team> teams(Map<String, Object> model) {
    		System.out.println("TEAM CONTROLLER");
		
    		List<Team> teams = new ArrayList<>();
    		teams.add(new Team(counter.incrementAndGet(), "Team 1"));
    		teams.add(new Team(counter.incrementAndGet(), "Team 2"));
    		teams.add(new Team(counter.incrementAndGet(), "Team 3"));
    		
		return teams;
	}

}