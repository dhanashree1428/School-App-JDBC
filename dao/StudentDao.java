package com.school.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.school.configuration.HelperClass;
import com.school.dto.Student;

public class StudentDao {
  
   HelperClass helperClass =new HelperClass();
   Connection connection=null;
   
   //to delete the student data
   public boolean deleteStudentById(int id) {
	   connection=helperClass.getConnection();
	   int i=0;
	   String sql="DELETE FROM student WHERE ID=?";
	   //establish my statement
	   
	   
	try {
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		preparedStatement.setInt(1,id);
		   
		  i= preparedStatement.executeUpdate();
		 
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	if(i>0) {
		return true;
	}else {
		return false;
	}
	}
   
   //to update the student data
   public boolean updateStudentByID(String name,String emaill,int id) {
	   connection=helperClass.getConnection();
	   
	 
	   //establish my statement
	   
	   
	try {
		PreparedStatement preparedStatement = connection.prepareStatement("UPDATE student SET name=?,emaill=? WHERE ID=?");
		
		preparedStatement.setString(1, name);
		preparedStatement.setString(2,emaill);
		preparedStatement.setInt(3,id);
		   
		preparedStatement.executeUpdate();
		 
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		return true;
		}
		
		
   
   
   //to save the student data
   
  public Student saveStudent(Student student) {
	  connection=helperClass.getConnection();
	  String sql="INSERT INTO student VALUES(?,?,?)";
	try {
		//create statement
		 PreparedStatement	preparedStatement = connection.prepareStatement(sql);
		 //pass the values to placeholders/delimiters ----->?
		  preparedStatement.setInt(1,student.getId());
		  preparedStatement.setString(2,student.getName());
		  preparedStatement.setString(3,student.getEmail());
		  preparedStatement.execute();
	  
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	return student;
	  }
  
  
//to get the student data
  
  public Student getStudentById(Student student) {
	   connection=helperClass.getConnection();
	   
	   String sql="SELECT * FROM student WHERE ID=?";
	   //establish my statement
	   
	   
	try {
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		
		preparedStatement.setInt(1,student.getId());
		   
		ResultSet resultSet=preparedStatement.executeQuery();
		
		while(resultSet.next()){
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
			
			System.out.println("=================");
		}
		 
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		return student;
		}
  
  
//to getall the student data
  
  public Student getAllStudent(Student student) {
	   connection=helperClass.getConnection();
	   
	   String sql="SELECT * FROM student";
	   //establish my statement
	   
	   
	try {
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		
		
		   
		ResultSet resultSet=preparedStatement.executeQuery();
		
		while(resultSet.next()){
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
			
			System.out.println("=================");
		}
		 
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		return student;
		}
}
