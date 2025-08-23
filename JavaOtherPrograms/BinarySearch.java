import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[]{1,2,3,4,5,6,7};
        int result=0,low=0,high=arr.length-1;
        System.out.println("Enter the Element to search");
        int key=sc.nextInt();
        result=binarySearch(arr,low,high,key);
        if(result==-1){
            System.out.println("The Element is not Found");

        }
        else{
            System.out.println("The Element is  found");
        }
    }
    public static int binarySearch(int []arr,int low, int high,int key){
        int mid=(low+high)/2;
        while(low<=high){
            if(arr[mid]<key){
                low=mid+1;
            }
            else if(arr[mid]==key){
                return mid;
            }
            else{
                
                high=mid-1;
            }
            mid=(low+high)/2;
        }
        if(low>high){
            return -1;
        }
        return -1;
    }
}
