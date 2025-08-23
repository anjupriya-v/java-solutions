import java.util.*;
/**
 * FibonacciSeries
 */
public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        int a=0,b=1,c=1;
        int i=0;
        while(i<=n){
            System.out.println(a+" ,");
            a=b;
            b=c;
            c=a+b;
            i++;
        }
        
    }
}