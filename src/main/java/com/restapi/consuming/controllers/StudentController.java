package com.restapi.consuming.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.consuming.entity.Student;
import com.restapi.consuming.service.StudentServiceImpl;

@RestController
public class StudentController {

	@Autowired
	StudentServiceImpl studentService;

	@PostMapping("/students")
	public List<Student> studentsList(@RequestBody List<Student> students) {
		return studentService.saveStudentsList(students);
	}

	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}

	@GetMapping("/")
	public List<Student> getStudents() {
		return studentService.getAllStudents();
	}

	@PostMapping("/rest")
	public List<Student> consumingREST() {
		return studentService.saveStudentObject();

	}

}
