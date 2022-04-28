package com.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentmanagementsystem.entity.Student;

//JpaRepository already has @Repository annotation so need to mansion here
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
