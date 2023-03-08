package co.simplon.matchmydev.auth.controllers;

import java.util.Collection;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.matchmydev.auth.dtos.LabelValue;
import co.simplon.matchmydev.auth.services.RoleService;

@RestController
@RequestMapping("/roles")
public class RoleController {
	
	private final RoleService service;

	public RoleController (RoleService service) {
		this.service =service;
	}
	@GetMapping
	public Collection<LabelValue> getAll() {
		return service.getAll();
	    }
}
