package com.epam.studentjpa.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentID;
	private String studentName;
	private int studentYearOfJoining;
	
	@ManyToOne
	private Course course;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getStudentID() {
		return studentID;
	}

	public void setStudentID(Integer studentID) {
		this.studentID = studentID;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public int getStudentYearOfJoining() {
		return studentYearOfJoining;
	}

	public void setStudentYearOfJoining(int studentYearOfJoining) {
		this.studentYearOfJoining = studentYearOfJoining;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentID=" + studentID + ", course=" + course
				+ ", studentYearOfJoining=" + studentYearOfJoining + "]";
	}
}
