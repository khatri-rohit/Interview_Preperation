// package TOP 100;
import java.util.Scanner;

public class Prime {

    static boolean isPrime(int n, int i) {
        if (n == 2) {
            return true;
        }
        if (n == i) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        i += 1;
        return isPrime(n, i);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int v = 2;
        int n = in.nextInt();
        for(int i = 2; i <= n; i++){
            if(isPrime(i, v)){
                System.out.println(i + " Is a Prime");
            }
            // System.out.println(?  : v + " Not a Prime");
        }
    }
}
