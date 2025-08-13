// 1
// 1 2 1
// 1 2 3 2 1
// 1 2 3 4 3 2 1
class Pattern6 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(j+" ");
            }
            System.out.print(i+" ");
            for(int k=i-1;k>=1;k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
