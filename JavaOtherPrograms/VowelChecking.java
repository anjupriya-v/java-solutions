import java.util.Scanner;

public class VowelChecking {
    public static void main(String args[] ) throws Exception {
String str;
int flag = 0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String: ");
str=sc.nextLine();
System.out.println(vowelPresent(str));
char[] characters=str.toCharArray();

for(int i=0;i<characters.length;i++){
 switch(characters[i]){
   case 'a':
  flag=1;
  break;
  case 'e':
  flag=1;
  break;
  case 'i':
  flag=1;
  break;
  case 'o':
  flag=1;
  break;
  case 'u':
  flag=1;
  break;
  default:
  continue;

 }
}
 if(flag==1){
   System.out.println("The Vowel is Present");
 }
 else{
   System.out.println("The Vowel is not present");
 }
  }
  public static boolean vowelPresent(String str){
   return str.toLowerCase().matches(".*[aeiou].*");

  }
}

