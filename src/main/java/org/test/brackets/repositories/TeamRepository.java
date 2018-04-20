
package org.test.brackets.repositories;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.criterion.CriteriaQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.test.brackets.entities.Team;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {
//	List<Team> findByTeamId(String teamId);	
//	List<Team> orderByTeamGroupId(String teamGroupId);
//	 @Query("Select TEAM_ID, TEAM_NAME, TEAM_REGISTERED, TEAM_PAID, TEAM_WAIVER, TEAM_COMMENTS, TEAM_GROUP_ID, TEAM_CODE from TEAM orderby TEAM_GROUP_ID")
	public List<Team> findAllByOrderByIdAsc();
	public List<Team> findAllByOrderByIdDesc();
	
//	@Query("SELECT t FROM TEAM t WHERE LOWER(t.Team_Name) = LOWER(:Team_Name)")
//    public List<Team> find(@Param("Team_Name") String Team_Name);
//	List<Team> OrdeByWithQuery();
}

