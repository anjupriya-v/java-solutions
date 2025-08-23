import java.text.SimpleDateFormat;
import java.util.*;
import java.text.*;

public class PrintDate {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Type the Date Format : date-dd, month- MM , Year-yyyy");
        String pattern=sc.nextLine();//MM-dd-yyyy
        SimpleDateFormat format=new SimpleDateFormat(pattern);
        String date=format.format(new Date());
        System.out.println("The Date is :");
        System.out.println(date);
    }
}
