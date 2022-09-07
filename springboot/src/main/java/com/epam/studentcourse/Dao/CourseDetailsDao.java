package com.epam.studentcourse.Dao;

import java.util.List;

import com.epam.studentcourse.dto.Course;


public interface CourseDetailsDao {
	
	public boolean create(Course course);
	public List<Course> listAll();

}
