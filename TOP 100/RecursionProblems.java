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

    public static int smallestArr(int arr[], int index, int min) {
        int idx = index;

        if (arr[index] < min)
            min = arr[index];

        if (idx == arr.length - 1)
            return min;
        idx++;
        return smallestArr(arr, idx, min);
        // int small = Integer.MAX_VALUE;
        // for (int i : arr) {
        // if (i < small) {
        // small = i;
        // }
        // }
        // return small;
    }

    public static int reversingNum(int num, int rev) {
        if (num <= 0)
            return rev;

        rev = rev * 10 + num % 10;
        return reversingNum(num / 10, rev);
        // int rev = 0; // 123
        // while (num != 0) {
        // rev = (rev * 10) + (num % 10);
        // num /= 10;
        // }
        // System.out.println(rev);

    }

    public static int HCF(int a, int b, int hcf) {
        if (hcf == 1)
            return hcf;

        if (a % hcf == 0 && b % hcf == 0)
            return hcf;
        hcf = hcf - 1;
        return HCF(a, b, hcf);
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

        // // 2. Check Prime
        // int prime = in.nextInt();
        // boolean isPrime = isPrime(prime, 2);
        // System.out.println(isPrime);

        // // 3. 4 . Smallest & Largest in Array
        // int arr[] = { 2, 4, -3, 70, 14, 85, 12, 547, 8512, 958, 412, 0 };
        // System.out.println(largestArr(arr, 0, 0));
        // System.out.println(smallestArr(arr, 0, 0));

        // //5. Reverse Number
        // int num = in.nextInt();
        // System.out.println(reversingNum(num, 0));

        int a = 30, b = 36;
        int min = a < b ? a : b;
        System.out.println(HCF(a, b, min - 1));

        in.close();
    }
}
