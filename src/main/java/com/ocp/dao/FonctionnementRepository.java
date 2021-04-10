package com.ocp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ocp.entity.Fonctionnement;

public interface FonctionnementRepository extends JpaRepository<Fonctionnement, String>{

}
