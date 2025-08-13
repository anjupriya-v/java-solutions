import java.util.Scanner;

class CoPrimes {
    static int gcd(int a,int b){
        if(a==1|| b==1){
            return 1;
        }
        if(a==b){
            return a;
        }
        if(a>b){
            return gcd(a-b,b);
        }
        return gcd(a,b-a);
    }
    static void coPrimes(int a,int b){
        if(gcd(a,b)==1){
            System.out.println("CoPrime");
        }
        else{
            System.out.println("Not a CoPrime");
        }
    }
    public static void main(String args[]){
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        coPrimes(a,b);
        sc.close();
    }
}
