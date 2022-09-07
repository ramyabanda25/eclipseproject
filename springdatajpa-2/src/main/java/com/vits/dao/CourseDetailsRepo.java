package com.vits.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vits.dto.Course;

@Repository
public interface CourseDetailsRepo extends CrudRepository<Course, Integer>{

}
