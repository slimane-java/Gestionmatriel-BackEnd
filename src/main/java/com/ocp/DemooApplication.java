package com.ocp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ocp.dao.PerssoneRepository;
import com.ocp.entity.Perssone;

@SpringBootApplication
public class DemooApplication implements CommandLineRunner{
	
	@Autowired
	private PerssoneRepository perssoneRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DemooApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		perssoneRepository.save(new Perssone("matricule", "nom", "prenome", "tel", "email"));
		//System.out.print(perssoneRepository.findById("matricule").get().getMatricule());
		
		
	}

}
