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
public class BowlingSpecification {

	@Autowired
	EntityManager entityManager;
	
	public Predicate toPredicate() {
		// TODO Auto-generated method stub
		String jpaqlplbo="SELECT id, playerFirstName, playerLastName from Player";
		System.out.println(entityManager.createQuery(jpaqlplbo).getResultList());;

		List<Object[]> results = entityManager.createQuery(jpaqlplbo).getResultList();
			results.stream().forEach((record) -> {
		    Long playerId = ((Long) record[0]).longValue();
		    System.out.println("Player ID ::"+ playerId);
	        String playerFname = (String) record[1];
	        System.out.println("Player FName ::"+ playerFname);
	        String playerLname = (String) record[2];
	        System.out.println("Player LName ::"+ playerLname);
	        
	        String jpaqlpboinn="SELECT count(sc.scorePlayerId) from Score sc INNER JOIN Player p ON sc.scorePlayerId = p.id and sc.scoreBattingBalls > 0 and p.id = "+playerId;// 
			System.out.println(entityManager.createQuery(jpaqlpboinn).getResultList());;
			
	        String jpaqlpbot="SELECT t.teamName from Team t INNER JOIN Player p ON t.id = p.playerTeamId and p.id = "+playerId;// 
			System.out.println(entityManager.createQuery(jpaqlpbot).getResultList());;
			String jpaqlpbosc="SELECT sum(sc.scoreBowlingRuns), sum(sc.scoreBowlingBalls), sum(sc.scoreBowlingWkts) from Score sc INNER JOIN Player p ON sc.scorePlayerId = p.id and p.id = "+playerId;// 
			System.out.println(entityManager.createQuery(jpaqlpbosc).getResultList());;
//	        CALCULATE AVERAGE.			
			List<Object[]> pboscresults = entityManager.createQuery(jpaqlpbosc).getResultList();
			pboscresults.stream().forEach((recordpbosc) -> {
//				Long runsfor = ((Long) recordsc[0]).longValue();	
			String playboruns = (String) recordpbosc[0];
		    System.out.println("PLAYER Bowl RUNS ::"+ playboruns);
//		    Long ballsfor = ((Long) recordsc[1]).longValue();
		    String playboballs = (String) recordpbosc[1];
		    System.out.println("PLAYER Bowl BALLS ::"+ playboballs);
		    String playbowkts = (String) recordpbosc[2];
		    System.out.println("PLAYER Bowl WKTS ::"+ playbowkts);
			});
	       	});
			
		return null;
	}

}
