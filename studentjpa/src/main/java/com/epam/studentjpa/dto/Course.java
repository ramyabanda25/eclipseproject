package com.epam.studentjpa.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="course")
public class Course {
	
	@Id
	private Integer courseID;
	
	private String courseName;
	
	@OneToMany(mappedBy = "course",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Student> student;
	
	public Integer getCourseID() {
		return courseID;
	}
	public void setCourseID(Integer courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "Course [courseID=" + courseID + ", courseName=" + courseName + "]";
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		//student.forEach(s->s.setCourse(this));
		this.student = student;
	}
	
	
}
