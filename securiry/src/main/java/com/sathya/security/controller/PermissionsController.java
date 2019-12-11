package com.sathya.security.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.security.entity.Permissions;
import com.sathya.security.service.PermissionsService;

@RestController
@RequestMapping(path = "/Permissions")
public class PermissionsController {
	@Autowired
	private PermissionsService permissionsService;

	@PostMapping("/insertPermissions")
	public Permissions insertPermissions(@RequestBody Permissions permissions) {
		return permissionsService.insertPerimissions(permissions);

	}

	public PermissionsService getPermissionsService() {
		return permissionsService;
	}

	public void setPermissionsService(PermissionsService permissionsService) {
		this.permissionsService = permissionsService;
	}

	@PutMapping("/updatePermissions")
	public Permissions updatePermissions(@RequestBody Permissions permissions) {
		return permissionsService.updatePermissions(permissions);

	}

	@DeleteMapping("/deletePermissions")
	public void deletePermissionsById(@PathVariable("id") Integer id) {
		permissionsService.deletePermissionsById(id);
	}

	@GetMapping("/getAllPermissions")
	public Iterable<Permissions> getAllPermissions() {
		return permissionsService.getAllPermissions();

	}

	@GetMapping("/getPermissions")
	public Optional<Permissions> getpermissions(@PathVariable("id") Integer id) {
		return permissionsService.getPermissionsById(id);
	}
}
