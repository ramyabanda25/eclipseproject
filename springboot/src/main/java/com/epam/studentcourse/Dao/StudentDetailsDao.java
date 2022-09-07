package com.epam.studentcourse.Dao;

import java.util.List;

import com.epam.studentcourse.dto.Student;

public interface StudentDetailsDao {
	
	public boolean create(Student s);
	public Student read(int id);
	public void update(Student s);
	public void delete(int id);
	public List<Student> listAll();

}
