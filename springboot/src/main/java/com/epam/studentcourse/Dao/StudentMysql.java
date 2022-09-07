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
import com.epam.studentcourse.dto.Student;

@Component
@Primary
@Transactional
public class StudentMysql implements StudentDetailsDao{
	
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("TestPersistence");
	EntityManager em=factory.createEntityManager();
	
	@Override
	public boolean create(Student student) 
	{
		em.clear();
		em.getTransaction().begin();
		System.out.println(student.getCourse().getCname() + "==Course in db===" + student.getCourse().getCid());
		em.persist(student);
		em.getTransaction().commit();
		return true;
		
	}

	@Override
	public Student read(int id) {
		Student student=em.find(Student.class, id);
		return student;
	}

	@Override
	public void update(Student updatedstudent) {
		System.out.println("update method");
		Student student = em.find(Student.class,updatedstudent.getId());
		
		if(updatedstudent != null) {
			student.setName(updatedstudent.getName());
			student.setYoj(updatedstudent.getYoj());
			int cid= updatedstudent.getCourse().getCid();
			Course course =em.find(Course.class, cid);
			student.setCourse(course);
			System.out.println("course="+cid);
			System.out.println("course="+ course);

			em.getTransaction().begin();
			em.persist(student);
			em.getTransaction().commit();
			em.clear();
		}
	
		
	}

	@Override
	public void delete(int id) {
		//Student student=em.find(Student.class,id);
		em.getTransaction().begin();
		em.createNativeQuery("delete from students where id = "+id).executeUpdate();
		//em.remove(student);
		em.getTransaction().commit();
	
	}

	@Override
	public List<Student> listAll() {
	    Query query =  em.createQuery("SELECT e FROM Student e");
	    return (List<Student>) query.getResultList();

	}

	public List<Course> getAllCourses() {
	    Query query =  em.createQuery("SELECT e FROM Course e");
	    return (List<Course>) query.getResultList();

	}

	
}
