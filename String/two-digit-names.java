import java.util.*;
class TwoDigitNames {
    public static void main(String[] args) {
        int n,rem=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int t=2;
        int[] arr=new int[t];
        try{
            while(n>0){
                rem=n%10;
                arr[--t]=rem;
                n/=10;
            }
      
       switch(arr[0]){
           case 1:
           switch(arr[1]){
               case 0:
               System.out.println("Ten");
               break;
               case 1:
               System.out.println("Eleven");
               break;
               case 2:
               System.out.println("Twelve");
               break;
               case 3:
               System.out.println("Thirteen");
               break;
               case 4:
               System.out.println("Fourteen");
               break;
               case 5:
               System.out.println("Fifteen");
               break;
               case 6:
               System.out.println("Sixteen");
               break;
               case 7:
               System.out.println("Seventeen");
               break;
               case 8:
               System.out.println("Eighteen");
               break;
               case 9:
               System.out.println("Nineteen");
               break;

           }
           case 2:
           System.out.print("Twenty"+" ");
           break;
           case 3:
           System.out.print("Thirty"+" ");
           break;
           case 4:
           System.out.print("Fourty"+" ");
           break;
           case 5:
           System.out.print("Fifty"+" ");
           break;
           case 6:
           System.out.print("Sixty"+" ");
           break;
           case 7:
           System.out.print("Seventy"+" ");
           break;
           case 8:
           System.out.print("Eighty"+" ");
           break;
           case 9:
           System.out.print("Ninety"+" ");
           break;

   }
   switch(arr[1]){
       case 0:
       System.out.print("");
       break;
       case 1:
       System.out.print("One");
       break;
       case 2:
       System.out.print("Two");
       break;
       case 3:
       System.out.print("Three");
       break;
       case 4:
       System.out.print("Four");
       break;
       case 5:
       System.out.print("Five");
       break;
       case 6:
       System.out.print("Six");
       break;
       case 7:
       System.out.print("Seven");
       break;
       case 8:
       System.out.print("Eight");
       break;
       case 9:
       System.out.print("Nine");
       break;
       

   }
}
catch(Exception e){
    System.out.println("Please Enter the Two Digit Number");
}
        sc.close();
    }
   
}
