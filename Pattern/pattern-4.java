import java.util.Scanner;

class Pattern4 {
    // when n=3, m=8
    //3 2 1
    //4 5 6
    //* 8 7

    public static void main(String[] args) {
        int n,m,i=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int temp=n;
        while(true){
                if(i%2==0){
                    for(int j=n-1;j>=0;j--){
                        if(temp>m){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print(temp+" ");
                        }
                        temp--;
                    }
                    temp+=n+1;
                }
                else{
                    for(int k=0;k<n;k++){
                        if(temp>m){
                            System.out.println("* ");
                        }
                        else{
                            System.out.print(temp+" ");
                            
                        }
                        temp++;
                        
                    }
                    temp+=n-1;
                
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
