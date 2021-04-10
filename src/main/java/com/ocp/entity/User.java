package com.ocp.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="matricule")
@Inheritance(strategy = InheritanceType.JOINED)
public class User extends Perssone implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Service;
	private String Site;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String matricule, String nom, String prenome, String tel, String email, String service, String site) {
		super(matricule, nom, prenome, tel, email);
		Service = service;
		Site = site;
	}
	public String getService() {
		return Service;
	}
	public void setService(String service) {
		Service = service;
	}
	public String getSite() {
		return Site;
	}
	public void setSite(String site) {
		Site = site;
	}
	
	
	
	

}
