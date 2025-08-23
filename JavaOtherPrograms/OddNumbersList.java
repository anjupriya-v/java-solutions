import java.util.*;

public class OddNumbersList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the list");
        int n=sc.nextInt();
        int flag=0;
        System.out.println("Enter the Array of elements");
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        for(int i:list){
            if(i%2!=0){
                flag=1;
            }
            else{
                System.out.println("The given list not contains only odd numbers");

                break;
               
            }
        }
        if(flag==1){
            System.out.println("The given list contains only odd numbers");
        }
    }
}
