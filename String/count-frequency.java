
class CountFrequency{
    public static void main(String args[]){
        String str="amma";
        char ch[]=str.toCharArray();
        int count[]=new int[str.length()];
      
        for(int i=0;i<str.length();i++){
            count[i]=1;
            for(int j=i+1;j<str.length();j++){
                if(ch[i]==ch[j]){
                    count[i]+=1;
                    ch[j]='0';
                }
            }
        }
        for(int k=0;k<str.length();k++){
            if(ch[k]!='0'){
                System.out.println(ch[k]+" "+count[k]);
            }
        }
    }
}
