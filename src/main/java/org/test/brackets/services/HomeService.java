package org.test.brackets.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.criteria.Predicate;
import javax.sql.DataSource;

import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.brackets.entities.Field;
import org.test.brackets.entities.Player;
import org.test.brackets.entities.Result;
import org.test.brackets.entities.Role;
import org.test.brackets.entities.Schedule;
import org.test.brackets.entities.Score;
import org.test.brackets.entities.Team;
import org.test.brackets.entities.Wicket;
import org.test.brackets.model.Point;
import org.test.brackets.repositories.FieldRepository;
import org.test.brackets.repositories.PlayerRepository;
import org.test.brackets.repositories.ResultRepository;
import org.test.brackets.repositories.RoleRepository;
import org.test.brackets.repositories.ScheduleRepository;
import org.test.brackets.repositories.ScoreRepository;
import org.test.brackets.repositories.TeamRepository;
import org.test.brackets.repositories.WicketRepository;
import org.test.brackets.specification.PointSpecification;
import org.test.brackets.specification.ScheduleSpecification;
import org.test.brackets.specification.TeamSpecification;
import org.test.brackets.specification.BattingSpecification;
import org.test.brackets.specification.BowlingSpecification;

@Service("homeService")
public class HomeService {

	@Autowired
	DataSource dataSource; 
	
	@Autowired
	FieldRepository fieldRepository;
	
	@Autowired
	TeamRepository teamRepository;
	
	@Autowired
	ScheduleRepository scheduleRepository;
	
	@Autowired
	WicketRepository wicketRepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	@Autowired
	PlayerRepository playerRepository;
	
	@Autowired
	ResultRepository resultRepository;
	
	@Autowired
	ScoreRepository scoreRepository;
	
	@Autowired
	TeamSpecification teamSpec;
	
	@Autowired
	ScheduleSpecification scheduleSpec;
	
	@Autowired
	PointSpecification pointSpec;

	@Autowired
	BattingSpecification battingSpec;

	@Autowired
	BowlingSpecification bowlingSpec;

//	public List<Schedule> getScheduleList()
//	{
//		System.out.println("PRINTING SCHEDULE1 findAll --------------------");
//		Predicate schedules = scheduleSpec.toPredicate();
//		for (Schedule schedule : schedules) {
//            System.out.println(schedule);
//            System.out.println(schedule.getId());
//            System.out.println(schedule.getScheduleTime());
//            System.out.println(schedule.getScheduleMatchName());
//            System.out.println(schedule.getScheduleGroundId());
//            System.out.println(schedule.getScheduleTeam1GroupId());
//            System.out.println(schedule.getScheduleTeam2GroupId());
//            System.out.println(schedule.getScheduleComments());
//        }
//
//		System.out.println("PRINTING SCHEDULE findAll -------------------- ENDING ------"); 
//
//		return Lists.newArrayList(schedules);
//
//	}

	public String testspec()
	{
		System.out.println("INSIDE TEAM BEFOR SPEC");
//		teamSpec.toPredicate();
//		System.out.println("INSIDE TEAM AFTER SPEC");
//		System.out.println("INSIDE TEST BEFOR SPEC");
//		scheduleSpec.toPredicate();
//		System.out.println("INSIDE TEST AFTER SPEC");
//		System.out.println("INSIDE POINT BEFOR SPEC");
		pointSpec.toPredicate();
//		System.out.println("INSIDE POINT AFTER SPEC");
//		System.out.println("INSIDE BATTING BEFOR SPEC");
//		battingSpec.toPredicate();
//		System.out.println("INSIDE BATTING AFTER SPEC");
		System.out.println("INSIDE BOWLING BEFOR SPEC");
		bowlingSpec.toPredicate();
		System.out.println("INSIDE BOWLING AFTER SPEC");
		return "HelloHomeService";
	}

