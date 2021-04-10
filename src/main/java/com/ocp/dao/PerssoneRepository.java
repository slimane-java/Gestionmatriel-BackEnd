package com.ocp.dao;




import org.springframework.data.jpa.repository.JpaRepository;


import com.ocp.entity.Perssone;

public interface PerssoneRepository extends JpaRepository<Perssone, String> {
	

}
