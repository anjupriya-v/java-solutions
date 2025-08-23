import java.util.*;
public class MergeList {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();
        List<String> list2=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the 1st array");
        int n1=sc.nextInt();
        System.out.println("Enter the size of the 2nd array");
        int n2=sc.nextInt();
        int i=0;
        System.out.println("Enter the elements of the array 1 ");
        while(i<n1){
            list1.add(sc.next());
            i++;
        }
      i=0;
        System.out.println("Enter the elements of the array 2 ");
        while(i<n2){
            list2.add(sc.next());
            i++;
        }
        List<String> mergedList=new ArrayList<>(list1);
        mergedList.addAll(list2);
        System.out.println(mergedList);
        
        
    }
}
