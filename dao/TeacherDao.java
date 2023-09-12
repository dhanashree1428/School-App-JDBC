package com.school.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.school.configuration.HelperClass;
import com.school.dto.Student;
import com.school.dto.Teacher;

public class TeacherDao {
  
   HelperClass helperClass =new HelperClass();
   Connection connection=null;
   
   //to save the teacher data
   
  public Teacher saveTeacher(Teacher teacher) {
	  connection=helperClass.getConnection();
	  String sql="INSERT INTO Teacher VALUES(?,?,?)";
	try {
		//create statement
		 PreparedStatement	preparedStatement = connection.prepareStatement(sql);
		 //pass the values to placeholders/delimiters ----->?
		 preparedStatement.setInt(1,teacher.getId());
		  preparedStatement.setString(2,teacher.getName());
		  preparedStatement.setString(3,teacher.getEmail());
		  
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
	return teacher;
	  }
  
  //to delete the teacher data
  public boolean deleteTeacherById(int id) {
	   connection=helperClass.getConnection();
	   int i=0;
	   String sql="DELETE FROM teacher WHERE ID=?";
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
  
  //to update the teacher data
  public boolean updateTeacherByID(String name,String email,int id) {
	   connection=helperClass.getConnection();
	   
	 
	   //establish my statement
	   
	   
	try {
		PreparedStatement preparedStatement = connection.prepareStatement("UPDATE teacher SET name=?,email=? WHERE ID=?");
		
		preparedStatement.setString(1, name);
		preparedStatement.setString(2,email);
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

//to get the teacher data
  
  public Teacher getTeacherById(Teacher teacher) {
	   connection=helperClass.getConnection();
	   
	   String sql="SELECT * FROM teacher WHERE ID=?";
	   //establish my statement
	   
	   
	try {
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		
		preparedStatement.setInt(1,teacher.getId());
		   
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
		return teacher;
		}
  
  
//to getall the teacher data
  
  public Teacher getAllTeacherById(Teacher teacher) {
	   connection=helperClass.getConnection();
	   
	   String sql="SELECT * FROM teacher";
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
		return teacher;
		}
}

