import java.util.*;
class BubbleSort{
    int[] bubbleSort(int[]arr){
        int temp=0;
        boolean sorted=true;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                sorted=false;
            }
            if(sorted==true){
                break;
            }
        }
        return arr;

    }
    public static void main(String[] args) {
        int n;
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        BubbleSort bs=new BubbleSort();
        int[] result=bs.bubbleSort(arr);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}