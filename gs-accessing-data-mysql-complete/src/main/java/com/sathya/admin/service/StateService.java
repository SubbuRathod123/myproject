package com.sathya.admin.service;

import java.util.List;

import com.sathya.admin.entites.State;

public interface StateService {

	public List<State> findAll();

	public State insertState(State state);

	public void deleteState(Integer id);

	public State updateState(State state);

	public List<State> getAllStates();

}
