import java.util.*;
class PascalTriangle {
    static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int n,res=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int space=n-2;
        for(int i=0;i<n;i++){
            for(int l=space;l>=0;l--){
                    System.out.print(" ");
                
            }
            space--;
    
                for(int k=0;k<=i;k++){
                    res=fact(i)/(fact(i-k)*fact(k));
                    System.out.print(res+" ");
                }
                System.out.println();
            
        }
        sc.close();
    }
}