	public String pointtest() 
	{
		System.out.println("PRINTING Pointtest TEAM from Spec --------------------");
		
		Iterable<Point> predicate = extracted();
		System.out.println("outside spec before iterate Home Service");
		System.out.println(predicate);
		Iterable<Point> points = predicate;
		System.out.println("outside spec after points Home Service");
		System.out.println(points);
		System.out.println("outside spec after points display Home Service");
//        for (Point point : points) {
////            System.out.println(point);
//        	System.out.println("Print getpoint start");
//            System.out.println(point.getpointTeamName());
//            System.out.println("print getpoint end");
//         }

		System.out.println("PRINTING Pointtest TEAM from Spec -------------------- ENDING ------"); 
		
		return null;

	}


	public List<Point> getPointList()
	{
		System.out.println("PRINTING Point TEAM from Spec --------------------");
		
		Iterable<Point> predicate = extracted();
		Iterable<Point> points = predicate;
        for (Point point : points) {
            System.out.println(point);
            System.out.println(point.getpointTeamName());
         }

		System.out.println("PRINTING Point TEAM from Spec -------------------- ENDING ------"); 
		
		return Lists.newArrayList(points);

	}

	private Iterable<Point> extracted() {
		return (Iterable<Point>) pointSpec.toPredicate();
	}


	
	public List<Team> getTeamList()
	{
		System.out.println("PRINTING TEAM findAll --------------------");
		
		Iterable<Team> teams = teamRepository.findAllByOrderByIdAsc();
        for (Team team : teams) {
            System.out.println(team);
            System.out.println(team.getId());
            System.out.println(team.getTeamName());
            System.out.println(team.getTeamRegistered());
            System.out.println(team.getTeamPaid());
            System.out.println(team.getTeamWaiver());
            System.out.println(team.getTeamCode());
            System.out.println(team.getTeamGroupId());
            System.out.println(team.getTeamComments());
        }

		System.out.println("PRINTING TEAM findAll -------------------- ENDING ------"); 
		
		return Lists.newArrayList(teams);

	}

	public List<Schedule> getScheduleList()
	{
		System.out.println("PRINTING SCHEDULE findAll --------------------");
		Iterable<Schedule> schedules = scheduleRepository.findAll();
		for (Schedule schedule : schedules) {
            System.out.println(schedule);
            System.out.println(schedule.getId());
            System.out.println(schedule.getScheduleTime());
            System.out.println(schedule.getScheduleMatchName());
            System.out.println(schedule.getScheduleGroundId());
            System.out.println(schedule.getScheduleTeam1GroupId());
            System.out.println(schedule.getScheduleTeam2GroupId());
            System.out.println(schedule.getScheduleComments());
        }

		System.out.println("PRINTING SCHEDULE findAll -------------------- ENDING ------"); 

		return Lists.newArrayList(schedules);

	}

	public List<Score> getScoreList()
	{
		System.out.println("PRINTING SCORE findAll --------------------");
		Iterable<Score> scores = scoreRepository.findAll();
		for (Score score : scores) {
			System.out.println(score);
            System.out.println(score.getId());
            System.out.println(score.getScoreScheduleId());
            System.out.println(score.getScoreTeamId());
            System.out.println(score.getScorePlayerId());
            System.out.println(score.getScoreBattingRuns());
            System.out.println(score.getScoreBattingBalls());
            System.out.println(score.getScoreBatting4s());
            System.out.println(score.getScoreBatting6s());
            System.out.println(score.getScoreBattingOut());
            System.out.println(score.getScoreBattingWicketId());
            System.out.println(score.getScoreBowlingRuns());
            System.out.println(score.getScoreBowlingBalls());
            System.out.println(score.getScoreBowlingWkts());
            System.out.println(score.getScoreComments());
        }

		System.out.println("PRINTING SCORE findAll -------------------- ENDING ------"); 

		return Lists.newArrayList(scores);

	}

