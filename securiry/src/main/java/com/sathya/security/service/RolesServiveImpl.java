package com.sathya.security.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.security.entity.Roles;
import com.sathya.security.repository.RolesRepository;

@Service
public class RolesServiveImpl implements RolesService {
	@Autowired
	private RolesRepository rolesRepository;

	@Override
	public Roles insertRoles(Roles roles) {
		return rolesRepository.save(roles);
	}

	@Override
	public Roles updateRoles(Roles roles) {

		return rolesRepository.save(roles);
	}

	@Override
	public void deleteRolesById(Integer id) {
		rolesRepository.deleteById(id);

	}

	@Override
	public Iterable<Roles> getAllRoles() {
		return rolesRepository.findAll();
	}

	@Override
	public Optional<Roles> getRolesById(Integer id) {
		return rolesRepository.findById(id);
	}

}
