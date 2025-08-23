import java.util.*;
public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        int i=0;
        StringBuilder result=new StringBuilder();
        char[] character=str.toCharArray();
        while(i<character.length){
            if(!Character.isWhitespace(character[i])){
                result.append(character[i]);
            }
            i++;
        }
        System.out.println(result.toString());

    }
}
