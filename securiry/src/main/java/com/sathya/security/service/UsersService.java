package com.sathya.security.service;

import java.util.Optional;

import com.sathya.security.entity.Users;

public interface UsersService {

	public Users insertUser(Users users);

	public Users updateUser(Users users);

	public void deleteUsersById(Integer id);

	public Iterable<Users> getAllUsers();

	public Optional<Users> getUsersById(Integer id);

}
