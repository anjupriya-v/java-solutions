import java.io.*;
import java.util.*;
class Stack{
	int stack[];
	int top,n;
	Stack(int size){
		stack=new int[size];
		top=-1;
		n=size;
	}
	 void push(int element){
		if(top==n-1){
			System.out.println("Stack is in Overflow Condition");
		}
		else{
			top+=1;
			stack[top]=element;
			System.out.println("The element "+element+" is pushed into the stack");
		}
	}
	 void pop(){
		if(top==-1){
			System.out.println("Stack is in Underflow condition");
		}
		else{
			System.out.println("The element which is popped from the stack is "+stack[top]);
			top-=1;
		}
	}
	 void display(){
	 	System.out.println("The Elements in the stack are:");
	 	for(int i=0;i<=top;i++){
	 		System.out.println(stack[i]);
	 	}
	 }
	public static void main(String[] args){
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Stack");
		size=sc.nextInt();
		Stack s=new Stack(size);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.pop();
		s.display();

	}
}