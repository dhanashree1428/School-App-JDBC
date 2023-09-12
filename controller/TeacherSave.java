package com.school.controller;

import com.school.service.TeacherService;
import com.school.dto.Teacher;

public class TeacherController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Teacher teacher=new Teacher();
   teacher.setId(1);
   teacher.setName("Dhanashree");
   teacher.setEmail("dhanashree@mail.com");
  TeacherService teacherService=new TeacherService();
	Teacher t=teacherService.saveTeacher(teacher);
	if(t!=null) {
		System.out.println(t.getId()+" saved succesfully...");
   
	}
	}
}
