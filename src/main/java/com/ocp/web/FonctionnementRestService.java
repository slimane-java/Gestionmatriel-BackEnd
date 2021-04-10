package com.ocp.web;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ocp.dao.FonctionnementRepository;

import com.ocp.entity.Fonctionnement;


@RestController
@CrossOrigin("*")
public class FonctionnementRestService {
	
	@Autowired
	private FonctionnementRepository fonctionnementRepository;
	
	@RequestMapping(value = "AddFonctionnaire" ,method =RequestMethod.POST )
	public Fonctionnement AddFonctionnaires(@RequestBody Fonctionnement f) throws ParseException
	{
		
		return fonctionnementRepository.save(f);
		
	}
	
	@RequestMapping(value = "ListFonctionnaire" ,method =RequestMethod.GET )
	public List<Fonctionnement> ListFonctionnaire() throws ParseException
	{
		
		return fonctionnementRepository.findAll();
		
	}

}
