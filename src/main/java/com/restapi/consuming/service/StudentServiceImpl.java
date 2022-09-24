package com.restapi.consuming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.consuming.entity.Student;
import com.restapi.consuming.repository.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	
	
	@Override
	public List<Student> saveStudentsList(List<Student> students) {
		return studentRepository.saveAll(students);
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

}
