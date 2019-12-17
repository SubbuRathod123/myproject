package com.sathya.rms.service;

import java.util.Optional;

import com.sathya.rms.entity.Order;
import com.sathya.rms.entity.Shift;

public interface ShiftService {

	public Shift insertShift(Shift shift);

	public Shift updateShift(Shift shift);

	public void deleteShiftById(Integer id);

	public Iterable<Shift> getAllShift();

	public Optional<Shift> getShiftById(Integer id);

}
