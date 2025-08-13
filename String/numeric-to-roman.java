import java.util.*;
class NumericToRoman {
 public static void main(String[] args) {
     String[] romanValues={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
     int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
     Scanner sc=new Scanner(System.in);
     int n;
     StringBuilder sb=new StringBuilder();
     n=sc.nextInt();
     for(int i=0;i<romanValues.length;i++){
         while(n>=values[i]){
             n-=values[i];
             sb.append(romanValues[i]);
         }
     }
     System.out.println("The Equivalent NUmeral Value is "+sb.toString());
    sc.close();
 }   
}
