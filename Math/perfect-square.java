import java.util.*;
class PerfectSquare {
    public static void main(String[] args) {
        double n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int res=0;
        int temp=(int)n;
        res=(int)Math.sqrt(n);
        if((res*res)==temp){
            System.out.println("Perfect Square");
        }
        else{
            System.out.println("Not a Perfect Square");
        }
        sc.close();
    }
}
