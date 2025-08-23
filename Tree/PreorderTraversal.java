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
class PreorderTraversal{
    Node root;
    PreorderTraversal(){
        root=null;
    }
     void preorderTraversal(){
         Stack<Node> stack =new Stack<>();
        stack.push(root);
        Node temp=null;
        while(!stack.isEmpty()){
            temp=stack.pop();
            System.out.println(temp.data);
            if(temp.right!=null){
                stack.push(temp.right);
            }
            if(temp.left!=null){
                stack.push(temp.left);
            }
        }

    }
    public static void main(String args[]){
        PreorderTraversal s=new PreorderTraversal();
        s.root=new Node(4);
        s.root.left=new Node(3);
        s.root.right=new Node(2);
        s.root.left.left=new Node(1);
        s.root.left.right=new Node(3);
        s.root.right.right=new Node(4);
        s.preorderTraversal();

    }
}