package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepository;
import com.example.demo.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService{

	@Autowired
	private StudentRepository repo;
	
	
	@Override
	public Integer saveStudent(Student s) {
		s=repo.save(s);
		Integer studentId=s.getStudentId();
		return studentId;
	}

	@Override
	public void deleteStudent(Integer studentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student getByStudentId(Integer studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
