package com.divergentsl.springweb.cms.dao;

import java.util.List;

public interface LabtestDao<T> {
	
	public T insert(T labtest );
	
	public T find(int id);

	public List<T> findAll();

	public void remove(int id);

}
