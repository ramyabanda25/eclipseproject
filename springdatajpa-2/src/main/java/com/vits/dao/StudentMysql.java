package com.vits.dao;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vits.dto.Course;
import com.vits.dto.Student;

@Repository
public class StudentMysql {

	@Autowired
	StudentDetailsDao studentdetailsdao;
	
	@Autowired
	CourseDetailsRepo courseDetailRepo;
	
	public boolean create(Student student) 
	{
		studentdetailsdao.save(student);
		return true;
		
	}

	public Optional<Student> read(int id) {
		Optional<Student> student=  studentdetailsdao.findById(id);
		return student;
	}


	public void update(Student updatedstudent) {
		System.out.println("update method");
		studentdetailsdao.save(updatedstudent);

	
		
	}


	public void delete(int id) {

		Optional<Student> student=  studentdetailsdao.findById(id);
		Course course= student.get().getCourse();
		List<Student> students= course.getStudent();
		students.removeIf(std->std.getId()==id);  //deleting association
		studentdetailsdao.deleteById(id);
	
	}


	public List<Student> listAll() {
		List<Student> students = (List<Student>) studentdetailsdao.findAll();
	    return students;

	}

}
