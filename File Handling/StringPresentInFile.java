import java.io.*;
import java.util.*;
public class StringPresentInFile {
    public static void main(String[] args) {
        String str="hello";
        int flag=0;
        try{
            File file=new File("D:/Java/JavaOtherPrograms/Sample.txt");
            Scanner sc=new Scanner(file);
            while(sc.hasNextLine()){
                if(sc.nextLine().toLowerCase().contains(str.toLowerCase())){
                    flag=1;
                 sc.close();
                 break;
                }
                else{
                    flag=0;
                }
    
            }
            if(flag==1){
                System.out.println("That String is present in the file");
            }
            else{
                System.out.println("That String is not present in the file");
            }
sc.close();
        }
        catch(FileNotFoundException e){
            System.err.println("File is not found");
        }
      
        
    }
}
