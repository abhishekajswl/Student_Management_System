package com.studentmanagementsystem;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.studentmanagementsystem.entity.Student;
//import com.studentmanagementsystem.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
//	@Autowired
//	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		studentRepository.save(new Student("Abhishek", "Jaiswal", "abhi@gmail.com"));
//		studentRepository.save(new Student("Test", "Testing", "test@gmail.com"));
//		studentRepository.save(new Student("Abc", "Testing2", "abc@gmail.com"));
		
	}

}
