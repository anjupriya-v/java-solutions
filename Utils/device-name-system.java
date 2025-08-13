import java.util.*;
//  input: 
//  n=6
//  array values : ["Switch","Tv","Switch","Tv","Switch","Tv"]
//  output array will be: [" Switch","Tv","Switch1","Tv1","Switch2","Tv2"]
class DeviceNameSystem {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        StringBuilder sb;
        String str[]=new String[n]; 
        sc.nextLine();
        for(int i=0;i<n;i++){
            str[i]=sc.nextLine();
        }
        int count=1;
        for(int i=0;i<n;i++){
            count=1;
            for(int j=i+1;j<n;j++){
                sb=new StringBuilder(str[j]);
                if(str[i].equals(sb.toString())&& ! Character.isDigit(str[j].charAt(str[j].length()-1))){
                   sb.append(count);
                   str[j]=sb.toString();
                   count++;
                }
            }
        }
        System.out.println("Device names in the required order:");
        for(int i=0;i<n;i++){
            System.out.println(str[i]);
        }
        sc.close(); 
    }
   
}
