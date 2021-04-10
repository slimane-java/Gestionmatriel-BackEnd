package com.ocp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ocp.dao.PerssoneRepository;
import com.ocp.entity.Perssone;
import com.ocp.entity.User;

@RestController
@CrossOrigin("*")
public class PerssoneRestService {
	@Autowired
	private PerssoneRepository perssoneRepository;
	
	@RequestMapping(value = "AddPerssoneUser",method = RequestMethod.POST)
	public Perssone Home(@RequestBody Perssone u)
	{
		
	
		return perssoneRepository.save(u);
	}
	
	@RequestMapping(value = "ListPerssoneUser",method = RequestMethod.GET)
	public List<Perssone> ListPerssone()
	{
		
	
		return perssoneRepository.findAll();
	}
	

}
