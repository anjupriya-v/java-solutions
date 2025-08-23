
import java.util.*;
class ArrayCopy{
	public static void main(String args[]){
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int arr1[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++){
			arr1[i]=sc.nextInt();
		}
		int []arr2=new int[n];
		System.out.println("Copy the values from Arr1 to Arr2");
		for(int j=0;j<n;j++){
			arr2[j] = arr1[j];
		}
		System.out.println("The values of array 2 are ");
		for(int k=0;k<n;k++){
			System.out.print(arr2[k]+"\t");
		}
		sc.close();
	}
}
