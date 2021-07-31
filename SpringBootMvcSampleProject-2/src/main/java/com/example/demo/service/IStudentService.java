package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface IStudentService {

	public Integer saveStudent(Student s);
	public void deleteStudent(Integer studentId);
	public Student getByStudentId(Integer studentId);
	public List<Student> getAllStudents();
	
	
}
