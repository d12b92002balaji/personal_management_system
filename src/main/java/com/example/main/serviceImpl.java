package com.example.main;

import java.util.HashSet;

public class serviceImpl implements service{
	
	HashSet<entity> list=new HashSet<entity>();
	
	@Override
	public HashSet<entity> showAll() {
		if(list.isEmpty())
			return null;
		return list;
	}

	@Override
	public void delete() {
		list.clear();
	}

	@Override
	public void addItems(entity b) {
		list.add(b);
		
	}

	@Override
	public entity findById(int id) {
		
		entity data=list.stream().filter(b->b.getId()==id).findAny().orElse(null);
		return data;
	}
	
	
	
	
	
	
	

}
