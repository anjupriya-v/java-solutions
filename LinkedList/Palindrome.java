import java.util.Stack;

class Node{
    Object data;
    Node next;
    Node(Object data){
        this.data=data;
        this.next=null;
    }
}

public class Palindrome {
    public Node head=null;
    public Node tail=null;
    public void palindrome(){
        int flag=0;
    Stack <Integer> stack =new Stack<Integer>();
    Node pointer=head;
    Node temp=head;
    while(pointer!=null){
        stack.push((Integer) pointer.data);
        pointer=pointer.next;
    }
    while(temp!=null){
        int pop=stack.pop();
        if(temp.data==(Integer) pop){
        flag=1;
        }
        else{
            flag=0;
            break;
        }
        temp=temp.next;
    }
    if(flag==1){
        System.out.println("Palindrome");
    }
    else{
        System.out.println("Not Palindrome");
    }
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void add(Object data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
    }
    public static void main(String[] args) {
        Palindrome in=new Palindrome();
      in.add(1); 
      in.add(1);  
      in.add(2);  
      in.add(2);
      in.add(1);
      in.add(1); 
      in.palindrome();
      in.display();
    }
}
