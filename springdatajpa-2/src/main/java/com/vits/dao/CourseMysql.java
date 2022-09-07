package com.vits.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vits.dto.Course;

@Service
public class CourseMysql{
	
	@Autowired
	CourseDetailsRepo coursedetailsrepo;


	public boolean create(Course course) {
		coursedetailsrepo.save(course);
		return true;
		
	}


	public List<Course> listAll() {
	    return (List<Course>) coursedetailsrepo.findAll();
	}

}
