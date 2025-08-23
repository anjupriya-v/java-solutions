import java.io.*;
import java.lang.reflect.*;
import java.util.*;
class ConstructorNewInstance{
	void demo(){
		System.out.println("This is the way to create the object using the new Instance of Constructor");
	}
	public static void main(String args[]){
		try{
			Constructor <ConstructorNewInstance> cons=ConstructorNewInstance.class.getDeclaredConstructor();
			ConstructorNewInstance obj=cons.newInstance();
			obj.demo();
	}
	catch(Exception e){
		System.out.println("The Exception is "+e.getMessage());
	}
	}
}