package com.ocp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ocp.entity.User;

public interface UserRepository extends JpaRepository<User, String>{

}
