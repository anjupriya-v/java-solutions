import java.io.*;
import java.util.*;
class ClassNewInstance{
	void demo(){
		System.out.println("This is the ways to create object using New Instance of class");
	}
	public static void main(String args[]){
	try{
	Class obj=Class.forName("ClassNewInstance");
	ClassNewInstance newObj=(ClassNewInstance)obj.newInstance();
	newObj.demo();
	}
	catch(Exception e){
		System.out.println("The Exception is "+e.getMessage());
	}
	}
}