import java.util.*;
import java.math.*;
public class FindLastDigitOf2LargeNumbers {
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the 1st Number");
     String a=sc.next();
     System.out.println("Enter the 2nd Number");
     String b =sc.next();
    int last_digit = getLastDigitOfTwoNumbers(a,b);
    System.out.println("Last digit "+last_digit);
     sc.close();
    }
    static BigInteger findRepeatingCycleAndFindRem(BigInteger a,BigInteger b){
        //finding repeating cycles
        System.out.println("Cycle"+a.mod(BigInteger.valueOf(10)).intValue()+ " - "+ b.mod(BigInteger.valueOf(4)));
        switch(a.mod(BigInteger.valueOf(10)).intValue()){
            case 2:
            case 3:
            case 7:
            case 8:
             if(b.mod(BigInteger.valueOf(4)).equals(BigInteger.ZERO)){
                return BigInteger.valueOf(4);
             };
             return b.mod(BigInteger.valueOf(4));
            case 4:
            case 9: 
                if(b.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)){
                    return BigInteger.valueOf(2);
                };
                return b.mod(BigInteger.valueOf(2));
            case 5: 
            case 6:
              return BigInteger.valueOf(1);
            default:
                return BigInteger.valueOf(0);
        }
    }

    static int findRepeatingCycleAndComputeLastDigit(BigInteger a, BigInteger b){
        if(b.equals(BigInteger.ZERO)){
            return 1;
        }
        if(a.equals(BigInteger.ZERO)){
            return 0;
        }
        if(a.mod(BigInteger.valueOf(10)).equals(BigInteger.ZERO)){
            return 0;
        }
        System.out.println("Value"+a.mod(BigInteger.TEN) +" - "+findRepeatingCycleAndFindRem(a, b).intValue()+" - "+ b.mod(BigInteger.valueOf(4)));
        return a.mod(BigInteger.TEN).pow(findRepeatingCycleAndFindRem(a, b).intValue()).intValue(); 
        //(int)(Math.pow(a%10,findRepeatingCycleAndFindRem(a, b)));
    }
    static int getLastDigitOfTwoNumbers(String a,String b){
        return findRepeatingCycleAndComputeLastDigit(new BigInteger(a),new BigInteger(b)) % 10;
    }
}