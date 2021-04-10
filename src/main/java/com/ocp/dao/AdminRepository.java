package com.ocp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ocp.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, String>{

}
