package com.sathya.security.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sathya.security.entity.Roles;
@Repository
public interface RolesRepository extends CrudRepository<Roles, Integer>{

}
