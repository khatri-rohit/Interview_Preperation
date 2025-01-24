import java.util.Scanner;

public class LCM {

    public static int count(int num) {
        int len = 0;
        for (; num > 0; len++, num /= 10) {
            ;
        }
        return len;
    }

    public static void lcm(int a, int b) {
        int val = (a * b);
        // int count = 0;
        for (int i = (a * b); i > a; i--) {
            if ((i % a == 0 && i % b == 0) && i < val) {
                val = i;
            }
            // count++;
        }
        System.out.println(val);
        // System.out.println(count);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        lcm(a, b);
        // Q.2 Find The number of digits in a NUMBER.
        int num = in.nextInt();
        int result = count(num);
        System.out.println(result);
    }
}
