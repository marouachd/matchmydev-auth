package co.simplon.matchmydev.auth.services;

import org.springframework.stereotype.Service;

import co.simplon.matchmydev.auth.dtos.AccountStatusUpdate;
import co.simplon.matchmydev.auth.entities.UserAccount;
import co.simplon.matchmydev.auth.repositories.UserAccountRepository;

@Service
public class AdminServiceImpl implements AdminService {

    private UserAccountRepository userAccounts;

    public AdminServiceImpl(UserAccountRepository userAccounts) {
	this.userAccounts = userAccounts;
    }

    @Override
    public void updateStatus(AccountStatusUpdate inputs, Long id) {
	UserAccount entity = userAccounts.findById(id).get();
	entity.setActive(!inputs.getActive());
	userAccounts.save(entity);
    }
}
