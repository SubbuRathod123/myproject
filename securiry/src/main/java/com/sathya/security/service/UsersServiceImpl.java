package com.sathya.security.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.security.entity.Users;
import com.sathya.security.repository.UsersRepository;

@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	private UsersRepository usersRepository;

	@Transactional
	public Users insertUser(Users users) {

		return usersRepository.save(users);
	}

	@Transactional
	public Users updateUser(Users users) {

		return usersRepository.save(users);
	}

	@Transactional
	public void deleteUsersById(Integer id) {
		usersRepository.deleteById(id);

	}

	@Override
	public Iterable<Users> getAllUsers() {

		return usersRepository.findAll();
	}

	@Override
	public Optional<Users> getUsersById(Integer id) {

		return usersRepository.findById(id);
	}

}
