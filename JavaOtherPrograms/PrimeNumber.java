import java.util.*;
public class PrimeNumber {

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    int i;
    if(n==0||n==1){
        System.out.println("The Given Number is not a Prime");

    }
    else{
        for( i=2;i<n;i++){
            if(n%i==0){
                System.out.println("The Given Number is not a Prime");
                break;
            }

        }
        if(i==n)
        {
            System.out.println("The Given Number is a Prime");
        }
    }
}
}