package com.sathya.admin.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.admin.data.StateRepository;
import com.sathya.admin.entites.State;

@Service
public class StateServiceImpl implements StateService {

	@Autowired
	StateRepository stateRepository;

	@Override
	public List<State> findAll() {
		return (List<State>) stateRepository.findAll();

	}
@Transactional
	public State insertState(State state) {
		return stateRepository.save(state);
	}

	
	public void deleteState(Integer id) {
		stateRepository.deleteById(id);

	}

	@Transactional
	public State updateState(State state) {
		return stateRepository.save(state);
	}
	@Override
	public List<State> getAllStates() {
		// TODO Auto-generated method stub
		return null;
	}

}
 