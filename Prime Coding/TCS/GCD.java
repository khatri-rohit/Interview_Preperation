// package Prime Coding.TCS;

public class GCD {
    public static void main(String args[]) {
        int a = 36, b = 60, val = a < b ? a : b;
        for (; val > 0; val--) {
            if (a % val == 0 && b % val == 0) {
                System.out.println(val);
                break;
            }
        }
        System.out.println(val);
    }
}