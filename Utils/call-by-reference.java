import java.util.*;
class CallByReference {
    int a,b;
    CallByReference(int a,int b){
        this.a=a;
        this.b=b;
    }
    void swap(CallByReference cr){
        int temp;
        System.out.println("Inside Function,Before Swapping A= "+a+" B= "+b);
        temp=cr.a;
        cr.a=cr.b;
        cr.b=temp;
        System.out.println("Inside Function,After Swapping A= "+a+" B= "+b);

    }
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        CallByReference cr=new CallByReference(a,b);
        System.out.println("Before Swapping A= "+cr.a+" B ="+cr.b);
        cr.swap(cr);
        System.out.println("After Swapping A= "+cr.a+" B ="+cr.b);

        sc.close();
    }
}
