package org.test.brackets.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.test.brackets.entities.Score;

@Repository
public interface ScoreRepository extends CrudRepository<Score, Long> {
	List<Score> findByScoreScheduleId(String scoreScheduleId);	
}
