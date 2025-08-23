import java.util.Scanner;

public class SecondLargestElementArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,temp=0;
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("The Second Largest Element in an Array is "+ arr[n-2]);
    }
}
