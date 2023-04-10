package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Student;
import com.example.model.StudentID;

public interface StudentRepository extends JpaRepository<Student, StudentID> {

}
