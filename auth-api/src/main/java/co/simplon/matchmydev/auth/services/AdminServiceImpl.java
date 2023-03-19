package co.simplon.matchmydev.auth.services;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import co.simplon.matchmydev.auth.dtos.UserAccountForUpdate;
import co.simplon.matchmydev.auth.dtos.UserAccountUpdate;
import co.simplon.matchmydev.auth.entities.Role;
import co.simplon.matchmydev.auth.entities.UserAccount;
import co.simplon.matchmydev.auth.repositories.RoleRepository;
import co.simplon.matchmydev.auth.repositories.UserAccountRepository;

@Service
public class AdminServiceImpl implements AdminService {

    private UserAccountRepository userAccounts;
    private RoleRepository roles;
    private final int COST = 10;

    public AdminServiceImpl(UserAccountRepository userAccounts,
	    RoleRepository roles) {
	this.userAccounts = userAccounts;
	this.roles = roles;
    }

    @Override
    public void updateStatus(Long id, String active) {
	UserAccount entity = userAccounts.findById(id).get();
	Boolean status = Boolean.parseBoolean(active);
	entity.setActive(!status);
	userAccounts.save(entity);
    }

    @Override
    public UserAccountForUpdate forUpdate(Long id) {
	return userAccounts.findProjectedById(id);
    }

    @Override
    public void update(Long id, UserAccountUpdate inputs) {
	UserAccount entity = userAccounts.findById(id).get();
	if (inputs.getPassword() != null) {
	    String hash = BCrypt.hashpw(inputs.getPassword(),
		    BCrypt.gensalt(COST));
	    entity.setPassword(hash);
	}
	Role role = roles.getReferenceById(inputs.getRoleId());
	entity.setRole(role);
	userAccounts.save(entity);
    }
}
