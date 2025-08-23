 class Node{
    Object data;
    Node next;
    Node(Object data){
        this.data=data;
        this.next=null;
    }
}

public class ReverseLinkedList {
    public Node head=null;
    public Node tail=null;
    public void reverse(){
        Node prev=null;
        Node current=head;
        Node n=null;
        Node palindrome=head;
        while(current!=null){
            n=current.next;
            current.next=prev;
            prev=current;
            current=n;
        }
        head=prev;
        if(palindrome==head){
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
        ReverseLinkedList in=new ReverseLinkedList();
      in.add(1); 
      in.add(1);  
      in.add(2);  
      in.add(2);
      in.add(1);
      in.add(1); 
      in.reverse();
      in.display();
    }
}
