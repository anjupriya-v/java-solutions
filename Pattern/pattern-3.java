import java.util.*;
class Pattern3 {
//when n=3
//      a     
//     b  b   
//   c  c  c 
//     b  b   
//      a
  public static void main(String[] args) {
      int n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      char ch='a';
      int space=0,temp=0;
      for(int i=1;i<=n;i++){
          space=n-i;
          while(space>0){
              System.out.print(" ");
              space--;
          }
          temp=i;
          while(temp>0){
              System.out.print(ch+" ");
              temp--;
          }
          if(ch-97+1==n){
              ch--;
              break;
          }
          ch++;
          System.out.println();
      }
      System.out.println();
      for(int i=1;i<n;i++){
          space=i;
          while(space>0){
              System.out.print(" ");
              space--;
          }
          temp=n-i;
          while(temp>0){
              System.out.print(ch+" ");
              temp--;
          }
          ch--;
          System.out.println();
      }
      sc.close();

  }
}
