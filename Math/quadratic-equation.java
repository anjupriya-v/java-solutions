import java.util.*;
class QuadraticEquation {
    public static void main(String[] args) {
        float a,b,c;
        double d=0,root1=0,root2=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=(b*b)-(4*a*c);
        System.out.println(d);
        if(d<0){
            System.out.println("The Roots are complex");
            System.out.format("The first root is %.3f + %.3fi",-b/(2*a),Math.sqrt(-d)/2*a);
            System.out.format("The second root is %.3f + %.3fi",-b/(2*a),- Math.sqrt(-d)/2*a);

        }
        else if(d==0){
            System.out.println("Both the Roots are equal");
            root1=(-b/2*a);
            System.out.format("The Root is %.3f",root1);
        }
        else{
            System.out.println("The Roots are real");
            System.out.println(Math.sqrt(d));
            root1=(-b+Math.sqrt(d))/2*a;
            root2=(-b-Math.sqrt(d))/2*a;
            System.out.format("The Roots are %.3f, %.3f",root1,root2);
        }
        sc.close();
    }
}
