import java.util.*;

public class DistinctCharactersCount {
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // System.out.println("Enter the String");
        // String str=sc.nextLine();
        // int count=0,flag=0;
        // str=str.toLowerCase();
        // for(int i=0;i<str.length();i++){
        //     for(int j=0;j<str.length();j++){
        //         if(str.charAt(i)==str.charAt(j)&& i!=j){
        //             flag=1;
        //             break;
        //         }
        //     }
        //     if(flag==0){
        //         count++;
        //     }
        //     flag=0;

        // }
        // System.out.println("The distinct characters count in that string is "+count);
        String str1 = "abcdABCDabcd";

char[] chars = str1.toCharArray();

Map<Character, Integer> charsCount = new HashMap<>();

for(char c : chars) {
	if(charsCount.containsKey(c)) {
		charsCount.put(c, charsCount.get(c)+1);
	}else
		charsCount.put(c, 1);
}

System.out.println(charsCount); 
    }
}
