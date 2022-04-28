package com.studentmanagementsystem.service;

import java.util.List;

import com.studentmanagementsystem.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents();
	
	Student addStudent(Student student);
	
	Student getStudentById(int id);
	
	Student updateStudent(Student student);
	
	void deleteStudent(int id);

}
