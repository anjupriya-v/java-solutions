import java.io.*;
import java.util.*;
import java.sql.*;
class CreateTable{
	public static void main(String args[]){
		Connection con=null;
		Statement stmt=null;
		try{
			String userName="root";
		String password="Aa_483518";
		String url="jdbc:mysql://localhost:3306/test1";
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		con=DriverManager.getConnection(url,userName,password);
		stmt=con.createStatement();
		stmt.execute("create table javaCourse(Roll Integer primary key,Name VarChar(30),Marks Integer not null,Grade VarChar(2))");
		System.out.println("Table Created Successfully");
		
		}
		catch(SQLException ex){
			System.out.println("SQLException: "+ex.getMessage());
			System.out.println("SQLState: "+ex.getSQLState());
			System.out.println("VendorError: "+ex.getErrorCode());
		}
		catch(Exception e){
			System.out.println("Cannot connect to database server");
		}
		finally{
			if(stmt!=null){
				try{
					stmt.close();
				}
				catch(Exception e){
				}
					stmt=null;
			}
			if(con!=null){
				try{
					con.close();
				}
				catch(Exception e){
				}
			}
		}
	}
}
		
		
		
		
		