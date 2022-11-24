package co.simplon.matchmydev.auth.controllers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.matchmydev.auth.database.Database;
import co.simplon.matchmydev.auth.dtos.UserAccountCreate;
import co.simplon.matchmydev.auth.dtos.UserAccountView;
import co.simplon.matchmydev.auth.entities.UserAccount;

@RestController
@RequestMapping("/useraccount")
@CrossOrigin
public class AuthController {

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void create(@RequestBody UserAccountCreate inputs) {
	UserAccount userAccount = new UserAccount();
	userAccount.setInternalIdentifier(inputs.getInternalIdentifier());
	userAccount.setInternalEmail(inputs.getInternalEmail());
	userAccount.setCreatedAt(LocalDateTime.now());
	userAccount.setActive(true);
	String hash = BCrypt.hashpw(inputs.getPassword(), BCrypt.gensalt(10));
	userAccount.setPassword(hash);
	Database.saveAccount(userAccount);

	if (Database.findAll().size() < 5) {
	    for (int i = 0; i < 5; i++) {
		Database.addRandomAccount();
	    }
	}

    }

    @GetMapping
    public Collection<UserAccountView> getAll() {
	Collection<UserAccountView> views = new ArrayList<>();
	Collection<UserAccount> userAccounts = Database.findAll();

	for (UserAccount userAccount : userAccounts) {
	    UserAccountView view = new UserAccountView();
	    view.setInternalIdentifier(userAccount.getInternalIdentifier());
	    view.setInternalEmail(userAccount.getInternalEmail());
	    view.setPassword(userAccount.getPassword());
	    view.setActive(userAccount.isActive());
	    view.setCreatedAt(userAccount.getCreatedAt());
	    views.add(view);
	}

	return views;
    }
}
