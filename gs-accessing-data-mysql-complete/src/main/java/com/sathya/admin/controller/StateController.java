
package com.sathya.admin.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.admin.entites.State;
import com.sathya.admin.service.StateService;

@RequestMapping("/States")
@RestController
public class StateController {
	private static final Logger logger = LogManager.getLogger(StateController.class);

	@Autowired
	StateService stateService;

	@GetMapping("/getAllStates")
	public List<State> getAllStates() {
		logger.info("get Allstates method execution started");
		List<State> result = null;
		try {
			result = stateService.getAllStates();
			logger.debug("result is {0}", result);
		} catch (Exception e) {
			logger.error("exception happens and exception info is {0}", e);
		}
		logger.info("get Allstate method excetion completed");
		return result;

	}

	@PostMapping("/addState")
	public State insertState(@RequestBody State state) {
		logger.info("insertState method excetion started");
		State result = null;
		try {
			result = stateService.insertState(state);
			logger.debug("input data is {0}", result);
		} catch (Exception e) {
			logger.error("input data is {0}", e);
		}
		logger.info("insertState method execution completed");
		return result;
	}

	@PutMapping("/updateState")
	public State updateState(@RequestBody State state) {
		logger.info("update method excecution started");
		State result = null;
		try {
			result = stateService.updateState(state);
			logger.debug("update data result is {0}", result);
		} catch (Exception e) {
			logger.error("input data is {0}", e);
		}
		logger.info("updated method are completed");
		return result;

	}

	@DeleteMapping("/deteleState/{id}")
	public void deteleState(@PathVariable("id") Integer id) {
		logger.info("delete method execution started");
		stateService.deleteState(id);

	}
}