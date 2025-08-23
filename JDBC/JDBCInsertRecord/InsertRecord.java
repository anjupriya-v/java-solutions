import java.io.*;
import java.util.*;
import java.sql.*;
class InsertRecord{
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
			stmt.execute("insert into javacourse values(1,'AAA',90,'A')");
			stmt.execute("insert into javacourse values(2,'BBB',80,'B')");
			stmt.execute("insert into javacourse values(3,'CCC',70,'C')");
			stmt.execute("insert into javacourse values(4,'DDD',60,'D')");
			stmt.execute("insert into javacourse values(5,'EEE',50,'E')");
			System.out.println("Data was inserted sucessfully");
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

			