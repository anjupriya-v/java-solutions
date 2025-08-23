import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        String reverseString="";
        char[] characters=str.toCharArray();
        StringBuilder out=new StringBuilder();
        for(int i=characters.length-1;i>=0;i--){
            out.append(characters[i]);
        }
       
        reverseString=out.toString();
    
        if(str.equalsIgnoreCase(reverseString)){
            System.out.println("The given string is the palindrome");
        }
        else{
            System.out.println("The given string is not a palindrome");
        }
    }
}
