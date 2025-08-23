import java.io.*;
import java.util.*;
import java.sql.*;
import java.sql.ResultSet;
class CreateTable{
	public static void main(String args[]){
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		String tableName;
		try{
			String userName="root";
		String password="";
		String url="jdbc:mysql://localhost:3306/test1";
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		con=DriverManager.getConnection(url,userName,password);
		stmt=con.createStatement();
		stmt.execute("show tables");
		rs=stmt.getResultSet();
		
		System.out.println("\nThe Result before creating the table");
		while(rs.next()){
			tableName=rs.getString("Tables_in_test1");
			System.out.println("TableName "+tableName);
		}
		stmt.execute("Create table java(roll Integer primary key,name varChar(30),marks Integer not null,grade varChar(2))");
		stmt.execute("Show tables");
		rs=stmt.getResultSet();
		System.out.println("The Result after creating the table");

		while(rs.next()){
		tableName=rs.getString("Tables_in_test1");
			System.out.println("TableName "+tableName);
		}
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
			if(rs!=null){
				try{
					rs.close();
				}
				catch(Exception e){
				}
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
		
		
		
		
		