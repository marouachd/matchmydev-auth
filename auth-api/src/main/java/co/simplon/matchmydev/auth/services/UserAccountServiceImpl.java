package co.simplon.matchmydev.auth.services;

import java.time.LocalDateTime;
import java.util.Collection;

import org.springframework.stereotype.Service;

import co.simplon.matchmydev.auth.dtos.UserAccountCreate;
import co.simplon.matchmydev.auth.dtos.UserAccountView;
import co.simplon.matchmydev.auth.entities.UserAccount;
import co.simplon.matchmydev.auth.repositories.UserAccountRepository;

@Service
public class UserAccountServiceImpl implements UserAccountService{
	
	private UserAccountRepository userAccounts;
	
	public UserAccountServiceImpl(UserAccountRepository userAccounts) {
		
		this.userAccounts = userAccounts;
	}
	
	@Override
	public void create(UserAccountCreate inputs) {
		UserAccount userAccount = new UserAccount();
		userAccount.setInternalIdentifier(inputs.getInternalIdentifier());
		userAccount.setInternalEmail(inputs.getInternalEmail());
		userAccount.setPassword(inputs.getPassword());
		LocalDateTime createdAt = LocalDateTime.now();
		userAccount.setCreatedAt(createdAt);
		userAccount.setActive(true);
		this.userAccounts.save(userAccount);
		
	}

	@Override
	public Collection<UserAccountView> getAll(){
		return userAccounts.findAllProjectedBy();
}

}
