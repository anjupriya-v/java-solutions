import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        long n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        n=sc.nextLong();
        System.out.println("The Factorial of the given number is " +factorial(n));
    }
    public static long factorial(long n){
        if(n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    
}
