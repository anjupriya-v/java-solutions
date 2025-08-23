import java.util.*;
class SecondLargeArray{
	public static void main(String args[]){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of N");
		n=sc.nextInt();
		int[]arr=new int[n];
		System.out.println("Enter the Elements in the array");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int temp;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("The Second Largest Element in an Array "+arr[n-2]);
		System.out.println("The Third Largest Element in an Array "+arr[n-3]);
		sc.close();
	}
}

			