import java.util.*;
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        System.out.println("Enter the Elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i:arr){
            sum+=i;
        }
        System.out.println("The sum of the array elements are "+sum);

    }
}
