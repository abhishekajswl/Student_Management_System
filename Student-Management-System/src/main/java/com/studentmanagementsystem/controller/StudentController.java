package com.studentmanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.studentmanagementsystem.entity.Student;
import com.studentmanagementsystem.service.StudentService;

@Controller
public class StudentController {
	
	//No need to give @Autoeired becoz we have only one contructor/field
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	
	//http://localhost:8080/students
	//Handler method to handle Listing of all the students and return Model & View
	@GetMapping("/students")
	public String listAllStdent(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students"; //returning 'students' View.
	}
	
	
	//Handler methods to add the student
	@GetMapping("/students/new")
	public String addNewStudent(Model model) {
		
		//create empty student
		Student student1=new Student();
		model.addAttribute("student", student1);
		return "add_student";
	}
	
	@PostMapping("/students")
	public String addStudent(@ModelAttribute("student") Student student) {
		studentService.addStudent(student);
		return "redirect:/students";
	}
	
	
	//Handler methods to update the student
	@GetMapping("/students/update/{id}")
	public String updateStudentForm(@PathVariable int id, Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "update_student";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable int id, @ModelAttribute("student") Student student, Model model) {
		//get existing student by Id
//		Student existingStudent = studentService.getStudentById(id);
//		existingStudent.setId(student.getId());
//		existingStudent.setFirstName(student.getFirstName());
//		existingStudent.setLastName(student.getLastName());
//		existingStudent.setEmail(student.getEmail());
		
		//Update student
		//studentService.updateStudent(existingStudent);
		studentService.updateStudent(student);
		return "redirect:/students";
	}
	
	
	
	//Handler method to delete the student
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable int id) {
		studentService.deleteStudent(id);
		return "redirect:/students";
	}
	

}
