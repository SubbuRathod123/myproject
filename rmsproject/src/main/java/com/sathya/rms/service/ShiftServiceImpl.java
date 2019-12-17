package com.sathya.rms.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.entity.Order;
import com.sathya.rms.entity.Shift;
import com.sathya.rms.repository.ShiftRepository;

@Service
public class ShiftServiceImpl implements ShiftService {
	@Autowired
	private ShiftRepository shiftRepository;

	@Transactional
	public Shift insertShift(Shift shift) {

		return shiftRepository.save(shift);
	}

	@Transactional
	public Shift updateShift(Shift shift) {

		return shiftRepository.save(shift);
	}

	@Transactional
	public void deleteShiftById(Integer id) {
		shiftRepository.deleteById(id);

	}

	@Override
	public Iterable<Shift> getAllShift() {

		return shiftRepository.findAll();
	}

	@Override
	public Optional<Shift> getShiftById(Integer id) {

		return shiftRepository.findById(id);
	}

}
