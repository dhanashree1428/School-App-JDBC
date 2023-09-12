package com.school.controller;

import com.school.dto.Student;
import com.school.service.StudentService;

public class StudentGetAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student student=new Student();
    StudentService studentService=new StudentService();
    studentService.getAllStudent(student);
	}

}
