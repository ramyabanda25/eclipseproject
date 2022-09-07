package com.epam.studentcourse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.epam.studentcourse.Dao.CourseMysql;
import com.epam.studentcourse.Dao.StudentMysql;
import com.epam.studentcourse.dto.Course;
import com.epam.studentcourse.dto.Student;

@Controller
public class StudentController {
	
	
	@Autowired
	StudentMysql studentmysql;
	
	@Autowired
	CourseMysql coursemysql; 
	
	@RequestMapping("/home")
	public String greeting()
	{
		return "studentregistration";
	}
	
	@GetMapping("/course")
	public String coursepage()
	{
		return "coursereg";
	}
	
	@RequestMapping("/loadcourses")
	public ModelAndView getCourses() {
		ModelAndView modelandview=new ModelAndView();
		modelandview.setViewName("studentregistration");
		studentmysql.getAllCourses().forEach(ee -> {
			System.out.println("course==" + ee);
		});
		modelandview.addObject("courses", studentmysql.getAllCourses());
		return modelandview;
	}
	
	@PostMapping("/add")
	public ModelAndView create(Student student) {
		System.out.print("Student from Form ===" + student);	
		
		ModelAndView modelandview=new ModelAndView();
		if(studentmysql.create(student))
			modelandview.addObject("message","Student created succesfully");
		else
			modelandview.addObject("message","Student registration Failed");
		
		modelandview.setViewName("studentregistration");
		return modelandview;
	    
	}
	
	@PostMapping("/addcourse")
	public ModelAndView createCourse(Course course) {
		System.out.print("course Form ===" + course);	
		ModelAndView modelandview=new ModelAndView();
		
		if(coursemysql.create(course))
			modelandview.addObject("message","Course created succesfully");
		else
			modelandview.addObject("message","Course registration Failed");
		
		modelandview.setViewName("coursereg");
		return modelandview;
	}
	
	@RequestMapping("list")
	public ModelAndView listall(){
		ModelAndView modelandview=new ModelAndView();
		List<Student> students   = studentmysql.listAll();
		modelandview.addObject("students", students);
		modelandview.setViewName("listofstudents");
		return modelandview;
	}
	
	@RequestMapping("listcourse")
	public ModelAndView listallcourses(){
		ModelAndView modelandview=new ModelAndView();
		modelandview.setViewName("listofcourses");
		modelandview.addObject("courses",coursemysql.listAll());
		return modelandview;
	}
	
	@RequestMapping("delete")
	public String delete(int id) {
		
		studentmysql.delete(id);
		System.out.println("deleted id="+id);
		return "index";
	}

	@RequestMapping("edit")
	public ModelAndView edit(int id,Model model) {
		Student student= studentmysql.read(id);
	    model.addAttribute("student", student);
	    
	    ModelAndView modelandview=new ModelAndView();
		/*
		 * mysqlimp.getAllCourses().forEach(ee -> { System.out.println("course==" + ee);
		 * });
		 */
		modelandview.addObject("courses", studentmysql.getAllCourses());
		modelandview.setViewName("edit");
	    return modelandview;
	}
	
	@PostMapping("update")
	public String update(Student student) {
		//System.out.println("student updated="+student);
		studentmysql.update(student);
		
	    return "index";
	}
	@RequestMapping("displaystudent")
	public String display(int id,Model model) {
		Student student=studentmysql.read(id);
	    model.addAttribute("student", student);
	    return "displaystudent";
	}
}