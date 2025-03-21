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

    public static boolean isPrime(int prime, int tmp) {
        if (prime == tmp)
            return true;
        if (prime < 2)
            return false;

        if (prime % tmp == 0)
            return false;

        int temp = tmp + 1;
        return isPrime(prime, temp);
    }

    public static int largestArr(int arr[], int index, int max) {
        int idx = index;

        if (arr[index] > max)
            max = arr[index];

        if (idx == arr.length - 1)
            return max;
        idx++;
        return largestArr(arr, idx, max);

        // int larg = Integer.MIN_VALUE;
        // for (int i : arr) {
        // if (i > larg) {
        // larg = i;
        // }
        // }
        // return larg;
    }

    public static int smallestArr(int arr[]) {
        int small = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < small) {
                small = i;
            }
        }
        return small;
    }

    public static int reversingNum(int num) {
        if (num == 0)
            return 0;
        
        int res = reversingNum(num % 10);

        // int rev = 0; // 123
        // while (num != 0) {
        // rev = (rev * 10) + (num % 10);
        // num /= 10;
        // }
        // System.out.println(rev);

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

        // int prime = in.nextInt();
        // boolean isPrime = isPrime(prime, 2);
        // System.out.println(isPrime);

        int arr[] = { 2, 4, -3, 70, 14, 85, 12, 547, 8512, 958, 412, 0 };
        System.out.println(largestArr(arr, 0, 0));
        // System.out.println(smallestArr(arr));

        // int num = in.nextInt();
        // System.out.println(reversingNum(num));

        in.close();
    }
}
