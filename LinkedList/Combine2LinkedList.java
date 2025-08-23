import java.util.*;

 class Node {
Object value;
Node next;
Node prev;
Node(Object value,Node next,Node prev){
    this.value=value;
    this.next=next;
    this.prev=prev;
}
}
public class Combine2LinkedList<T> {
     Node head=null;
     void add(Object value){
        Node obj=new Node(value,null,null);
        if(head==null){
            head=obj;
        }
        else{
            obj.next=head;
            head.prev=obj;
            head=obj;
        }
    }
     void display(){
        Node n=head;
        while(n!=null){
            System.out.println(n.value);
            n=n.next;
        }
    }
    public static void main(String[] args) {
    Combine2LinkedList<Integer> list1=new Combine2LinkedList<>();

      list1.add(5);
      list1.add(4);
      list1.add(3);
      list1.add(2);
      list1.add(1);

// list1.display();
Combine2LinkedList<Integer> list2=new Combine2LinkedList<>();

list2.add(5);
list2.add(4);
list2.add(3);
list2.add(2);
list2.add(1);
// list2.display();
combine2LinkedList list3=new combine2LinkedList<>();

list3.display();
        
    }
}
