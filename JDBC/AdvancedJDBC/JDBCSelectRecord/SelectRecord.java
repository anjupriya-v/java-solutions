import java.io.*;
import java.util.*;
import java.sql.*;
import java.sql.ResultSet;
class SelectRecord{
	public static void main(String args[]){
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		String rollno,name,marks,grade;
		int totMarks=0,noOfStudents=0;
		float avg;
		try{
			String userName="root";
		String password="Aa_483518";
		String url="jdbc:mysql://localhost:3306/test1";
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		con=DriverManager.getConnection(url,userName,password);
		stmt=con.createStatement();
		stmt.execute("select * from javacourse");
		rs=stmt.getResultSet();
		System.out.println("**********Result**********");
		while(rs.next()){
			rollno=rs.getString("Roll");
			name=rs.getString("name");
			marks=rs.getString("marks");
			grade=rs.getString("grade");
			totMarks+=Integer.parseInt(marks);
			System.out.println("Roll No : "+rollno+"\nName : "+name+"\nMark : "+marks+"\ngrade : "+grade);
			noOfStudents++;
		}
		avg=totMarks/noOfStudents;
		System.out.println("The Average Marks taken by the Class is "+ avg);
		
		
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
		
		
		
		
		