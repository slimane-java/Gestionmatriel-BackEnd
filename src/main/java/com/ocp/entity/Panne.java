package com.ocp.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Panne {
	@Id
	private int NumeroDemande;
	private Date DateAcquisition;
	private Date DateResolution;
	private String Etat;
	private String Description;
	@ManyToOne
	@JoinColumn(name = "IDmateriel")
	private Materiel Materiel;
	@ManyToOne
	@JoinColumn(name = "IDfonctionnement")
	private Fonctionnement Fonctionnement;
	public Panne(int numeroDemande, Date dateAcquisition, Date dateResolution, String etat, String description,
			com.ocp.entity.Materiel materiel, com.ocp.entity.Fonctionnement fonctionnement) {
		super();
		NumeroDemande = numeroDemande;
		DateAcquisition = dateAcquisition;
		DateResolution = dateResolution;
		Etat = etat;
		Description = description;
		Materiel = materiel;
		Fonctionnement = fonctionnement;
	}
	public int getNumeroDemande() {
		return NumeroDemande;
	}
	public void setNumeroDemande(int numeroDemande) {
		NumeroDemande = numeroDemande;
	}
	public Date getDateAcquisition() {
		return DateAcquisition;
	}
	public void setDateAcquisition(Date dateAcquisition) {
		DateAcquisition = dateAcquisition;
	}
	public Date getDateResolution() {
		return DateResolution;
	}
	public void setDateResolution(Date dateResolution) {
		DateResolution = dateResolution;
	}
	public String getEtat() {
		return Etat;
	}
	public void setEtat(String etat) {
		Etat = etat;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Materiel getMateriel() {
		return Materiel;
	}
	public void setMateriel(Materiel materiel) {
		Materiel = materiel;
	}
	public Fonctionnement getFonctionnement() {
		return Fonctionnement;
	}
	public void setFonctionnement(Fonctionnement fonctionnement) {
		Fonctionnement = fonctionnement;
	}
	
	

}
