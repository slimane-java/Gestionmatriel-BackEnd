package com.ocp.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Materiel {
	@Id
	@Column(length = 100)
	private String Matricule;
	private String Type;
	private String Marque;
	private String Model;
	private Date DateAcquisition;
	private Date MitteEnService;
	private String Etat;
	
	@OneToOne(mappedBy = "materiel")
	private Contrat contrat;
	@ManyToMany(mappedBy ="materiel" )
	private List<Perssone>perssone=new ArrayList<Perssone>();
	
	
	public Materiel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Materiel(String matricule, String type, String marque, String model, Date dateAcquisition,
			Date mitteEnService, Date finGarentir, String etat) {
		super();
		Matricule = matricule;
		Type = type;
		Marque = marque;
		Model = model;
		DateAcquisition = dateAcquisition;
		MitteEnService = mitteEnService;
		Etat = etat;
	}
	
	@OneToMany(mappedBy = "panne")
	public String getMatricule() {
		return Matricule;
	}
	public void setMatricule(String matricule) {
		Matricule = matricule;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getMarque() {
		return Marque;
	}
	public void setMarque(String marque) {
		Marque = marque;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public Date getDateAcquisition() {
		return DateAcquisition;
	}
	public void setDateAcquisition(Date dateAcquisition) {
		DateAcquisition = dateAcquisition;
	}
	public Date getMitteEnService() {
		return MitteEnService;
	}
	public void setMitteEnService(Date mitteEnService) {
		MitteEnService = mitteEnService;
	}
	
	public String getEtat() {
		return Etat;
	}
	public void setEtat(String etat) {
		Etat = etat;
	}
	
	

}
