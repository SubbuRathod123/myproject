package com.sathya.admin.service;

import java.util.List;

import com.sathya.admin.entites.Designation;

public interface DesignationService {
	public List<Designation> findAll();

	public Designation insertDesignation(Designation designation);

	public Designation updateDesignation(Designation Designation);

	public void deleteDesignation(Integer id);

}
