import java.io.*;
import java.util.*;
import java.sql.*;
class DropTable{
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
			stmt.execute("Drop table Javacourse");
			System.out.println("Table is deleted successfully");
		}
		catch(SQLException e){
			System.out.println("The SQLException is "+e.getMessage());
			System.out.println("The SQLState is "+e.getSQLState());
			System.out.println("The Vendor Error is "+e.getErrorCode());
		}
		catch(Exception e){
			System.out.println("Cannot connect to the Database server");
		}
		finally{
			if(con!=null){
				try{
					con.close();
				} catch(Exception e){
					
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