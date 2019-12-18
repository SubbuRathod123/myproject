package com.sathya.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.admin.data.DesignationRepository;
import com.sathya.admin.entites.Designation;

@Service
public class DesignationServiceImpl implements DesignationService {
	@Autowired
	DesignationRepository designationRepository;

	@Override
	public List<Designation> findAll() {
		return (List<Designation>) designationRepository.findAll();
	}

	@Override
	public Designation insertDesignation(Designation designation) {
		return designationRepository.save(designation);
	}

	@Override
	public Designation updateDesignation(Designation designation) {
		return designationRepository.save(designation);
	}

	@Override
	public void deleteDesignation(Integer id) {
		designationRepository.deleteById(id);

	}

}
