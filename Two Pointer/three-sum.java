import java.util.Scanner;

class ThreeSum {
    public boolean hasTripletSum(int arr[], int target) {
        int k = 0, j = 0, temp = 0;
        for(int i = 0 ;i< arr.length ; i++){
            j= i+1;
            while(j < arr.length){
                k = j+temp+1;
                if(k >= arr.length){
                      j++;
                      k=0;
                      temp=0;
                      continue;
                 }
                if((arr[i]+arr[j]+arr[k]) == target){
                    return true;
                }
                temp++;
            }
        }
        return false;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target sum");
        int target = sc.nextInt();
        ThreeSum ts = new ThreeSum();
        boolean result= ts.hasTripletSum(arr,target);
        if(result){
            System.out.println("Triplet Sum is present");
        }
        else{
            System.out.println("Triplet Sum is not present");
        }
        sc.close();
    }
}