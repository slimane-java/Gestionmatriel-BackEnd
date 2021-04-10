package com.ocp.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
@Entity
@PrimaryKeyJoinColumn(name="matricule")
@Inheritance(strategy = InheritanceType.JOINED)
public class Fonctionnement extends User implements Serializable{

	/**
	 * 
	 */
	@OneToMany(mappedBy = "panne")
	private static final long serialVersionUID = 1L;
	private String Password;
	
	

	public Fonctionnement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fonctionnement(String matricule, String nom, String prenome, String tel, String email, String service,
			String site, String password) {
		super(matricule, nom, prenome, tel, email, service, site);
		Password = password;
	}


	//@OneToMany(mappedBy = "panne")
	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	
	


}
