/*remove all occurrences of a given character from input String */
import java.util.*;
public class RemoveOccurences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input string");
        String str=sc.nextLine();
        str=str.replace("e","");
        System.out.println("The Final String is "+str);
    }
}
