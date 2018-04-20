package org.test.brackets.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.test.brackets.entities.Wicket;

@Repository
public interface WicketRepository extends CrudRepository<Wicket, Long> {
	List<Wicket> findByWicketDescription(String wicketDescription);	
}
