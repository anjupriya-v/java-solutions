import java.util.*;
class Pattern1{
    //when n=3,m=11
    //1 2 3
    //6 5 4
    //7 8 9
    //- 11 10
    public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int temp=1,i=0;
                while(true){
                    if(i%2==0){
                        for(int j=1;j<=n;j++){
                            if(temp>m){
                                System.out.print("-"+" ");
                            }
                            else{
                                System.out.print(temp+" ");
                            }
                            temp++;
                        }
                        temp=temp+n-1;
                    }
                    else{
                        for(int j=n;j>0;j--){
                            if(temp>m){
                                System.out.print("-"+" ");
                            }
                            else{
                                System.out.print(temp+" ");
                            }
                            temp--;
                        }
                        temp=temp+n+1; 
                    }
                   
                    
                    System.out.println();    
                    i++;
                    if((n*i)+1>m){
                        break;
                    }
                }
             
           sc.close(); 
    }
}
