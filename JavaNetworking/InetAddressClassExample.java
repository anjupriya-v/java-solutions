import java.io.*;
import java.util.*;
import java.net.*;
class InetAddressClassExample{
	public static void main(String args[]){
		try{
			InetAddress ip=InetAddress.getByName("www.google.com");
			System.out.println("The Host Name is "+ip.getHostName());
			System.out.println("The Host Address is "+ip.getHostAddress());
		}
		catch(Exception e){
			System.out.println("The Exception is " +e.getMessage());
		}
	}
}