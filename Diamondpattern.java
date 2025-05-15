public class Diamondpattern {
    public static void main(String[] args) {
        int n=4;
        //Top
        for(int i=0; i<n; i++){
            for(int j=n-1; j>=0; j--){
                if(j > i){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }for(int j=0; j<=n; j++){
                if(j < i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //Bottom
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j <= i){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            for(int j=n-2; j>0; j--){
                if(j > i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }
}
