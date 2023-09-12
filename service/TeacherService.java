package com.school.service;


import com.school.dao.TeacherDao;
import com.school.dto.Teacher;

public class TeacherService {
	
	  TeacherDao teacherDao=new TeacherDao();
		
	  public Teacher saveTeacher(Teacher teacher) {
			 return teacherDao.saveTeacher(teacher);
		 }
	  public boolean deleteTeacherById(int id) {
      return teacherDao.deleteTeacherById(1);
	  }
	  
      public boolean updateTeacherByID(String name,String email,int id) {
    	  return teacherDao.updateTeacherByID(name,email, id);
      }
      
      public Teacher getTeacherById(Teacher teacher) {
    	 return teacherDao.getTeacherById(teacher);
      }
      public Teacher getAllTeacherById(Teacher teacher) {
    	 return teacherDao.getAllTeacherById(teacher);
      }
	  }
