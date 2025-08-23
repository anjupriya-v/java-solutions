import java.io.*;
import java.util.*;
import java.net.*;
class HttpURLConnectionClassExample{
	public static void main(String args[]){
		try{
			URL u=new URL("https://www.google.com");
			HttpURLConnection hc=(HttpURLConnection)u.openConnection();
			for(int i=1;i<=8;i++){
				System.out.println(hc.getHeaderFieldKey(i)+"="+hc.getHeaderField(i));
			}
			hc.disconnect();
		}
		catch(Exception e){
			System.out.println("The Exception is "+e.getMessage());
		}
	}
}