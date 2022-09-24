package com.restapi.consuming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi.consuming.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
