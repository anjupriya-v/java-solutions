//Generate the random number between any specified range
import java.io.*;
import java.util.*;
class RandomNumber{
	public static void main(String args[]){
		int start,end;
		double rand;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting range");
		start=sc.nextInt();
		System.out.println("Enter the end range");
		end=sc.nextInt();
		rand=Math.random()*(end-start+1)+start;
		System.out.println(rand);
	}
}