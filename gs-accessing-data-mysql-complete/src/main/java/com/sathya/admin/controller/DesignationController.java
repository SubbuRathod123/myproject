package com.sathya.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.admin.entites.Designation;
import com.sathya.admin.service.DesignationService;

@RequestMapping("/Designation")
@RestController

public class DesignationController {

	@Autowired
	DesignationService designationService;

	@GetMapping("/getAllDesignation")
	public List<Designation> getAllDesignation() {
		return designationService.findAll();

	}

	@PostMapping("/addDesignation")
	public Designation insertDesignation(@RequestBody Designation designation) {
		return designationService.insertDesignation(designation);

	}

	@PutMapping("/updateDesignation")
	public Designation updateDesignation(@RequestBody Designation designation) {
		return designationService.updateDesignation(designation);

	}

	@DeleteMapping("/deteleDesignation/{id}")
	public void deteleDesignation(@PathVariable("id") Integer id) {
		designationService.deleteDesignation(id);

	}

}
