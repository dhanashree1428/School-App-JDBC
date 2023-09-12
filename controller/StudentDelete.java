package com.school.controller;

import com.school.dto.Student;
import com.school.service.StudentService;

public class StudentDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentService studentService=new StudentService();
		boolean res=studentService.deleteStudentById(4);
		System.out.println(res); 
		}
	}


