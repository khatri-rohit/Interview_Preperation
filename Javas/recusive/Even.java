class ODD {
    // SUM OF EVEN/ODD VALUES USING RECURSION FUNCTION
    static int sum = 0;

    static int Recursion(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;

        int a = n % 10;
        if (a % 2 == 0)
            sum += a;
        n = n / 10;
        return Recursion(n);
    }

    public static void main(String args[]) {
        int n = 1234;
        Recursion(n);
        System.out.println(sum);
    }
}