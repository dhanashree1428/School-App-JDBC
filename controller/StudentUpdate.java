package com.school.controller;

import com.school.service.StudentService;

public class StudentUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentService studentService = new StudentService();
		
		boolean res = studentService.updateStudentByID("abc","abc@mail.com", 3);
		System.out.println(res);
}
}