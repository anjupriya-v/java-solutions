import java.util.*;
public class FibonacciNumber {
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Number");
     int n=sc.nextInt();
     if(n>=0){
         System.out.println(fib(n));
     }   
     else{
         System.out.println("Fibonacci series will not generate");
     }

    }
    public static long fib(int n){
        if(n<=1){
            return n;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
}