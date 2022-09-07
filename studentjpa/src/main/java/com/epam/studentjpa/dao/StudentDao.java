package com.epam.studentjpa.dao;

import java.util.List;

import com.epam.studentjpa.dto.Student;

public interface StudentDao {
	public boolean create(Student student);
	public Student findByStudentID(int studentID);
	public List<Student> findAllStudents();
	public void deleteStudent(Integer studentID);
	public boolean updateStudent(int studentID, Student updatedstudent);
}
