package com.divergentsl.springweb.cms.service;

import java.util.List;

import com.divergentsl.springweb.cms.entity.Drug;

public interface DrugService {

	public Drug insertDrug(Drug drug);

	public Drug findDrug(int id);

	public List<Drug> findAllDrug();

	public void removeDrug(int id);
}
