package com.ocp.web;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ocp.dao.PerssoneRepository;
import com.ocp.dao.UserRepository;
import com.ocp.entity.Fonctionnement;
import com.ocp.entity.Perssone;
import com.ocp.entity.User;

@RestController
@CrossOrigin("*")
public class UserRestService {
	@Autowired
	private UserRepository userrepository;
	
	@RequestMapping(value = "AddUser",method = RequestMethod.POST)
	public User AddUser(@RequestBody User u)
	{
		
	
		 return userrepository.save(u);
		
	}
	
	@RequestMapping(value = "ListUser" ,method =RequestMethod.GET )
	public List<User> ListUser() throws ParseException
	{
		
		return userrepository.findAll();
		
	}

}
