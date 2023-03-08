package co.simplon.matchmydev.auth.services;

import java.util.Collection;

import co.simplon.matchmydev.auth.dtos.LabelValue;

public interface RoleService {
	 Collection<LabelValue> getAll();
}
