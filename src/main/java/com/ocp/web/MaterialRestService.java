package com.ocp.web;



import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.catalina.LifecycleListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ocp.dao.MaterielRepository;
import com.ocp.entity.Materiel;


@RestController
@CrossOrigin("*")
public class MaterialRestService {
	@Autowired
	private MaterielRepository materielRepository;
	
	@RequestMapping(value = "AddMaterial" ,method =RequestMethod.POST )
	public Materiel MaterialHome(@RequestBody Materiel m) throws ParseException
	{
		
		return materielRepository.save(m);
		
	}
	
	@RequestMapping(value = "ListMateriel" ,method =RequestMethod.GET )
  public List<Materiel>GetMateriel()
  {
	  return materielRepository.findAll();
  }
	
	
	@RequestMapping(value = "See" ,method =RequestMethod.POST )
	public String aff(@RequestBody Materiel m)
	{
	
		
		return "home";
		
	}
}
