import java.util.*;
class PrimeNumber {
    static int func(int n){
        int flag=1;
        if(n==2){
            return flag;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=0;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        List<Integer> list=new ArrayList<Integer>();
        System.out.println("The Prime Numbers from 1 to "+n+"is");
        for(int i=2;i<n;i++){
            if(func(i)==1){
                list.add(i);
            }
            
        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }
        sc.close();
    }
}
