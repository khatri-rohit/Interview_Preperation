import java.util.Scanner;

public class Unfold2DArray {
    public static void main(String[] args) {
        // char fold[][] = {
        // { 'a', 'b' },
        // { 'b', 'b' }
        // };

        // abba
        // bbbb
        // bbbb
        // abba
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char fold[][] = new char[n][n];

        for (int i = 0; i < fold.length; i++) {
            for (int j = 0; j < fold.length; j++) {
                fold[i][j] = in.next().charAt(0);
            }
        }

        char unfload[][] = new char[fold.length * fold.length][fold.length * fold.length];
        int length = fold.length;
        for (int i = 0; i < unfload.length; i++) {
            int len = length;
            for (int j = 0; j < unfload.length; j++) {
                if (j < len && i < len) {
                    unfload[i][j] = fold[i][j];
                } else {
                    if (i < len) {
                        unfload[i][j] = fold[i][len - j + 1];
                    } else {
                        if (j < len)
                            unfload[i][j] = fold[len - i + 1][j];
                        else
                            unfload[i][j] = fold[len - i + 1][len - j + 1];
                    }
                }
            }
        }
        for (int i = 0; i < unfload.length; i++) {
            for (int j = 0; j < unfload.length; j++) {
                System.out.print(unfload[i][j]);
            }
            System.out.println();
        }

    }
}
