package co.simplon.matchmydev.auth.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.matchmydev.auth.dtos.UserAccountForUpdate;
import co.simplon.matchmydev.auth.dtos.UserAccountView;
import co.simplon.matchmydev.auth.entities.UserAccount;

public interface UserAccountRepository
	extends JpaRepository<UserAccount, Long> {
    Collection<UserAccountView> findAllProjectedByOrderById();

    UserAccount findByInternalEmailOrInternalIdentifier(String email,
	    String identifier);

    UserAccountForUpdate findProjectedById(Long id);

}
