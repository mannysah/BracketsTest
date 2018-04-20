package org.test.brackets.specification;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.test.brackets.entities.Schedule;
import org.test.brackets.model.Point;
import org.test.brackets.entities.Field;
 
@Component
public class PointSpecification {

	@Autowired
	EntityManager entityManager;
	
	public List<Point> toPredicate() {

		//NEWCODE
		List<Point> points = new ArrayList<>();
		
		// COMMENTS -- Why do you need a query for this? 
		// There is no where clause, why cant you just call TeamRepository and get the records. 
		// If you just call Repository, you will already have an object.
		String jpaqlt="SELECT id, teamCode from Team";
		System.out.println(entityManager.createQuery(jpaqlt).getResultList());;

		List<Object[]> results = entityManager.createQuery(jpaqlt).getResultList();
		
		results.stream().forEach((record) -> {
		    Long teamId = ((Long) record[0]).longValue();
		    System.out.println("TEAM ID ::"+ teamId);
	        String teamCode = (String) record[1];
	        System.out.println("Team Code ::"+ teamCode);
	       
	        String jpaqlw="SELECT count(s.scheduleWinnerTeamId) from Schedule s INNER JOIN Team t ON s.scheduleWinnerTeamId = t.id and t.id = "+teamId;// 
			System.out.println(entityManager.createQuery(jpaqlw).getResultList());;
			
			String jpaqll="SELECT count(s.scheduleLoserTeamId) from Schedule s INNER JOIN Team t ON s.scheduleLoserTeamId = t.id and t.id = "+teamId;// 
			System.out.println(entityManager.createQuery(jpaqll).getResultList());;
			
			String jpaqltd="SELECT count(s.scheduleTied) from Schedule s INNER JOIN Team t ON (s.scheduleTeam1GroupId = t.teamGroupId or s.scheduleTeam2GroupId = t.teamGroupId ) and s.scheduleTied = 'YES' and t.id = "+teamId;// 
			System.out.println(entityManager.createQuery(jpaqltd).getResultList());;
			
			String jpaqlnr="SELECT count(s.scheduleNr) from Schedule s INNER JOIN Team t ON (s.scheduleTeam1GroupId = t.teamGroupId or s.scheduleTeam2GroupId = t.teamGroupId ) and s.scheduleNr = 'YES' and t.id = "+teamId;// 
			System.out.println(entityManager.createQuery(jpaqlnr).getResultList());;
			
// NEED TO CALCULATE POINTS AND NET RUN RATE.
			String jpaqlsc="SELECT sum(sc.scoreBattingRuns), sum(sc.scoreBattingBalls), sum(sc.scoreBowlingRuns), sum(sc.scoreBowlingBalls) " 
							+ "from Score sc INNER JOIN Team t ON sc.scoreTeamId = t.id and t.id = "+teamId; 
			System.out.println(entityManager.createQuery(jpaqlsc).getResultList());;

			List<Object[]> scresults = entityManager.createQuery(jpaqlsc).getResultList();

			scresults.stream().forEach((recordsc) -> {
				//NEWCODE
				Point point = new Point();
				point.setPointTeamId(teamId);
				
	//				Long runsfor = ((Long) recordsc[0]).longValue();	
				String runsfor = (String) recordsc[0];
			    System.out.println("RUNS FOR ::"+ runsfor);
	//		    Long ballsfor = ((Long) recordsc[1]).longValue();
			    String ballsfor = (String) recordsc[1];
			    System.out.println("BALLS FOR ::"+ ballsfor);
	//		    Long runsagnst = ((Long) recordsc[2]).longValue();
			    String runsagnst = (String) recordsc[2];
			    System.out.println("RUNS AGNST ::"+ runsagnst);
	//		    Long ballsagnst = ((Long) recordsc[3]).longValue();
			    String ballsagnst = (String) recordsc[3];
			    System.out.println("BALLS AGNST ::"+ ballsagnst);
			    
			  //NEWCODE
			    points.add(point);
			});
	    });
				
		return points;
	}

}