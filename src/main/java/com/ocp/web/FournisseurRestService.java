package com.ocp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ocp.dao.FournisseurRepository;
import com.ocp.entity.Fournisseur;

@RestController
@CrossOrigin("*")
public class FournisseurRestService {
	
	@Autowired
	private FournisseurRepository fournisseurRepository;
	
	@RequestMapping(value = "AddFournisseur" ,method =RequestMethod.POST )
	public Fournisseur AddFournisseur(@RequestBody Fournisseur f)
	{
		return fournisseurRepository.save(f);
	}
	
	@RequestMapping(value = "c" ,method =RequestMethod.GET )
	public List<Fournisseur>  ListFournisseur()
	{
		return fournisseurRepository.findAll();
	}


}
