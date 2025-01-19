public class Star {
    public static void main(String args[]){
        
        // 1. 
        // * * * * * 
        // * * * *  
        // * * *  
        // * *  
        // * 
        // * *  
        // * * * 
        // * * * * 
        // * * * * *

        // 1.
        // int n = 5, col = n;
        // for(int i = 1; i < (n + n); i++){
        //     for(int j = 1; j <= col; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        //     col = (i < n ) ? col - 1 : col + 1; 
        // }

        // 2.
        // int n = 5, col = n;
        // for(int i = 1; i < (n + n); i++){
        //     System.out.println("* ".repeat(col));
        //     col = (i < n ) ? col - 1 : col + 1; 
        // }

        // 2.
        // *               *
        // * *           * *
        // * * *       * * *
        // * * * *   * * * *
        // * * * * * * * * *

        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j < (n + n); j++){
                System.out.print((j <= i || j >= (n + n - i)) ? "* " : "  ");
            }
            System.out.println();
        }


    }
}