package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="std")
public class Student {

	@Id
	@GeneratedValue
	@Column(name="sid")
	private Integer studentId;
	@Column(name="sname")
	private String studentName;
	@Column(name="sfee")
	private Double studentFee;
	public Student() {
		super();
	}
	public Student(Integer studentId, String studentName, Double studentFee) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFee = studentFee;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Double getStudentFee() {
		return studentFee;
	}
	public void setStudentFee(Double studentFee) {
		this.studentFee = studentFee;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFee=" + studentFee + "]";
	}
		
	
}
