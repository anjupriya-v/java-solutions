import java.io.*;
import java.util.*;
class CloneObject implements Cloneable{
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	void statement(){
		System.out.println("This is an Object cloning Example");
	}
	public static void main(String args[]){
	CloneObject obj1=new CloneObject();
	obj1.statement();

	try{
	CloneObject obj2=(CloneObject)obj1.clone();
	obj2.statement();
	}
	catch(Exception e){
	System.out.println("The Exception is "+e.getMessage());
	}
	}
	}
		