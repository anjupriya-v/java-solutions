import java.io.*;
import java.util.*;
import java.net.*;
class URLConnectionClassExample{
	public static void main(String args[]){
		try{
		int i;
		URL u=new URL("https://www.google.com");
		URLConnection uc=u.openConnection();
		InputStream in=uc.getInputStream();
		while((i=in.read())!=-1){
			System.out.println((char)i);
		}
		}
		catch(Exception e){
			System.out.println("The Exception is "+e.getMessage());
		}
	}
}

		