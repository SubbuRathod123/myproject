package com.sathya.security.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sathya.security.entity.Users;
@Repository
public interface UsersRepository extends CrudRepository<Users, Integer> {

}
