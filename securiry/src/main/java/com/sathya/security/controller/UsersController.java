package com.sathya.security.controller;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.security.entity.Users;
import com.sathya.security.service.UsersService;

@RequestMapping("/Users")
@RestController
public class UsersController {

	private static final Logger logger = LogManager.getLogger(UsersController.class);
	@Autowired
	private UsersService usersService;

	@PostMapping("/insertUsers")
	public Users insertUsers(@RequestBody Users users) {
		logger.info("insertUsers method execution started");

		Users result = null;
		try {
			result = usersService.insertUser(users);
			logger.debug("result is {0}", result);
		} catch (Exception e) {
			logger.error("input data is {0}", e);
		}
		logger.info("insertUsers method execution completed");
		return result;

	}

	@PutMapping("/updateUsers")
	public Users updateUsers(@RequestBody Users users) {
		logger.info("updateUsers method execution started");
		Users result = null;
		try {
			result = usersService.updateUser(users);
			logger.debug("result is {0}", result);
		} catch (Exception e) {
			logger.error("input data is {0}", e);
		}
		logger.info("updateUsers method execution completed");
		return result;

	}

	@DeleteMapping("/deleteUsers/{id}")
	public void deleteUsersById(@PathVariable("id") Integer id) {
		usersService.deleteUsersById(id);
	}

	@GetMapping("/getAllUsers")
	public Iterable<Users> getAllUsers() {
		logger.info("get All users method execution started");
		Iterable<Users> result = null;
		try {
			result = usersService.getAllUsers();
			logger.debug("result is {0}", result);
		} catch (Exception e) {
			logger.error("exception happens and exception info is {0} ", e);
		}
		logger.info("get All users method execution completed");

		return result;

	}

	@GetMapping("/getUsers/{id}")
	public Optional<Users> getUsersById(@PathVariable("id") Integer id) {
		logger.info("get users method execution started");
		Optional<Users> result = null;
		try {
			result = usersService.getUsersById(id);
			logger.debug("result is {0}", result);
		} catch (Exception e) {
			logger.error("exception happens and exception info is {0} ", e);
		}
		logger.info("get users method execution completed");

		return result;

	}
}
