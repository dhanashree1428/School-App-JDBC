package com.school.controller;

import com.school.dto.Student;
import com.school.service.StudentService;

public class StudentController {
  public static void main(String[] args) {
	Student student=new Student();
	student.setId(1);
	student.setName("Dhanashree");
	student.setEmail("dhanashree@mail.com");
	
	StudentService studentService=new StudentService();
	Student s=studentService.saveStudent(student);
	if(s!=null) {
		System.out.println(s.getId()+" saved Successfully");
	}
}
}
