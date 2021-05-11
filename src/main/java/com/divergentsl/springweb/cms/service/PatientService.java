package com.divergentsl.springweb.cms.service;

import java.util.List;

import com.divergentsl.springweb.cms.entity.Patient;


public interface PatientService {
	
	public void insertPatient(String name,String address, String contactnumber);

	public Patient findPatient(int id);

	public List<Patient> findAllPatient();

	public void removePatient(int id);
	

}
