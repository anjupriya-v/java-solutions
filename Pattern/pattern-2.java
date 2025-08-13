import java.util.*;
class Pattern2 {
    //when n=3
    //1 1 1 2
    //3 2 2 2
    //3 3 3 4
    public static void main(String[] args) {
    int n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(int i=1;i<=n;i++){
        if(i%2!=0){
            int j=0;
            while(j<n){
                System.out.print(i+" ");
                j++;
            }
            System.out.print(i+1+" ");
        }
        else{
            int j=0;
            System.out.print(i+1+" "); 

            while(j<n){
                System.out.print(i+" ");
                j++;
            }
        }
        System.out.println();
    }
    sc.close();
    }
  

}
