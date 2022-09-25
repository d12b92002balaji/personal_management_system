package com.example.main;

import java.util.HashSet;

public interface service {
	
	HashSet<entity> showAll();
	public void delete();
	public void addItems(entity b);
	
	public entity findById(int id);
	
	
	
	

}
