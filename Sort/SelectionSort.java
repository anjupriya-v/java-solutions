import java.util.*;
import java.io.*;
public class SelectionSort {
    int[] func(int [] arr){
        int temp=0,miniIndex=0;
        for(int i=0;i<arr.length-1;i++){
            miniIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[miniIndex]>arr[j]){
                  miniIndex=j;  
                }
            }
                temp=arr[i];
                arr[i]=arr[miniIndex];
                arr[miniIndex]=temp;
            
    
        }
        return arr;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        SelectionSort s=new SelectionSort();
        int res[]=s.func(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        sc.close();
    }
}
