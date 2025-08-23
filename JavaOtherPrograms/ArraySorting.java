import java.util.*;
public class ArraySorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the Array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
         
            }
        }
        System.out.print("The Ascending Array Elements are ");
       for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
       }
    }
}
