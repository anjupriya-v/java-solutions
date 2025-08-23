class Node{
    Object data;
    Node next;
    public Node(Object data){
        this.data=data;
        this.next=null;
    }
}
class SlinkedlistOperations{
    public Node head=null;
    public Node tail=null;

//add
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

//display
public void display(){
    Node temp=head;
    while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
    }
}

//delete

public void delete(){
    head=head.next;
}

//Write a function to get Nth node in a Linked List

public void getNthNode(Object data){
Node temp=head;
int count=0,flag=0;
while(temp!=null){
    
if(temp.data==data){
    flag=1;
    break;
}
count++;
temp=temp.next;
}
if(flag==1){
    System.out.println("The Node is present at the index of "+ count);

}
else{
    System.out.println("The Node is not present");

}
}
//Find the middle of a given linked list
public void middleNode(){
    int count=0;
    Node temp=head;
    Node value=head;
    while(temp!=null){
        count++;
        temp=temp.next;
    }
    int half=count/2;
    for(int i=0;i<half;i++){
        value=value.next;
    }
    System.out.println("The Mid of the nodes are "+value.data);
}
//Program for n’th node from the end of a Linked List

public void getNthNodeFromEnd(int index){
Node temp=head;
int len=0;
while(temp!=null){
len=len+1;
temp=temp.next;
}
temp=head;
for(int i=0;i<(len-index);i++){
temp=temp.next;
}
System.out.println(temp.data);

}
    public static void main(String[] args) {
      SlinkedlistOperations in=new SlinkedlistOperations();
      in.add(12); 
      in.add(13);  
      in.add(14);  
      in.add(15);
      in.add(16);
      in.add(17);  


      in.display();
      in.delete();
      System.out.println("After deletion");
      in.display();
      in.getNthNode(15);
      in.middleNode();
      in.getNthNodeFromEnd(3);


    }
}