package com.divergentsl.springweb.cms.service;

import java.util.List;

import com.divergentsl.springweb.cms.entity.Doctor;

public interface DoctorService {
	
	public void insertDoctor(String name, String fees);

	public Doctor findDoctor(int id);

	public List<Doctor> findAllDoctor();

	public void removeDoctor(int id);

}
