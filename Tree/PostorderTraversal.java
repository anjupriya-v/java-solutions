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
class PostorderTraversal{
    Node root;
    PostorderTraversal(){
        root=null;
    }
     void postorderTraversal(){
         Stack<Node> stack =new Stack<>();
        Node temp=root;
        while(!stack.isEmpty()){
            stack.push(temp);
            if(temp.right!=null){
                stack.push(temp.right);
            }
            else{
                temp=stack.pop();
                System.out.println(temp.data);
            }
            if(temp.left!=null){
                stack.push(temp.left);
            }
            else{
                temp=stack.pop();
                System.out.println(temp.data);

            }
        }

    }
    public static void main(String args[]){
        PostorderTraversal s=new PostorderTraversal();
        s.root=new Node(4);
        s.root.left=new Node(3);
        s.root.right=new Node(2);
        s.root.left.left=new Node(1);
        s.root.left.right=new Node(3);
        s.root.right.right=new Node(4);
        s.postorderTraversal();

    }
}