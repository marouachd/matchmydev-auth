package co.simplon.matchmydev.auth.services;

import java.util.Collection;


import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;

import co.simplon.matchmydev.auth.dtos.LabelValue;
import co.simplon.matchmydev.auth.repositories.RoleRepository;

@Service
@Transactional(readOnly = true)
public class RoleServiceImpl implements RoleService {
	

	    private final RoleRepository roles;

	    public RoleServiceImpl(RoleRepository roles) {
		this.roles = roles;
	    }

	    @Override
	    public Collection<LabelValue> getAll() {
		return roles.findAllProjectedBy();
	    }

}
