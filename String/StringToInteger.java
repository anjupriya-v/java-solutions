public class StringToInteger {
    static int  func(String number){
        int sum=0, pow=0;
        for(int i=number.length()-1;i>=0;i--){
            int c=number.charAt(i);
            sum+=Math.pow(10,pow)*((int)c-(int)'0');
            pow++;
          
        }
        return sum;
    }
    public static void main(String args[]){
        System.out.println("The Integer is "+ func("1058"));
    }
}
