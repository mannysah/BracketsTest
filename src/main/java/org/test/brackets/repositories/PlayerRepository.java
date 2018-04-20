package org.test.brackets.repositories;


import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.test.brackets.entities.Player;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {
	List<Player> findByPlayerRoleId(String playerRoleId);	
}
