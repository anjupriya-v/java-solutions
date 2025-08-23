import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        double n;
        int rem=0,value=0;
        StringBuilder temp=new StringBuilder();
        String tempStr="";
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        String [] str=new String[(int)Math.pow(2,n )];
int index=0;
int[]array=new int[2];
System.out.println("Hello");
        for(int i=0;i<Math.pow(2,n );i++){
            index=i;
            if(index==0){
                tempStr+=0;
            }
            while(index>0){
                rem=index%2;
                tempStr+=rem;
                index/=2;
            }
           
            System.out.println(tempStr);
            tempStr="";

            // if(Integer.parseInt(tempStr)<10){
            //     temp.setCharAt(0, '0');
            // }
            // str[i]=String.valueOf(temp);
        }
        // for(int i=0;i<str.length;i++){
        //     System.out.println(str[i]);
        // }
    }

}
