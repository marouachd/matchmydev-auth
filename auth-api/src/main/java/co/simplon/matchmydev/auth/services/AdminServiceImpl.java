package co.simplon.matchmydev.auth.services;

import org.springframework.stereotype.Service;

import co.simplon.matchmydev.auth.entities.UserAccount;
import co.simplon.matchmydev.auth.repositories.UserAccountRepository;

@Service
public class AdminServiceImpl implements AdminService {

    private UserAccountRepository userAccounts;

    public AdminServiceImpl(UserAccountRepository userAccounts) {
	this.userAccounts = userAccounts;
    }

    @Override
    public void updateStatus(Long id, String active) {
	UserAccount entity = userAccounts.findById(id).get();
	Boolean status = Boolean.parseBoolean(active);
	System.out.println("active : " + active);
	System.out.println("status : " + status);
	entity.setActive(!status);
	System.out.println("!status : " + !status);
	userAccounts.save(entity);
    }
}
