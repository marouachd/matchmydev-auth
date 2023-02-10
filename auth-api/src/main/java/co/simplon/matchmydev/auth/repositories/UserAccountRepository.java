package co.simplon.matchmydev.auth.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.matchmydev.auth.dtos.UserAccountView;
import co.simplon.matchmydev.auth.entities.UserAccount;

public interface UserAccountRepository
	extends JpaRepository<UserAccount, Long> {
    Collection<UserAccountView> findAllProjectedBy();

    UserAccount findByInternalEmailOrInternalIdentifier(
	    String email, String identifier);

}
