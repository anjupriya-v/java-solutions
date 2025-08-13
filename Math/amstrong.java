import java.util.*;
class Amstrong {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int count=0,temp=n,res=n,sum=0,rem=0;
        while(temp>0){
            temp/=10;
            count++;
        }
        while(n>0){
            rem=n%10;
            sum+=Math.pow(rem,count);
            n/=10;
        }
        if(res==sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not a Armstrong Number");
        }
        sc.close();
    }
}
