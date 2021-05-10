package com.divergentsl.springweb.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.divergentsl.springweb.cms.dao.PatientDao;
import com.divergentsl.springweb.cms.entity.Patient;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	PatientDao patientDao;
	
	@Override
	@Transactional
	public Patient insertPatient(Patient patient) {
		return (Patient)patientDao.insert(patient) ;
	}

	@Override
	@Transactional(readOnly = true)
	public Patient findPatient(int id) {
		return  (Patient)patientDao.find(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Patient> findAllPatient() {
		return patientDao.findAll();
	}

	@Override
	@Transactional
	public void removePatient(int id) {
		patientDao.remove(id);
		
	}
	
}
