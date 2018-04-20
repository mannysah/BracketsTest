package org.test.brackets;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.test.brackets.entities.Result;
import org.test.brackets.entities.Player;
import org.test.brackets.entities.Schedule;
import org.test.brackets.entities.Score;
import org.test.brackets.entities.Team;
import org.test.brackets.entities.Wicket;
import org.test.brackets.entities.Role;
import org.test.brackets.model.Home;
import org.test.brackets.model.Point;

import org.test.brackets.services.HomeService;

@RestController
public class HomeController {
	private final AtomicLong counter = new AtomicLong();

	@Autowired
	HomeService homeService;
	
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
		return homeService.getTeamList();
//		List<Team> teams = new ArrayList<>();
//		teams.add(new Team(counter.incrementAndGet(), "Team 1"));
//		teams.add(new Team(counter.incrementAndGet(), "Team 2"));
//		teams.add(new Team(counter.incrementAndGet(), "Team 3"));
//    		
//		return teams;
	}

    @RequestMapping("/leagues")
    public List<Schedule> schedules(Map<String, Object> model) {
		System.out.println("LEAGUE CONTROLLER");
		return homeService.getScheduleList();
//		List<Team> teams = new ArrayList<>();
//		teams.add(new Team(counter.incrementAndGet(), "Team 1"));
//		teams.add(new Team(counter.incrementAndGet(), "Team 2"));
//		teams.add(new Team(counter.incrementAndGet(), "Team 3"));
//    		
//		return teams;
	}
    
    @RequestMapping("/score")
    public List<Score> scores(Map<String, Object> model) {
		System.out.println("Score CONTROLLER");
		return homeService.getScoreList();
//		List<Team> teams = new ArrayList<>();
//		teams.add(new Team(counter.incrementAndGet(), "Team 1"));
//		teams.add(new Team(counter.incrementAndGet(), "Team 2"));
//		teams.add(new Team(counter.incrementAndGet(), "Team 3"));
//    		
//		return teams;
	}
    
    @RequestMapping("/result")
    public List<Result> results(Map<String, Object> model) {
		System.out.println("Result CONTROLLER");
		return homeService.getResultList();
    }
    
    @RequestMapping("/player")
    public List<Player> players(Map<String, Object> model) {
		System.out.println("Player CONTROLLER");
		return homeService.getPlayerList();
    }

//    @RequestMapping("/point")
//    public List<Point> point(Map<String, Object> model) {
//		System.out.println("POINT CONTROLLER");
//		List<Point> points = new ArrayList<>();
//		points.add(new Point(counter.incrementAndGet(), "CSKAmigos"));
//		points.add(new Point(counter.incrementAndGet(), "Scoring Willows"));
//		points.add(new Point(counter.incrementAndGet(), "HCC"));
//		return points;
//	}

    @RequestMapping("/teamTeamName")
    public List<Team> getTeams() {
		System.out.println("PLAYER ENTRY CONTROLLER");
		return homeService.getTeamList();
	}

    @RequestMapping("/playerName")
    public List<Player> getPlayers() {
		System.out.println("Player CONTROLLER");
		return homeService.getPlayerList();
    }

    @RequestMapping("/wicketDescription")
    public List<Wicket> getWickets() {
		System.out.println("Wicket CONTROLLER");
		return homeService.getWicketList();
    }
    @RequestMapping("/roleRoleDescription")
    public List<Role> getRoles() {
		System.out.println("PLAYER ENTRY ROLE CONTROLLER");
		return homeService.getRoleList();
	}

    @RequestMapping("/scheduleScheduleId")
    public List<Schedule> getSchedules() {
		System.out.println("SCORE ENTRY ScheduleID CONTROLLER");
		return homeService.getScheduleList();
	}
    

}