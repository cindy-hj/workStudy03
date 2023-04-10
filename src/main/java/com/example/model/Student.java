package com.example.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
@IdClass(StudentID.class)
public class Student implements Serializable {
	@Id
	@Column(name="student_id")
	private String studentId;
	
	@Id
	private String name;
	
	private int schoolId;
	private int score;
	
}
