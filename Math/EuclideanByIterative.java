import java.util.Scanner;

public class EuclideanByIterative {
    public static void main(String args[]){
        int a,b,rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'a' value");
        a = sc.nextInt();
        System.out.println("Enter 'b' value");
        b = sc.nextInt();
        if(a>b){
            rem = a%b;
        }
        else{
            rem = b%a;
        }
        while(rem > 0){
            a=b;
            b=rem;
            rem = a%b;
        }
        System.out.println("The GCD is "+b);
    }
}
