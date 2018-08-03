public class PrintPyramidPatterns {
    public void printStars(int n){
        if(n == 0){
            return;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("X ");
            }
            System.out.println();
        }

    }
}
