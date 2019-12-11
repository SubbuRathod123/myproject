package com.sathya.security.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.security.entity.Permissions;
import com.sathya.security.repository.PermissionsRepository;

@Service
public class PermissionsServiceImpl implements PermissionsService {
	@Autowired
	private PermissionsRepository permissionsRepository;

	@Override
	public Permissions insertPerimissions(Permissions permissions) {
		return permissionsRepository.save(permissions);
	}

	@Override
	public Permissions updatePermissions(Permissions permisions) {

		return permissionsRepository.save(permisions);
	}

	@Override
	public void deletePermissionsById(Integer id) {
		permissionsRepository.deleteById(id);

	}

	@Override
	public Iterable<Permissions> getAllPermissions() {

		return permissionsRepository.findAll();
	}

	@Override
	public Optional<Permissions> getPermissionsById(Integer id) {

		return permissionsRepository.findById(id);
	}

}
