package com.ocp.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
@Entity
@PrimaryKeyJoinColumn(name="matricule")
public class Fournisseur extends Perssone implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String Representant;
	

	public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fournisseur(String matricule, String nom, String prenome, String tel, String email, String representant) {
		super(matricule, nom, prenome, tel, email);
		Representant = representant;
	}

	@OneToMany(mappedBy = "contrat")
	
	public String getRepresentant() {
		return Representant;
	}

	public void setRepresentant(String representant) {
		Representant = representant;
	}

	

	

}
