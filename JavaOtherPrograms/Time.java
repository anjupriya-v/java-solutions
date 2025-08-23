package time_converter;
import java.io.*;
import java.util.*;
public class Time{
	public void hr_min(){
		int hr;
		Scanner sc=new Scanner(System.in);
		hr=sc.nextInt();
		float min=(hr*60);
		System.out.println("The Equivalent minutes "+min);
	}
	public void hr_sec(){
		int hr;
		Scanner sc=new Scanner(System.in);
		hr=sc.nextInt();
		float sec=(hr*3600);
		System.out.println("The Equivalent Seconds "+sec);
	}
	public void min_hr(){
		int min=1;
		Scanner sc=new Scanner(System.in);
		min=sc.nextInt();
		int hr=(min/60);
		System.out.println("The Equivalent Hour "+hr);
	}
	public void sec_hr(){
		int sec=1;
		Scanner sc=new Scanner(System.in);
		sec=sc.nextInt();
		int hr=(sec/83600);
		System.out.println("The Equivalent Hour "+hr);
	}
}