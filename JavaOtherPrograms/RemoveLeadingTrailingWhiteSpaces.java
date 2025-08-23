import java.util.*;
public class RemoveLeadingTrailingWhiteSpaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        //s=" Hello World\t" Sample input
        str=str.strip();
        System.out.println("Output :"+str);

    }
}
