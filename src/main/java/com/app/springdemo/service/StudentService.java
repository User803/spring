package com.app.springdemo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.springdemo.model.Student;

@Service
public class StudentService {
	
	public List<Student> findAllStudents() {
		return List.of(
				new Student("Jack", "Smith", LocalDate.now(), "jack@example.com", 25),
				new Student("Bro", "Code", LocalDate.now(), "bro@example.com", 21));
	}

}
