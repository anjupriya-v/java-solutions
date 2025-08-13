import java.util.*;
class PerfectNumber {
    //perfect number, a positive integer that is equal to the sum of its proper divisors. 
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println("Therefore,"+n+" is a Perfect Number");
        }
        else{
            System.out.println("Therefore,"+n+" is not a Perfect Number");

        }
sc.close();
    }
}
