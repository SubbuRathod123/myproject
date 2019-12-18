package com.sathya.admin.service;

import java.util.List;

import com.sathya.admin.entites.DiningTable;

public interface DiningTableService {

	public List<DiningTable> findAll();

	public DiningTable insertDiningTable(DiningTable diningTable);

	public DiningTable updateDiningTable(DiningTable diningTable);

	public void deleteDiningTable(Integer id);

}