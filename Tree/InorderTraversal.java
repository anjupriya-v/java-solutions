import java.io.*;
import java.util.*;
class Node{
Object data;
Node left,right;
Node(Object data){
    this.data=data;
    this.left=null;
    this.right=null;
}
}
class InorderTraversal{
    Node root;
    InorderTraversal(){
        root=null;
    }
     void inorderTraversal(){
         Stack<Node> stack =new Stack<>();
        Node temp=root;
        while(temp!=null || !stack.isEmpty()){
            if(temp!=null){
                stack.push(temp);
                temp=temp.left;
            }
            else{
                temp=stack.pop();
                System.out.println(temp.data);
                temp=temp.right;
            }
        }

    }
    public static void main(String args[]){
        InorderTraversal s=new InorderTraversal();
        s.root=new Node(4);
        s.root.left=new Node(3);
        s.root.right=new Node(2);
        s.root.left.left=new Node(1);
        s.root.left.right=new Node(3);
        s.root.right.right=new Node(4);
        s.inorderTraversal();

    }
}