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

import com.sathya.admin.entites.DiningTable;
import com.sathya.admin.service.DiningTableService;

@RequestMapping("/DiningTable")
@RestController

public class DiningTableController {
	@Autowired
	DiningTableService diningTableService;

	@GetMapping("/getAllDiningTable")
	public List<DiningTable> getAllDiningTable() {
		return diningTableService.findAll();

	}

	@PostMapping("/addDiningTable")
	public DiningTable insertDiningTable(@RequestBody DiningTable diningTable) {
		return diningTableService.insertDiningTable(diningTable);

	}

	@PutMapping("/updateDiningTable")
	public DiningTable updateDiningTable(@RequestBody DiningTable diningTable) {
		return diningTableService.updateDiningTable(diningTable);

	}

	@DeleteMapping("/deteleDiningTable/{id}")
	public void deteleDiningTable(@PathVariable("id") Integer id) {
		diningTableService.deleteDiningTable(id);

	}

}
