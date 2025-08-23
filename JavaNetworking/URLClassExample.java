import java.io.*;
import java.util.*;
import java.net.*;
class URLClassExample{
	public static void main(String args[]){
	try{
		URL u=new URL("https://nptel.ac.in/course.php");
		System.out.println("Protocol :"+u.getProtocol());
		System.out.println("Port :"+u.getPort());
		System.out.println("Host :"+u.getHost());
		System.out.println("FileName :"+u.getFile());
	}
	catch(Exception e){
		System.out.println("The Exception is "+e.getMessage());
	}
	}
}