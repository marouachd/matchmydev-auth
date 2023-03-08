package co.simplon.matchmydev.auth.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.matchmydev.auth.dtos.LabelValue;
import co.simplon.matchmydev.auth.entities.Role;



public interface RoleRepository extends JpaRepository <Role, Long> {

	Collection<LabelValue> findAllProjectedBy();
	
	

}
