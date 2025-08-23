import java.util.*;
public class ReverseLinkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Linked list");
        int n=sc.nextInt();
        LinkedList <Integer> li1=new LinkedList<Integer>();
        LinkedList <Integer> li2=new LinkedList<Integer>();
System.out.println("Enter the linked list elements");
        for(int i=0;i<n;i++){
li1.add(sc.nextInt());
        }
        li1.descendingIterator().forEachRemaining(li2::add);
        System.out.println(li2);
    }
    
}
