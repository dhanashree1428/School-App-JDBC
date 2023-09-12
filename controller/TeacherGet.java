package com.school.controller;

import com.school.dao.TeacherDao;
import com.school.dto.Teacher;
import com.school.service.TeacherService;

public class TeacherGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teacher=new Teacher();
		teacher.setId(2);
		
    TeacherService teacherService=new TeacherService();
    teacherService.getTeacherById(teacher);
    
   
	}

}
