package org.test.brackets.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.test.brackets.entities.Result;

@Repository
public interface ResultRepository extends CrudRepository<Result, Long> {
	List<Result> findByResultScheduleId(String resultScheduleId);	
}
