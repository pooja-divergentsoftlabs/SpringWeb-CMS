package com.divergentsl.springweb.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.divergentsl.springweb.cms.dao.LabtestDao;
import com.divergentsl.springweb.cms.entity.Labtest;

@Service
public class LabtestServiceImpl implements LabtestService {
	
	@Autowired
	LabtestDao labtestDao;
	

	@Override
	@Transactional
	public Labtest insertLabtest(Labtest labtest) {
		return (Labtest)labtestDao.insert(labtest);
	}

	@Override
	@Transactional(readOnly = true)
	public Labtest findLabtest(int id) {
				return (Labtest)labtestDao.find(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Labtest> findAllLabtest() {
		return labtestDao.findAll();
	}

	@Override
	@Transactional
	public void removeLabtest(int id) {
		labtestDao.remove(id);
		
	}

}
