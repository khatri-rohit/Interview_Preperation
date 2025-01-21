// package Prime Coding.TCS;

public class GCD {
    public static void main(String args[]) {
        int a = 98, b = 56, val = a < b ? a : b;
        for (; val > 0; val--) {
            if (a % val == 0 && b % val == 0) {
                break;
            }
        }
        System.out.println(val);
    }
}