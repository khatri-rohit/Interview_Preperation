import java.util.Scanner;

public class RecursionProblems {

    public static long pow(int val, int pow) {
        if (pow == 0) {
            return 1;
        } else if (pow == 1) {
            return val;
        }
        return val * pow(val, pow - 1);
    }

    public static long fastPow(int val, int pow) {
        if (pow == 0)
            return 1;
        if (pow == 1)
            return val;

        long temp = fastPow(val, pow / 2);
        if (pow % 2 == 0)
            return temp * temp;
        else
            return val * temp * temp;
    }

    public static boolean isPrime(int prime) {
        if (prime == 2)
            return true;
        if (prime < 2)
            return false;

        int tmp = prime;
        while (prime > 2) {
            prime--;
            if (tmp % prime == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // // 1. Power
        // int value = in.nextInt();
        // int power = in.nextInt();

        // long pow = pow(value, power);
        // System.out.println(pow);

        // pow = fastPow(value, power);
        // System.out.println(pow);

        int prime = in.nextInt();
        boolean isPrime = isPrime(prime);
        System.out.println(isPrime);

        in.close();
    }
}
