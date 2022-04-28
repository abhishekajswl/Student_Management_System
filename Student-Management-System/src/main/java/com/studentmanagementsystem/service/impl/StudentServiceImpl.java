package com.studentmanagementsystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.studentmanagementsystem.entity.Student;
import com.studentmanagementsystem.repository.StudentRepository;
import com.studentmanagementsystem.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	//No need to give @Autowired annotation, becoz we have only one field and only one constructor
	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}



	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}



	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}



	@Override
	public Student getStudentById(int id) {
		return studentRepository.findById(id).get();
	}



	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}



	@Override
	public void deleteStudent(int id) {
		studentRepository.deleteById(id);
	}

}
