import java.util.*;
class BinarySearch {
    void search(int[]arr,int first,int last,int key) {
        int mid=0;
        while(first<=last){
            mid=(first+last)/2;
            if(arr[mid]<key){
                first=mid+1;
            }
            else if(arr[mid]==key){
                System.out.println("The Element "+key+" is found");
                break;
            }
            else{
                last=mid-1;
            }
        }
        if(first>last){
            System.out.println("The Element "+key+" is not found");
        }
    }
    public static void main(String[] args) {
        int n,key;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Element to search :");
        key=sc.nextInt();
        int first=0,last=arr.length-1;
        BinarySearch bs=new BinarySearch();
        Arrays.sort(arr);
        bs.search(arr,first,last,key);
        sc.close();
    }
}
