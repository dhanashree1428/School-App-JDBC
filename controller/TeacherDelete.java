package com.school.controller;

import com.school.dao.TeacherDao;
import com.school.service.TeacherService;

public class TeacherDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    TeacherService teacherService=new TeacherService();
    boolean res=teacherService.deleteTeacherById(1);
    System.out.println(res);
	}

}
