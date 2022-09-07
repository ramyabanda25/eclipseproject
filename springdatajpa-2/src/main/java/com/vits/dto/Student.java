package com.vits.dto;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
//@Table(name = "Students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;

	//@ManyToOne(cascade = CascadeType.MERGE)
	@ManyToOne
	Course course;

	int yoj;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public int getYoj() {
		return yoj;
	}

	public void setYoj(int yoj) {
		this.yoj = yoj;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", courseid=" + course.getCid() + ", courseName="
				+ course.getCname() + " " + ", yoj=" + yoj + "]";
	}

}