	public List<Result> getResultList()
	{
		System.out.println("PRINTING RESULT findAll --------------------");
		Iterable<Result> results = resultRepository.findAll();
		for (Result result : results) {
			System.out.println(result);
            System.out.println(result.getId());
            System.out.println(result.getResultScheduleId());
            System.out.println(result.getResultWinnerTeamId());
            System.out.println(result.getResultLoserTeamId());
            System.out.println(result.getResultScoreId());
            System.out.println(result.getResultComments());
        }

		System.out.println("PRINTING RESULT findAll -------------------- ENDING ------"); 

		return Lists.newArrayList(results);

	}

	public List<Player> getPlayerList()
	{
		System.out.println("PRINTING PLAYER findAll --------------------");
		Iterable<Player> players = playerRepository.findAll();
		for (Player player : players) {
            System.out.println(player);
            System.out.println(player.getId());
            System.out.println(player.getPlayerFirstName());
            System.out.println(player.getPlayerLastName());
            System.out.println(player.getPlayerEmail());
            System.out.println(player.getPlayerPhnbr());
            System.out.println(player.getPlayerTeamId());
            System.out.println(player.getPlayerRoleId());
            System.out.println(player.getPlayerComments());
        }

		System.out.println("PRINTING PLAYER findAll -------------------- ENDING ------"); 
		return Lists.newArrayList(players);

	}
	
	public List<Role> getRoleList() {
		System.out.println("PRINTING ROLE Rolelist findAll -------------------- Starting ------"); 
		Iterable<Role> roles = roleRepository.findAll();
		for (Role role : roles) {
			System.out.println(role);
            System.out.println(role.getId());
            System.out.println(role.getRoleDescription());
            System.out.println(role.getRoleComments());
        }

		System.out.println("PRINTING ROLE Rolelist findAll -------------------- ENDING ------"); 
		return Lists.newArrayList(roles);
		
	}

	public List<Wicket> getWicketList() {
		System.out.println("PRINTING WICKET Wicketlist findAll -------------------- Starting ------"); 
		Iterable<Wicket> wickets = wicketRepository.findAll();
		for (Wicket wicket : wickets) {
			System.out.println(wicket);
            System.out.println(wicket.getId());
            System.out.println(wicket.getWicketDescription());
            System.out.println(wicket.getWicketComments());
        }

		System.out.println("PRINTING WICKET Wicketlist findAll -------------------- ENDING ------"); 
		return Lists.newArrayList(wickets);
		
	}

