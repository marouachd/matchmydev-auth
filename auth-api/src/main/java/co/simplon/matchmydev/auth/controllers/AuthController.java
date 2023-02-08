package co.simplon.matchmydev.auth.controllers;

import java.util.Collection;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.matchmydev.auth.dtos.UserAccountCreate;
import co.simplon.matchmydev.auth.dtos.UserAccountView;
import co.simplon.matchmydev.auth.services.UserAccountService;

@RestController
@RequestMapping("/user-accounts")
@CrossOrigin
public class AuthController {

    private UserAccountService service;

    public AuthController(UserAccountService service) {
	this.service = service;

    }

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void create(@Valid @RequestBody UserAccountCreate inputs) {

	service.create(inputs);
	System.out.println("juliette est gentille :D");

    }

    @GetMapping
    public Collection<UserAccountView> getAll() {
	System.out.println("juliette est gentille :D");
	return service.getAll();

    }

}
