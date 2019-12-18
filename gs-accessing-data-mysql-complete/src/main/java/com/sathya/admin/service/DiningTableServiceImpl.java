package com.sathya.admin.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.admin.data.DiningTableRepository;
import com.sathya.admin.entites.DiningTable;

@Service
public class DiningTableServiceImpl implements DiningTableService{
	@Autowired
	DiningTableRepository diningTableRepository;

	public List<DiningTable> findAll() {
		return (List<DiningTable>) diningTableRepository.findAll();

	}

	@Transactional
	public DiningTable insertDiningTable(DiningTable diningTable) {
		return diningTableRepository.save(diningTable);
	}

	@Transactional
	public DiningTable updateDiningTable(DiningTable diningTable) {
		return diningTableRepository.save(diningTable);

	}

	@Transactional
	public void deleteDiningTable(Integer id) {
		diningTableRepository.deleteById(id);

	}

}
