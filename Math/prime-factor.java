import java.util.Scanner;

class PrimeFactor {
    static int isPrime(int n){
        int flag=0;
        if(n==2){
            flag=1;
            return flag;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=0;
                break;
            }
            else{
                flag=1;
            }
        }
return flag;

    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("The Prime Factors are :");
        for(int i=2;i<n;i++){
            if(n%i==0){
                if(isPrime(i)==1){
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}
