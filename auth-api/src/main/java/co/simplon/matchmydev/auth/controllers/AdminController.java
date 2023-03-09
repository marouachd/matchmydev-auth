package co.simplon.matchmydev.auth.controllers;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.matchmydev.auth.services.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private AdminService service;

    public AdminController(AdminService service) {
	this.service = service;
    }

    @PatchMapping("/account-user/{id}/{active}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateStatus(@Valid @RequestBody @PathVariable("id") Long id,
	    @PathVariable("active") String active) {
	service.updateStatus(id, active);
    }

}
