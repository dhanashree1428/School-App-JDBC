package com.school.controller;

import com.school.dto.Student;
import com.school.service.StudentService;

public class Studentget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.setId(5);
		
		StudentService studentService=new StudentService();
	    studentService.getStudentById(student);	
	}

}
