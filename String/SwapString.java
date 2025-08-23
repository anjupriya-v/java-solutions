import java.io.*;
import java.util.*;
class SwapString{
	public static void main(String args[]){
		String str1,str2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String 1");
		str1=sc.nextLine();
		System.out.println("Enter the String 2");
		str2=sc.nextLine();
		System.out.println("Before Swapping "+str1+ " " +str2);
		str1=str1+str2;
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		System.out.println("After Swapping "+str1+ " " +str2);
	}
}
		
		