package com.divergentsl.springweb.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.divergentsl.springweb.cms.dao.DrugDao;
import com.divergentsl.springweb.cms.entity.Drug;

@Service
public class DrugServiceImpl implements DrugService {

	@Autowired
	DrugDao drugDao;
		
	@Override
	@Transactional
	public Drug insertDrug(Drug drug) {
		return (Drug)drugDao.insert(drug);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Drug findDrug(int id) {		
		return (Drug)drugDao.find(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Drug> findAllDrug() {
		return drugDao.findAll();
	}

	@Override
	@Transactional
	public void removeDrug(int id) {
		drugDao.remove(id);
		
	}

}
