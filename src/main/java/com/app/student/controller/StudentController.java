package com.app.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.student.model.Student;
import com.app.student.serviceImpl.StudentServiceImpl;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/students")
public class StudentController {

	@Autowired
	StudentServiceImpl studentServiceImpl;

	// Create Student REST API
	@PostMapping()
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		Student saveStudent = studentServiceImpl.addStudent(student);
		return new ResponseEntity<>(saveStudent, HttpStatus.CREATED);
	}

}
