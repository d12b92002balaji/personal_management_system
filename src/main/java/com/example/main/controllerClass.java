package com.example.main;

import java.util.HashSet;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerClass {
	
	
	@Autowired
	serviceImpl serviceClass;
	
	@PostMapping("/")
	public void addBook(@RequestBody entity b) {
		serviceClass.addItems(b);
	}
	
	@GetMapping("/findAll")
	public HashSet<entity> showall(){
		return serviceClass.showAll();
	}
	
	@GetMapping("/findbyid/{id}")
	public entity findById(@PathVariable int id) {
		return serviceClass.findById(id);
	}
	
	@DeleteMapping("/delete")
	public void deleteId() {
	 serviceClass.delete();
	}

}