	public String saveTeam()
	{
		Team team = new Team();
		team.setId(new Long("101"));
		
		team.setTeamCode("TESTCODE");
		team.setTeamComments("TEST");
		team.setTeamGroupId("TEST GROUP");
		
		teamRepository.save(team);
		return null;
	}
	
	
	
	
	public String test()
	{
		System.out.println("Hello I am testing TeamSignUp");
		System.out.println("-----------------------------");
		
		System.out.println("Hello I am testing HomeService");

		System.out.println("PRINTING findAll --------------------");
        for (Field field : fieldRepository.findAll()) {
            System.out.println(field);
            System.out.println(field.getId());
            System.out.println(field.getGroundName());
            System.out.println(field.getGroundComments());
        }

		System.out.println("PRINTING findAll -------------------- ENDING ------"); 

		System.out.println("PRINTING findByID --------------------");
        Optional<Field> field = fieldRepository.findById(Long.valueOf("1"));
    
        System.out.println(field);
        System.out.println(field.get().getId());
        System.out.println(field.get().getGroundName());
        System.out.println(field.get().getGroundComments());

		System.out.println("PRINTING findById -------------------- ENDING ------"); 

		System.out.println("PRINTING findByName --------------------");
    
        for (Field field2 : fieldRepository.findByGroundName("Field2")) {
            System.out.println(field2);
            System.out.println(field2.getId());
            System.out.println(field2.getGroundName());
            System.out.println(field2.getGroundComments());
        }

		System.out.println("PRINTING findByName -------------------- ENDING ------"); 

		System.out.println("Hello I am testing HomeService");

		System.out.println("PRINTING TEAM findAll --------------------");
        for (Team team : teamRepository.findAll()) {
            System.out.println(team);
            System.out.println(team.getId());
            System.out.println(team.getTeamName());
            System.out.println(team.getTeamRegistered());
            System.out.println(team.getTeamPaid());
            System.out.println(team.getTeamWaiver());
            System.out.println(team.getTeamCode());
            System.out.println(team.getTeamGroupId());
            System.out.println(team.getTeamComments());
        }

		System.out.println("PRINTING TEAM findAll -------------------- ENDING ------"); 

		System.out.println("PRINTING Team findByID --------------------");
        Optional<Team> team1 = teamRepository.findById(Long.valueOf("1"));
    
        System.out.println(team1);
        System.out.println(team1.get().getId());
        System.out.println(team1.get().getTeamName());
        System.out.println(team1.get().getTeamRegistered());
        System.out.println(team1.get().getTeamPaid());
        System.out.println(team1.get().getTeamWaiver());
        System.out.println(team1.get().getTeamCode());
        System.out.println(team1.get().getTeamGroupId());
        System.out.println(team1.get().getTeamComments());

		System.out.println("PRINTING findById -------------------- ENDING ------"); 


		System.out.println("PRINTING WICKET findAll --------------------");
        
		for (Wicket wicket : wicketRepository.findAll()) {
            System.out.println(wicket);
            System.out.println(wicket.getId());
            System.out.println(wicket.getWicketDescription());
            System.out.println(wicket.getWicketComments());
        }

		System.out.println("PRINTING WICKET findAll -------------------- ENDING ------"); 

		System.out.println("PRINTING ROLE findAll --------------------");
        
		for (Role role : roleRepository.findAll()) {
            System.out.println(role);
            System.out.println(role.getId());
            System.out.println(role.getRoleDescription());
            System.out.println(role.getRoleComments());
        }

		System.out.println("PRINTING ROLE findAll -------------------- ENDING ------"); 
		
		System.out.println("PRINTING PLAYER findAll --------------------");
        for (Player player : playerRepository.findAll()) {
            System.out.println(player);
            System.out.println(player.getId());
            System.out.println(player.getPlayerFirstName());
            System.out.println(player.getPlayerLastName());
            System.out.println(player.getPlayerEmail());
            System.out.println(player.getPlayerPhnbr());
            System.out.println(player.getPlayerTeamId());
            System.out.println(player.getPlayerRoleId());
            System.out.println(player.getPlayerComments());
        }

		System.out.println("PRINTING PLAYER findAll -------------------- ENDING ------"); 

		System.out.println("PRINTING SCORE findAll --------------------");
        for (Score score : scoreRepository.findAll()) {
            System.out.println(score);
            System.out.println(score.getId());
            System.out.println(score.getScoreScheduleId());
            System.out.println(score.getScoreTeamId());
            System.out.println(score.getScorePlayerId());
            System.out.println(score.getScoreBattingRuns());
            System.out.println(score.getScoreBattingBalls());
            System.out.println(score.getScoreBatting4s());
            System.out.println(score.getScoreBatting6s());
            System.out.println(score.getScoreBattingOut());
            System.out.println(score.getScoreBattingWicketId());
            System.out.println(score.getScoreBowlingRuns());
            System.out.println(score.getScoreBowlingBalls());
            System.out.println(score.getScoreBowlingWkts());
            System.out.println(score.getScoreComments());
        }

		System.out.println("PRINTING SCORE findAll -------------------- ENDING ------"); 

		System.out.println("PRINTING RESULT findAll --------------------");
        for (Result result : resultRepository.findAll()) {
            System.out.println(result);
            System.out.println(result.getId());
            System.out.println(result.getResultScheduleId());
            System.out.println(result.getResultWinnerTeamId());
            System.out.println(result.getResultLoserTeamId());
            System.out.println(result.getResultScoreId());
            System.out.println(result.getResultComments());
        }

		System.out.println("PRINTING RESULT findAll -------------------- ENDING ------"); 


		
		return "HelloHomeService";
	}

}
