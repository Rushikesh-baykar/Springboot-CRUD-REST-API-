package com.app.student.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.app.student.model.Student;
import com.app.student.repository.StudentRepository;
import com.app.student.serviceInterface.StudentServiceInterface;

@Service
public class StudentServiceImpl implements StudentServiceInterface {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student addStudent(Student student) {
		return this.studentRepository.save(student);

	}

}
