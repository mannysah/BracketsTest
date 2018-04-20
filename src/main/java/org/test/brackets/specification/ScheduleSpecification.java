package org.test.brackets.specification;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.test.brackets.entities.Schedule;
import org.test.brackets.entities.Field;
 
@Component

public class ScheduleSpecification {

	@Autowired
	EntityManager entityManager;
	
	public Predicate toPredicate() {
		// TODO Auto-generated method stub
		String jpaql="SELECT Count(*) from 	Schedule";// c JOIN PLAYER i ON c.TEAM_ID = i.PLAYER_TEAM_ID";
		System.out.println(entityManager.createQuery(jpaql).getResultList());;

		String jpaql2="SELECT id from Schedule";// c JOIN PLAYER i ON c.TEAM_ID = i.PLAYER_TEAM_ID";
		System.out.println(entityManager.createQuery(jpaql2).getResultList());;

//		String jpaql234="SELECT t.id, t.teamName from Team t INNER JOIN Player p ON t.id = p.playerTeamId";// c JOIN PLAYER i ON c.TEAM_ID = i.PLAYER_TEAM_ID";
// 		String jpaql234="SELECT s.scheduleMatchName, s.scheduleTime from Schedule s INNER JOIN Team t ON s.scheduleTeam1GroupId = t.teamGroupId";// c JOIN PLAYER i ON c.TEAM_ID = i.PLAYER_TEAM_ID";
 		
		String jpaql23="SELECT s.scheduleMatchName, s.scheduleTime from Schedule s";// c JOIN PLAYER i ON c.TEAM_ID = i.PLAYER_TEAM_ID";
		System.out.println(entityManager.createQuery(jpaql23).getResultList());
		
//		String jpaql234="SELECT s.scheduleMatchName, s.scheduleTime, g.groundName, t.teamName from Schedule s INNER JOIN Field g ON s.scheduleGroundId = g.id INNER JOIN Team t ON s.scheduleTeam1GroupId = t.teamGroupId";// c JOIN PLAYER i ON c.TEAM_ID = i.PLAYER_TEAM_ID";
// 		System.out.println(entityManager.createQuery(jpaql234).getResultList());;

//		String jpaql234="SELECT s.scheduleMatchName, s.scheduleTime, g.groundName, t.teamName from Schedule s INNER JOIN Field g ON s.scheduleGroundId = g.id INNER JOIN Team t ON s.scheduleTeam1GroupId = t.teamGroupId order by s.scheduleMatchName";// c JOIN PLAYER i ON c.TEAM_ID = i.PLAYER_TEAM_ID";
		String jpaql234="SELECT s.scheduleMatchName, s.scheduleTime, g.groundName, t1.teamName, t2.teamName from Schedule s INNER JOIN Field g ON s.scheduleGroundId = g.id INNER JOIN Team t1 ON s.scheduleTeam1GroupId = t1.teamGroupId INNER JOIN Team t2 ON s.scheduleTeam2GroupId = t2.teamGroupId order by s.scheduleMatchName";// c JOIN PLAYER i ON c.TEAM_ID = i.PLAYER_TEAM_ID";
 		
		System.out.println(entityManager.createQuery(jpaql234).getResultList());;

		List<Object[]> results = entityManager.createQuery(jpaql234).getResultList();
 			results.stream().forEach((record) -> {
 	        String scheduleMatchName = (String) record[0];
 	        System.out.println("Match Name ::"+ scheduleMatchName);
 	        String scheduleTime = (String) record[1];
 	        System.out.println("Schedule Time::"+ scheduleTime);
 	        String groundName = (String) record[2];
	        System.out.println("Ground Name::"+ groundName);
	        String Team1Name = (String) record[3];
	        System.out.println("Team1 Name::"+ Team1Name);
	        String Team2Name = (String) record[4];
	        System.out.println("Team2 Name::"+ Team2Name);
 	});

		return null;
	}

}
	  