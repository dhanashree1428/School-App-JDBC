package com.school.controller;

import com.school.dto.Teacher;
import com.school.service.TeacherService;

public class TeacherGetAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Teacher teacher=new Teacher();
    
    TeacherService teacherService=new TeacherService();
    teacherService.getAllTeacherById(teacher);
	}

}
