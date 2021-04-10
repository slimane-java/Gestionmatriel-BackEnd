package com.ocp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ocp.entity.Fournisseur;

public interface FournisseurRepository extends JpaRepository<Fournisseur, String> {

}
