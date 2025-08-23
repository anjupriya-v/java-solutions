import java.io.*;
import java.util.*;
import java.sql.*;
class Connect{
	public static void main(String args[]){
		Connection con=null;
		try{
			String user="root";
			String password="";
			String url="jdbc:mysql://localhost:3306/test1";
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con=DriverManager.getConnection(url,user,password);
			System.out.println("The Connection get successfull");
		}
		catch(Exception e){
			System.out.println("The Connection was not successfull");
		}
		finally{
			if(con!=null){
				try{
					System.out.println("the connection was terminated");
					
				}
				catch(Exception e){
				}
				}
			}
		}
	
}