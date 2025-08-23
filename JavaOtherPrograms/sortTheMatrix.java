import java.util.*;
public class sortTheMatrix {
    static void sortingInMatrix(int[]newArray,int n){
        int[][]sortedArray=new int[n][n];
        int left=0,right=n-1,top=0,bottom=n-1,dir=1,index=0;
        while(left<=right && top<=bottom){
            if(dir==1){//left->right
                for(int i=0;i<=right;i++){
                    sortedArray[top][i]=newArray[index];
                    index++;
                }
                top++;
                dir=2;
            }
            else if(dir==2){//top->bottom
                for(int i=top;i<=bottom;i++){
                   sortedArray[i][right]= newArray[index];
                    index++;
                }
                right--;
                dir=3;
            }
            else if(dir==3){//right->left
                for(int i=right;i>=left;i--){
                   sortedArray[bottom][i]=newArray[index];
                    index++;
                }
                bottom--;
                dir=4;
            }
            else{//bottom->top
                for(int i=bottom;i>=top;i--){
                    sortedArray[i][left]=newArray[index];
                    index++;
                }
                left++;
                dir=1;
            }
            
            
        }
        System.out.println("The Sorted Array is");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(sortedArray[i][j]+"\t");
            }
            System.out.println("\n");

        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        int[][]arr=new int[n][n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();

            }
        }
        int[]newArray=new int[(n*n)];
        int left=0,right=n-1,top=0,bottom=n-1,dir=1,index=0;
        while(left<=right && top<=bottom){
            if(dir==1){//left->right
                for(int i=left;i<=right;i++){
                    newArray[index]=arr[top][i];
                    index++;
                }
                top++;
                dir=2;
            }
            else if(dir==2){//top->bottom
                for(int i=top;i<=bottom;i++){
                    newArray[index]=arr[i][right];
                    index++;
                }
                right--;
                dir=3;
            }
            else if(dir==3){//right->left
                for(int i=right;i>=left;i--){
                    newArray[index]=arr[bottom][i];
                    index++;
                }
                bottom--;
                dir=4;
            }
            else{//bottom->top
                for(int i=bottom;i>=top;i--){
                    newArray[index]=arr[i][left];
                    index++;
                }
                left++;
                dir=1;
            }
            
        }
        //   System.out.println("The Array in sorted order :");
        // for(int i=0;i<newArray.length;i++){
        //     System.out.println(newArray[i]);
        // }
        int temp=0;
        for(int i=0;i<newArray.length;i++){
          for(int j=i+1;j<newArray.length;j++){
              if(newArray[i]>newArray[j]){
                  temp=newArray[i];
                  newArray[i]=newArray[j];
                  newArray[j]=temp;
              }
          } 

        }
        sortingInMatrix(newArray,n);
      

    }
}
