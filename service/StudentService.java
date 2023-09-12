package com.school.service;

import com.school.dao.StudentDao;
import com.school.dto.Student;

public class StudentService {
	
  StudentDao studentDao=new StudentDao();
	
	 public Student saveStudent(Student student) {
		 return studentDao.saveStudent(student);
	 }
	 public boolean deleteStudentById(int id) {
		 return studentDao.deleteStudentById(1);
	 }
	
	 public boolean updateStudentByID(String name,String emaill,int id) {
		 return studentDao.updateStudentByID(name, emaill, id);
	 }
	
	
	 public Student getStudentById(Student student) {
		 return studentDao.getStudentById(student);
	 }
	 public Student getAllStudent(Student student) {
	      return studentDao.getAllStudent(student);
	 }
	 }
