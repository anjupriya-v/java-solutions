import java.util.*;
class SumOfPrimes {
    static int func(int rem){
        int value=rem;
        if(rem==2){
            return 2;
        }
        for(int i=2;i<rem;i++){
            if(rem%i==0){
                value=0;
            }
        }
        return value;
    }
    public static void main(String[] args) {
        int n,rem=0,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0){
            rem=n%10;
            sum+=func(rem);
            n/=10;
        }
        System.out.println(sum);
        sc.close();
    }
}
