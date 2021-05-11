package com.divergentsl.springweb.cms.service;

import java.util.List;

import com.divergentsl.springweb.cms.entity.Labtest;

public interface LabtestService {
	
	public void insertLabtest(String name, String patientname);

	public Labtest findLabtest(int id);

	public List<Labtest> findAllLabtest();

	public void removeLabtest(int id);
	

}
