// package TOP 100;

public class Sum {

    public static int getSum(int n) {
        if (n == 0)
            return 0;

        return n + getSum(n - 1);
    }

    public static int getSquareSum(int n) {
        int sqrtSum = 0;
        for (int i = 1; i <= n; i++) {
            sqrtSum += Math.pow(i, 2);
        }
        return sqrtSum;
    }

    public static void main(String args[]) {
        int n = 3;
        System.out.println(getSum(n));
        System.out.println(getSquareSum(n));

    }
}
