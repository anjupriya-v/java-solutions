import java.io.*;
import java.util.*;
import java.sql.*;
import java.sql.ResultSet;
class InsertRecord{
	public static void main(String args[]){
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		String roll,name,mark,grade;
		try{
			String userName="root";
			String password="Aa_483518";
			String url="jdbc:mysql://localhost:3306/test1";
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con=DriverManager.getConnection(url,userName,password);
			stmt=con.createStatement();
			stmt.execute("select * from javacourse");
			rs=stmt.getResultSet();
			System.out.println("Table before Insertion");
			while(rs.next()){
				roll=rs.getString("roll");
				name=rs.getString("name");
				mark=rs.getString("marks");
				grade=rs.getString("grade");
				System.out.println("Roll No : "+roll+"\nName : "+name+"\nMark : "+mark+"\ngrade : "+grade);
			}
			stmt.execute("insert into javacourse values(6,'FFF',40,'F')");
			stmt.execute("insert into javacourse values(7,'GGG',30,'G')");
			stmt.execute("insert into javacourse values(8,'HHH',20,'H')");
			stmt.execute("insert into javacourse values(9,'III',10,'I')");
			stmt.execute("Select * from javacourse");
			rs=stmt.getResultSet();
			System.out.println("Table After Insertion");
			while(rs.next()){
			roll=rs.getString("roll");
				name=rs.getString("name");
				mark=rs.getString("marks");
				grade=rs.getString("grade");
				System.out.println("Roll No : "+roll+"\nName : "+name+"\nMark : "+mark+"\ngrade : "+grade);
			}
		}
		catch(SQLException e){
			System.out.println("The SQLException is "+e.getMessage());
			System.out.println("The SQLState is "+e.getSQLState());
			System.out.println("The VendorError is" +e.getErrorCode());

		}
		catch(Exception e){
			System.out.println("Cannot connect to the database server");
		}
		finally{
			 if(con!=null){
				 try{
					 con.close();
				 }
				 catch(Exception e){
				 }
			 }
			 if(rs!=null){
				 try{
					 rs.close();
				 }
				 catch(Exception e){
				 }
			 }
			 if(stmt!=null){
				 try{
					 stmt.close();
				 }
				 catch(Exception e){
				 }
			 }
		}
	}
}

			