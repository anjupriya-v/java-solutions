import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
}
class Stack{
	Node top;
	Stack(){
		top=null;
	}
	void push(int data){
		Node n=new Node();
		if(n==null){ //checking the heap memory
			System.out.println("Stack is in overflow");
		}
		else{
			n.data=data;
			n.next=top;
			top=n;
		}
	}
	void pop(){
		if(isEmpty()){
			System.out.println("Stack is in underflow");
		}
		else{
			top=top.next;
		}
	}
	boolean isEmpty(){
		if(top==null){
			return true;
		}
		return false;
	}
	int peek(){
		int topElement=0;
		if(isEmpty()){
			System.out.println("Stack is in underflow");
		}
		else{
			topElement=top.data;
		}
		return topElement;
	}
	void display(){
		System.out.println("The elements in the stack are ");
		Node temp=top;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static void main(String[] args){
		Stack s=new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.pop();
		int topElement=s.peek();
		System.out.println("The Current top element is "+topElement);
		s.display();
	}
}