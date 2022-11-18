package co.simplon.matchmydev.auth.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.matchmydev.auth.database.Database;
import co.simplon.matchmydev.auth.dtos.UserAccountCreate;
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
	userAccount.setPassword(inputs.getPassword());
	Database.saveAccount(userAccount);
	System.out.println(userAccount);
    }
}
