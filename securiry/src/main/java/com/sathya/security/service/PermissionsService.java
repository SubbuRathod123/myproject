package com.sathya.security.service;

import java.util.Optional;

import com.sathya.security.entity.Permissions;

public interface PermissionsService {

	public Permissions insertPerimissions(Permissions permissions);

	public Permissions updatePermissions(Permissions permisions);

	public void deletePermissionsById(Integer id);

	public Iterable<Permissions> getAllPermissions();

	public Optional<Permissions> getPermissionsById(Integer id);

}
