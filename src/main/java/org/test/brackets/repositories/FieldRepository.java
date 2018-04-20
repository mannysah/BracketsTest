package org.test.brackets.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.test.brackets.entities.Field;

@Repository
public interface FieldRepository extends CrudRepository<Field, Long> {
	List<Field> findByGroundName(String groundName);	
}

