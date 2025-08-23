import java.util.Scanner;

public class EuclideanByRecursive {
        public static void main(String args[]){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'a' value");
        a = sc.nextInt();
        System.out.println("Enter 'b' value");
        b = sc.nextInt();
        if(a>b){
            System.out.println("The GCD of two numbers is "+findGCD(a, b));
        }
        else{
            System.out.println("The GCD of two numbers is "+findGCD(b,a));
        }
    }
    static int findGCD(int a,int b){
        if(b == 0){
            return a;
        }
        return findGCD(b, a%b);
    }
}
