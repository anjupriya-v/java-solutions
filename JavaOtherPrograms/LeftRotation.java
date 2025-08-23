import java.io.*;
import java.util.*;
public class LeftRotation {
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        int j=0,firstElem=0;
        

    for(int i=0;i<d;i++){
        firstElem=a.get(0);
        for(j=0;j<a.size()-1;j++){
           

             a.set(j,a.get(j+1));  
        }
        a.set(a.size()-1,firstElem);
    }
   
    
    return a;

    }
    
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>(
            Arrays.asList(1,2,3,4,5));
        int d=4;
        System.out.println(rotLeft(arr,d));
    }
}
