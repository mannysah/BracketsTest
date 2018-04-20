package org.test.brackets.specification;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.test.brackets.entities.Team;
 
@Component
public class TeamSpecification  {

	@Autowired
	EntityManager entityManager;
	
	public Predicate toPredicate() {
		// TODO Auto-generated method stub
		String jpaql="SELECT Count(*) from Team";// c JOIN PLAYER i ON c.TEAM_ID = i.PLAYER_TEAM_ID";
		System.out.println(entityManager.createQuery(jpaql).getResultList());;

		String jpaql2="SELECT id from Team";// c JOIN PLAYER i ON c.TEAM_ID = i.PLAYER_TEAM_ID";
		System.out.println(entityManager.createQuery(jpaql2).getResultList());
		
		String jpaql23="SELECT c.id, c.teamName from Team c";// c JOIN PLAYER i ON c.TEAM_ID = i.PLAYER_TEAM_ID";
		System.out.println(entityManager.createQuery(jpaql23).getResultList());;

		String jpaql234="SELECT t.id, t.teamName from Team t INNER JOIN Player p ON t.id = p.playerTeamId";// c JOIN PLAYER i ON c.TEAM_ID = i.PLAYER_TEAM_ID";
		System.out.println(entityManager.createQuery(jpaql234).getResultList());
		List<Object[]> results = entityManager.createQuery(jpaql234).getResultList();
		
		results.stream().forEach((record) -> {
	        Long id = ((Long) record[0]).longValue();
	        System.out.println("TEAM ID ::"+ id);
	        String teamName = (String) record[1];
	        System.out.println("TEAM NAME::"+ teamName);
	});

		return null;
	}

}
	  