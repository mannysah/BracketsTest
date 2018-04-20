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
public class BattingSpecification {

	@Autowired
	EntityManager entityManager;
	
	public Predicate toPredicate() {
		// TODO Auto-generated method stub
		String jpaqlp="SELECT id, playerFirstName, playerLastName from Player";
		System.out.println(entityManager.createQuery(jpaqlp).getResultList());;

		List<Object[]> results = entityManager.createQuery(jpaqlp).getResultList();
			results.stream().forEach((record) -> {
		    Long playerId = ((Long) record[0]).longValue();
		    System.out.println("Player ID ::"+ playerId);
	        String playerFname = (String) record[1];
	        System.out.println("Player FName ::"+ playerFname);
	        String playerLname = (String) record[2];
	        System.out.println("Player LName ::"+ playerLname);
	        
	        String jpaqlpinn="SELECT count(sc.scorePlayerId) from Score sc INNER JOIN Player p ON sc.scorePlayerId = p.id and sc.scoreBattingBalls > 0 and p.id = "+playerId;// 
			System.out.println(entityManager.createQuery(jpaqlpinn).getResultList());;
			
	        String jpaqlpt="SELECT t.teamName from Team t INNER JOIN Player p ON t.id = p.playerTeamId and p.id = "+playerId;// 
			System.out.println(entityManager.createQuery(jpaqlpt).getResultList());;
			String jpaqlpsc="SELECT sum(sc.scoreBattingRuns), sum(sc.scoreBattingBalls) from Score sc INNER JOIN Player p ON sc.scorePlayerId = p.id and p.id = "+playerId;// 
			System.out.println(entityManager.createQuery(jpaqlpsc).getResultList());;
//	        CALCULATE AVERAGE.			
			List<Object[]> pscresults = entityManager.createQuery(jpaqlpsc).getResultList();
			pscresults.stream().forEach((recordpsc) -> {
//				Long runsfor = ((Long) recordsc[0]).longValue();	
			String playruns = (String) recordpsc[0];
		    System.out.println("PLAYER RUNS ::"+ playruns);
//		    Long ballsfor = ((Long) recordsc[1]).longValue();
		    String playballs = (String) recordpsc[1];
		    System.out.println("PLAYER BALLS ::"+ playballs);
			});
	       	});
			
		return null;
	}

}
