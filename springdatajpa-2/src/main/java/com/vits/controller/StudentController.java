package com.vits.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vits.dao.CourseMysql;
import com.vits.dao.StudentMysql;
import com.vits.dto.Course;
import com.vits.dto.Student;

@Controller
public class StudentController {

	@Autowired
	StudentMysql studentmysql;

	@Autowired
	CourseMysql coursemysql;


	 @GetMapping("/") public String greetings() { return "index"; }

	@RequestMapping("/home")
	public String greeting() {
		return "studentregistration";
	}

	@GetMapping("/course")
	public String coursepage() {
		return "coursereg";
	}

	@RequestMapping("/loadcourses")
	public ModelAndView getCourses() {
		ModelAndView modelandview = new ModelAndView();
		modelandview.setViewName("studentregistration");
		coursemysql.listAll().forEach(ee -> {
			System.out.println("course==" + ee);
		});
		modelandview.addObject("courses", coursemysql.listAll());
		return modelandview;
	}

	@PostMapping("/add")
	public ModelAndView create(Student student) {
		System.out.print("Student from Form ===" + student);

		ModelAndView modelandview = new ModelAndView();
		if (studentmysql.create(student))
			modelandview.addObject("message", "Student created succesfully");
		else
			modelandview.addObject("message", "Student registration Failed");

		modelandview.setViewName("studentregistration");
		modelandview.addObject("courses", coursemysql.listAll());
		return modelandview;

	}

	@RequestMapping("list")
	public ModelAndView listall() {
		ModelAndView modelandview = new ModelAndView();
		List<Student> students = studentmysql.listAll();
		modelandview.addObject("students", students);
		modelandview.setViewName("listofstudents");
		return modelandview;
	}

	@RequestMapping("delete")
	public String delete(int id) {

		studentmysql.delete(id);
		System.out.println("deleted id=" + id);
		return "index";
	}

	@RequestMapping("edit")
	public ModelAndView edit(int id, Model model) {
		Optional<Student> student = studentmysql.read(id);
		model.addAttribute("student", student.get());

		ModelAndView modelandview = new ModelAndView();

		coursemysql.listAll().forEach(ee -> { System.out.println("course==" + ee);
		});

		modelandview.addObject("courses", coursemysql.listAll());
		modelandview.setViewName("edit");
		return modelandview;
	}

	@PostMapping("update")
	public String update(Student student) {
		// System.out.println("student updated="+student);
		studentmysql.update(student);

		return "index";
	}

	@RequestMapping("displaystudent")
	public String display(int id, Model model) {
		Optional<Student> student = studentmysql.read(id);
		model.addAttribute("student", student.get());
		return "displaystudent";
	}

	@PostMapping("/addcourse")
	public ModelAndView createCourse(Course course) {
		System.out.print("course Form ===" + course);
		ModelAndView modelandview = new ModelAndView();

		if (coursemysql.create(course))
			modelandview.addObject("message", "Course created succesfully");
		else
			modelandview.addObject("message", "Course registration Failed");

		modelandview.setViewName("coursereg");
		return modelandview;
	}

	@RequestMapping("listcourse")
	public ModelAndView listallcourses() {
		ModelAndView modelandview = new ModelAndView();
		modelandview.addObject("courses", coursemysql.listAll());
		modelandview.setViewName("listofcourses");
		return modelandview;
	}

}