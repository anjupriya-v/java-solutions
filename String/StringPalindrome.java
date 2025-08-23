import java.io.*;
import java.util.*;
class StringPalindrome{
	public static void main(String args[]){
		String str1;
		String str2="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		str1=sc.nextLine();
		int len=(str1.length()-1);
		for(int i=len;i>=0;i--){
			if(str1.charAt(i)!=-1){
				str2+=str1.charAt(i);
			}
		}
		if(str1.equals(str2)){
			System.out.println("The Given String is a palindrome");
		}
		else{
			System.out.println("The Given String is not a palindrome");
		}
	}
}
			
		