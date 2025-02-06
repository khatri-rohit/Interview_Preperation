public class Star {
    public static void main(String args[]) {

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
        // for(int j = 1; j <= col; j++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // col = (i < n ) ? col - 1 : col + 1;
        // }

        // 2.
        // int n = 5, col = n;
        // for(int i = 1; i < (n + n); i++){
        // System.out.println("* ".repeat(col));
        // col = (i < n ) ? col - 1 : col + 1;
        // }

        // 2.
        // * *
        // * * * *
        // * * * * * *
        // * * * * * * * *
        // * * * * * * * * *

        // int n = 5;
        // for(int i = 1; i <= n; i++){
        // for(int j = 1; j < (n + n); j++){
        // System.out.print((j <= i || j >= (n + n - i)) ? "* " : " ");
        // }
        // System.out.println();
        // }

        // 1.
        // * *
        // * * * *
        // * * * * * *
        // * * * * * * * *
        // * * * * * * * *
        // * * * * * *
        // * * * *
        // * *

        // int n = 4;
        // for (int i = 1; i <= (n + n); i++) {
        // for (int j = 1; j <= (n + n); j++) {
        // if (i <= n) {
        // System.out.print((j <= i) ? "* " : ((i + j) > (n * 2)) ? "* " : " ");
        // } else {
        // System.out.print(((n + j) >= (i - n)) ? "* " : (n + (j - i)) >= (n) ? "* " :
        // " ");
        // }
        // }
        // System.out.println();
        // }

        // 1
        // 2 2
        // 3 3 3
        // 4 4 4 4
        // 5 5 5 5 5

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = n; j > 0; j--) {
        // System.out.print((j <= i) ? i + " " : " ");
        // }
        // System.out.println();
        // }

        // 1
        // 212
        // 32123
        // 4321234
        // 543212345

        // int n = 5, sum = 0, x = 10;
        // for (int i = 1; i <= n; i++) {
        // sum = (sum * 10) + i;
        // int len = 0;
        // while (len < (n - i)) {
        // System.out.print(" ");
        // len++;
        // }
        // System.out.println(sum);
        // sum = ((i + 1) * x) + sum;
        // x *= 100;
        // }

        int n = 5;
        for (int i = 1; i <= n * 2 - 1; i++) {
            for (int j = 1; j <= n * 2 - 1; j++) {
                if (i <= n) {
                    System.out.print(((i + j - 1) >= n) ? "* " : "  ");
                }
            }
            System.out.println();
        }

    }
}