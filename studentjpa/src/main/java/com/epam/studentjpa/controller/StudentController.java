package com.epam.studentjpa.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.epam.studentjpa.dao.StudentDaoImpl;
import com.epam.studentjpa.dto.Student;

@Controller
public class StudentController {

	@Autowired
	StudentDaoImpl studentDaoImpl;

	@RequestMapping("/")
	public String greeting() {
		return "index";
	}

	@RequestMapping("/createStudent")
	public String createStudent() {
		return "createStudent";
	}

	@RequestMapping("/displayStudents")
	public ModelAndView displayStudents() {
		ModelAndView mvobj = new ModelAndView();
		mvobj.addObject("studentlist", studentDaoImpl.findAllStudents());
		mvobj.setViewName("displayStudents");
		return mvobj;
	}

	@RequestMapping("/createsuccess")
	public ModelAndView createStudentForm(Student student) {
		ModelAndView mvobj = new ModelAndView();
		if (studentDaoImpl.create(student)) {
			mvobj.addObject("createstatus", "Student created successfully");
		} else {
			mvobj.addObject("createstatus", "Student not created successfully");
		}
		mvobj.setViewName("createStudent");
		return mvobj;
	}

	@RequestMapping("/deletestudent")
	public ModelAndView deleteStudent(String studentID) {
		ModelAndView mvobj = new ModelAndView();
		studentDaoImpl.deleteStudent(Integer.parseInt(studentID));
		mvobj.addObject("studentlist", studentDaoImpl.findAllStudents());
		mvobj.setViewName("displayStudents");
		return mvobj;
	}

	@RequestMapping("/editstudent")
	public ModelAndView updateStudent(String studentID) {
		ModelAndView mvobj = new ModelAndView();
		Student student = studentDaoImpl.findByStudentID(Integer.parseInt(studentID));
		mvobj.addObject("student_data", student);
		mvobj.setViewName("updateStudent");
		return mvobj;
	}

	@RequestMapping("/editsuccess")
	public ModelAndView updateSuccess(Student student) {
		ModelAndView mvobj = new ModelAndView();
		boolean status = studentDaoImpl.updateStudent(student.getStudentID(), student);
		if (status) {
			mvobj.addObject("updatestatus", "Student updated successfully");
		} else {
			mvobj.addObject("updatestatus", "Student not updated successfully");
		}
		mvobj.setViewName("updateStudent");
		return mvobj;
	}
}
