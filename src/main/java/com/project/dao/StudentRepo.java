package com.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentDetails, Integer>{

	//@Query(value = "select sr from StudentDetails sr where sr.sYear = :year")
	//public List<StudentDetails> findByYear(Integer year);

	
}










