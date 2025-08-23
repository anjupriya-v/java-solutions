import java.util.Scanner;

public class SameElementsInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array 1");
        int n1=sc.nextInt();
        int flag=0;
        System.out.println("Enter the size of the array 2");
        int n2=sc.nextInt();
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        System.out.println("Enter the elements of array 1");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the elements of the array 2");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        if(n1==n2){
            for(int i=0;i<n1;i++){
                for(int j=0;j<n1;j++){
                    if(arr1[i]==arr2[j]){
                        flag=1;
                    }
                    else{
                        flag=0;
                    }

                }

            }
            if(flag==1){
                System.out.println("Both array contains the same elements");
            }
            else{
                System.out.println("Both array does not contains same elements");
            }
        }
        else{
            System.out.println("Both array does not contains same elements");
        }
    }
}
