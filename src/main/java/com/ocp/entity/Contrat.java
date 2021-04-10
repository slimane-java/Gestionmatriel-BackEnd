package com.ocp.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Contrat implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int Id;
	private int DelaiReponse;
	private String DateAcquisition;
	private String FinGarentir;
	private int DelaiResolution;
	@ManyToOne
	@JoinColumn(name = "IDfourniseur")
	private Fournisseur Fourniseur;
	@OneToOne
	@JoinColumn(name = "materiel")
	private Materiel materiel;
	
	
	
	public Contrat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contrat(int id, int delaiReponse, String dateAcquisition, String finGarentir, int delaiResolution,
			Fournisseur fourniseur, Materiel materiel) {
		super();
		Id = id;
		DelaiReponse = delaiReponse;
		DateAcquisition = dateAcquisition;
		FinGarentir = finGarentir;
		DelaiResolution = delaiResolution;
		Fourniseur = fourniseur;
		this.materiel = materiel;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getDelaiReponse() {
		return DelaiReponse;
	}
	public void setDelaiReponse(int delaiReponse) {
		DelaiReponse = delaiReponse;
	}
	public String getDateAcquisition() {
		return DateAcquisition;
	}
	public void setDateAcquisition(String dateAcquisition) {
		DateAcquisition = dateAcquisition;
	}
	public String getFinGarentir() {
		return FinGarentir;
	}
	public void setFinGarentir(String finGarentir) {
		FinGarentir = finGarentir;
	}
	public int getDelaiResolution() {
		return DelaiResolution;
	}
	public void setDelaiResolution(int delaiResolution) {
		DelaiResolution = delaiResolution;
	}
	public Fournisseur getFourniseur() {
		return Fourniseur;
	}
	public void setFourniseur(Fournisseur fourniseur) {
		Fourniseur = fourniseur;
	}
	public Materiel getMateriel() {
		return materiel;
	}
	public void setMateriel(Materiel materiel) {
		this.materiel = materiel;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
