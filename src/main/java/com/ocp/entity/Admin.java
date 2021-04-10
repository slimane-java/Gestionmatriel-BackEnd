package com.ocp.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
@Entity
@PrimaryKeyJoinColumn(name="matricule")
public class Admin extends Fonctionnement implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String matricule, String nom, String prenome, String tel, String email, String service, String site,
			String password) {
		super(matricule, nom, prenome, tel, email, service, site, password);
		// TODO Auto-generated constructor stub
	}

	

}
