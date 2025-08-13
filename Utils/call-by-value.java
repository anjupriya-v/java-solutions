import java.util.*;
class CallByValue {
    static void swap(int a,int b){
        System.out.println("Inside Function ,A= "+a+" B= "+b);
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("Inside Function ,A="+a+" B= "+b);

    }
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Before Swapping, A= "+a+" B= "+b);
        swap(a,b);
        System.out.println("After Swapping, A= "+a+" B= "+b);
        sc.close();
    }
}
