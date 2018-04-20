package org.test.brackets.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.test.brackets.entities.Schedule;

@Repository
public interface ScheduleRepository extends CrudRepository<Schedule, Long> {
	List<Schedule> findByScheduleMatchName(String scheduleMatchName);	
}

