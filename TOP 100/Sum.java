
// package TOP 100;
import java.lang.Runtime;

public class Sum {

    static int getSum(int n) {
        if (n == 0)
            return 0;

        return n + getSum(n - 1);
    }

    public static void main(String args[]) {
        int n = 11;
        if (getSum(n) == 55)
            System.out.println(getSum(n));
        Runtime.getRuntime().exit(n);
    }
}
