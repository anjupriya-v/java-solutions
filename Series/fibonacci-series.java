import java.util.*;
class FibonacciSeries{
    static int fib(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        return fib(n-2)+fib(n-1);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int [] arr=new int[n];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<n;i++){
            arr[i]=fib(i);
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }  
        sc.close();  
    }
}
