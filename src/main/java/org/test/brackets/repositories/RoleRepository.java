package org.test.brackets.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.test.brackets.entities.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
	List<Role> findByRoleDescription(String roleDescription);	
}
