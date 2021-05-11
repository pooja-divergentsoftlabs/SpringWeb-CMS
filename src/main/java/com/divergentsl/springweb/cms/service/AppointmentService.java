package com.divergentsl.springweb.cms.service;

import java.util.List;

import com.divergentsl.springweb.cms.entity.Appointment;

public interface AppointmentService {
	
	public void insertAppointment(String name, String date);

	public Appointment findAppointment(int id);

	public List<Appointment> findAllAppointment();

	public void removeAppointment(int id);
	

}
