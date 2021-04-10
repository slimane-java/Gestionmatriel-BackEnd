package com.ocp.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Perssone implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(length = 100)
	private String matricule;
	private String Nom;
	private String Prenome;
	private String Tel;
	private String Email;
	
	@ManyToMany
	@JoinTable(name = "lignmateriel",
				joinColumns = {@JoinColumn(name="IDperssone")},
				inverseJoinColumns = {@JoinColumn(name="IDmateriel")}
	)
	private List<Materiel> materiel=new ArrayList<Materiel>();
	
	public Perssone()
	{}
	public Perssone(String matricule, String nom, String prenome, String tel, String email) {
		super();
		this.matricule = matricule;
		Nom = nom;
		Prenome = prenome;
		Tel = tel;
		Email = email;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenome() {
		return Prenome;
	}
	public void setPrenome(String prenome) {
		Prenome = prenome;
	}
	public String getTel() {
		return Tel;
	}
	public void setTel(String tel) {
		Tel = tel;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	

	
	
}
