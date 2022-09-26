package com.restapi.consuming.service;

import java.lang.reflect.Type;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.restapi.consuming.entity.Student;
import com.restapi.consuming.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	RestTemplate restTemplate;

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

	@Override
	public List<Student> saveStudentObject() {
		Gson json = new Gson();
		String url = "http://localhost:9000/students";
		String objects = restTemplate.getForObject(url, String.class);
		Type list1 = new TypeToken<List<Student>>() {
		}.getType();
		List<Student> list2 = json.fromJson(objects, list1);
		return studentRepository.saveAll(list2);
	}

}
