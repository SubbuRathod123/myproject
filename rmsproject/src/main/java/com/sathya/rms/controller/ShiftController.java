package com.sathya.rms.controller;

import java.util.Optional;

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

import com.sathya.rms.entity.Order;
import com.sathya.rms.entity.Shift;
import com.sathya.rms.service.ShiftService;

@RequestMapping("/Shift")
@RestController
public class ShiftController {

	private static final Logger logger = LogManager.getLogger(ShiftController.class);
	@Autowired
	private ShiftService shiftService;

	@PostMapping("/insertShift")
	public Shift insertShift(@RequestBody Shift shift) {
		logger.info("insertShift method execution started");

		Shift result = null;
		try {
			result = shiftService.insertShift(shift);
			logger.debug("result is {0}", result);
		} catch (Exception e) {
			logger.error("input data is {0}", e);
		}
		logger.info("insertShift method execution completed");
		return result;

	}

	@PutMapping("/updateShift")
	public Shift updateShift(@RequestBody Shift shift) {
		logger.info("updateShift method execution started");
		Shift result = null;
		try {
			result = shiftService.updateShift(shift);
			logger.debug("result is {0}", result);
		} catch (Exception e) {
			logger.error("input data is {0}", e);
		}
		logger.info("updateShift method execution completed");
		return result;

	}

	@DeleteMapping("/deleteShift/{id}")
	public void deleteShiftById(@PathVariable("id") Integer id) {
		shiftService.deleteShiftById(id);
	}

	@GetMapping("/getAllShift")
	public Iterable<Shift> getAllShift() {
		logger.info("get All Shift method execution started");
		Iterable<Shift> result = null;
		try {
			result = shiftService.getAllShift();
			logger.debug("result is {0}", result);
		} catch (Exception e) {
			logger.error("exception happens and exception info is {0} ", e);
		}
		logger.info("get All Shift method execution completed");

		return result;

	}

	@GetMapping("/getShift/{id}")
	public Optional<Shift> getUsersById(@PathVariable("id") Integer id) {
		logger.info("get Shift method execution started");
		Optional<Shift> result = null;
		try {
			result = shiftService.getShiftById(id);
			logger.debug("result is {0}", result);
		} catch (Exception e) {
			logger.error("exception happens and exception info is {0} ", e);
		}
		logger.info("get Shift method execution completed");

		return result;

	}
}
