import java.util.*;

public class ShuffleAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int n=sc.nextInt(),temp=0;
        int arr[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Random rand=new Random();
        for(int i=0;i<n;i++){
            int randomElement=rand.nextInt(arr.length);
            temp=arr[randomElement];
            arr[randomElement]=arr[i];
            arr[i]=temp;
        }
        System.out.println("The Array Elements are :"+Arrays.toString(arr));
    }
}
