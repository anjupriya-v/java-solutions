import java.io.*;
import java.util.*;
import java.sql.*;
class UpdateRecord{
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
			stmt.execute("update javacourse set marks=65 where marks=60");
			System.out.println("The table get updated");
		}
		catch(SQLException e){
			System.out.println("The SQLException is "+e.getMessage());
			System.out.println("The SQL state is "+e.getSQLState());
			System.out.println("The Vendor error is " +e.getErrorCode());
		}
		catch(Exception e){
			System.out.println("Cannot connect to the data base server");
		}
		finally{
			if(con!=null){
				try{
					con.close();
				}
				catch(Exception e){  }
			}
			if(stmt!=null){
				try{
					stmt.close();
				}
				catch(Exception e){  }
			}
		}
	}
}
		