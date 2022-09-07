package com.epam.studentjpa.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.epam.studentjpa.dto.Course;
import com.epam.studentjpa.dto.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("my-local-mysql");
	EntityManager eManager = emFactory.createEntityManager();

	@Override
	public boolean create(Student student) {
		boolean status = false;
		if (student != null) {
			/*
			 * List<Student> students = new ArrayList<>(); students.add(student); Course
			 * course = student.getCourse(); course.setStudent(students);
			 */
			eManager.getTransaction().begin();
			Course course = student.getCourse();
			if (eManager.find(Course.class, course.getCourseID()) != null) {
				eManager.persist(student);
			} else {
				eManager.persist(student);
				eManager.persist(course);
			}
			eManager.getTransaction().commit();
			status = true;
			eManager.clear();
		}
		return status;
	}

	@Override
	public Student findByStudentID(int studentID) {
		return eManager.find(Student.class,studentID);		
	}

	@Override
	public List<Student> findAllStudents() {
		TypedQuery<Student> query = eManager.createQuery("from Student",Student.class);
		//return eManager.createNativeQuery("select s.* from Student s",Student.class).getResultList();
		return query.getResultList();
	}

	@Override
	public void deleteStudent(Integer studentID) {
		//Student student = eManager.find(Student.class,studentID);
		//eManager.remove(student);
		eManager.getTransaction().begin();		
		eManager.createNativeQuery("delete from student where studentID = "+studentID).executeUpdate();
		eManager.getTransaction().commit();
	}

	@Override
	public boolean updateStudent(int studentID, Student updatedstudent) {
		Student student = eManager.find(Student.class,studentID);
		boolean status = false;
		if(updatedstudent != null) {
			student.setStudentName(updatedstudent.getStudentName());
			student.setStudentYearOfJoining(updatedstudent.getStudentYearOfJoining());
			student.setCourse(updatedstudent.getCourse());
			eManager.getTransaction().begin();
			Course course = student.getCourse();
			if (eManager.find(Course.class, course.getCourseID()) != null) {
				eManager.persist(student);
			} else {
				eManager.persist(student);
				eManager.persist(course);
			}
			eManager.getTransaction().commit();
			status = true;
			eManager.clear();
		}
		return status;
	}

}
