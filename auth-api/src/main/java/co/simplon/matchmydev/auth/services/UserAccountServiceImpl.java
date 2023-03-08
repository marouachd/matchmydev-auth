package co.simplon.matchmydev.auth.services;

import java.time.LocalDateTime;
import java.util.Collection;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import co.simplon.matchmydev.auth.dtos.SignInDto;
import co.simplon.matchmydev.auth.dtos.SignUpDto;
import co.simplon.matchmydev.auth.dtos.UserAccountCreate;
import co.simplon.matchmydev.auth.dtos.UserAccountView;
import co.simplon.matchmydev.auth.entities.Role;
import co.simplon.matchmydev.auth.entities.UserAccount;
import co.simplon.matchmydev.auth.repositories.RoleRepository;
import co.simplon.matchmydev.auth.repositories.UserAccountRepository;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    private RoleRepository roles;
    private UserAccountRepository userAccounts;
    private final int COST = 10;

    public UserAccountServiceImpl(UserAccountRepository userAccounts,
	    RoleRepository roles) {

	this.userAccounts = userAccounts;
	this.roles = roles;
    }

    @Override
    public void createAccount(UserAccountCreate inputs) {
	UserAccount userAccount = new UserAccount();
	userAccount.setInternalIdentifier(inputs.getInternalIdentifier());
	userAccount.setInternalEmail(inputs.getInternalEmail());
	String hash = BCrypt.hashpw(inputs.getPassword(), BCrypt.gensalt(COST));
	userAccount.setPassword(hash);
	LocalDateTime createdAt = LocalDateTime.now();
	Long roleId = inputs.getRoleId();
	Role role = roles.getReferenceById(roleId);
	userAccount.setRole(role);
	userAccount.setCreatedAt(createdAt);
	userAccount.setActive(false);
	this.userAccounts.save(userAccount);
	System.out.println(userAccounts);

    }

    @Override
    public void createSignUp(SignUpDto inputs) {
	UserAccount userAccount = new UserAccount();
	userAccount.setInternalIdentifier(inputs.getInternalIdentifier());
	userAccount.setInternalEmail(inputs.getInternalEmail());
	String hash = BCrypt.hashpw(inputs.getPassword(), BCrypt.gensalt(COST));
	userAccount.setPassword(hash);
	LocalDateTime createdAt = LocalDateTime.now();
	userAccount.setCreatedAt(createdAt);
	userAccount.setActive(false);
	this.userAccounts.save(userAccount);
	System.out.println("welcome to the Service");

    }

    @Override
    public Collection<UserAccountView> getAll() {
	return userAccounts.findAllProjectedByOrderById();
    }

    @Override
    public String signIn(SignInDto credentials) {

	UserAccount userAccount = userAccounts
		.findByInternalEmailOrInternalIdentifier(
			credentials.getEmailOrIdentifier(),
			credentials.getEmailOrIdentifier());
	if (userAccount != null) {
	    String hash = userAccount.getPassword();
	    String candidate = credentials.getPassword();
	    if (BCrypt.checkpw(candidate, hash)) {
		return "This account exist and password match";
	    } else {
		return "This account doesn't exist or password doesn't match";
	    }
	} else {
	    return "This account doesn't exist or password doesn't match";
	}
    }

}
