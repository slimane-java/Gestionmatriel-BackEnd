package com.ocp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ocp.entity.Materiel;

public interface MaterielRepository extends JpaRepository<Materiel,String> {

}
