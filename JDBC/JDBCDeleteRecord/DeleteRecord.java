import java.io.*;
import java.util.*;
import java.sql.*;
class DeleteRecord{
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
			stmt.execute("Delete from javacourse where marks<70");
			//stmt.execute("Delete from javacourse");
			System.out.println("The Particular record has been deleted");
		}
		catch(SQLException e){
			System.out.println("The SQLException is "+e.getMessage());
			System.out.println("The SQLState is "+e.getSQLState());
			System.out.println("The Vendor error is "+e.getErrorCode());
		}
		catch(Exception e){
			System.out.println("Cannot connect to the database server");
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