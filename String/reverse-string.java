import java.util.*;
class ReverseString {
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        int index=0;
        StringBuilder sb=new StringBuilder(str);
        char[] ch=str.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            sb.setCharAt(index, str.charAt(i));
            index++;
        }
        System.out.println(sb);
        sc.close();
    }
}
