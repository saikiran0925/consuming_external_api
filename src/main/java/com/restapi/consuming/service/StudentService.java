package com.restapi.consuming.service;

import java.util.List;

import com.restapi.consuming.entity.Student;

public interface StudentService {

	List<Student> saveStudentsList(List<Student> students);

	Student saveStudent(Student student);

	List<Student> getAllStudents();

	List<Student> saveStudentObject();

}
