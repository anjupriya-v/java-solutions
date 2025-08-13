import java.util.*;
class FloydsTriangle {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int value=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(value+" ");
                value++;
            }
            System.out.println();
        }
        sc.close();
    }
}
