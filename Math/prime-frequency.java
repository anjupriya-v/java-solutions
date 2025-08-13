import java.util.*;
class PrimeFrequency {
    static int isPrime(int n){
        int flag=0;
        if(n==2){
            flag=1;
            return flag;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=0;
                break;
            }
            else{
                flag=1;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        String s;
        int count=1;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        int[]CountFrequencies =new int[s.length()];
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    ch[j]=' ';
                    count++;
                }
                

            }
            CountFrequencies[i]=count;
                count=1;
            
        }
        for(int i=0;i<CountFrequencies.length;i++){
            if(ch[i]!=' '){
                if(isPrime(CountFrequencies[i])==1){
                    System.out.println(ch[i]);
                }
                
            }
        }
        sc.close();

    }
}
