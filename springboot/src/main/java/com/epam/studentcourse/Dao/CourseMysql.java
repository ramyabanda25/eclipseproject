package com.epam.studentcourse.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.epam.studentcourse.dto.Course;


@Component
@Primary
@Transactional
public class CourseMysql implements CourseDetailsDao{
	
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("TestPersistence");
	EntityManager em=factory.createEntityManager();

	@Override
	public boolean create(Course course) {
		em.getTransaction().begin();
		em.persist(course);
		em.getTransaction().commit();
		return true;
		
	}

	@Override
	public List<Course> listAll() {
	    Query query =  em.createQuery("SELECT e FROM Course e");
	    return (List<Course>) query.getResultList();
	}

}
