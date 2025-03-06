// package Prime Coding.TCS;

import java.util.Scanner;

public class BinToDec {

    public static void decToHex(long num) {
        long tmp = num;
        String hex = "";
        // 2046
        while (tmp != 0) {
            long m = (tmp) % 16;
            if (m > 9 && m < 16)
                hex = String.valueOf((char) (m + 55)) + hex;
            else
                hex = String.valueOf(m) + hex;

            tmp /= 16;
        }
        System.out.println(hex);
    }

    public static void decToBin(long num) {
        long tmp = num, bin = 0;
        while (tmp != 0) {
            long n = (tmp ^ 2) % 2;
            bin = (bin * 10) + (n);
            tmp /= 2;
        }
        bin = bin * 10;
        System.out.println(bin);
    }

    public static int length(long n) {
        int len = 0;
        long tmp = n;
        for (; tmp > 0; len++, tmp /= 10)
            ;
        return len;
    }

    public static void octToDec(long num) {
        long tmp = num, value = 0;
        int len = 0;

        while (tmp != 0) {
            value += (tmp % 10) * (int) Math.pow(8, len);
            tmp /= 10;
            len++;
        }
        System.out.println(value);
    }

    public static void binToDec(long num) {
        long tmp = 0;
        int len = length(num);

        long arr[] = new long[len];
        int index = len - 1;
        while (num != 0) {
            if (num % 10 > 1) {
                System.out.println("Not a Binary Number");
                return;
            }
            arr[index--] = num % 10;
            num /= 10;
        }
        long value = 1;
        for (int i = len - 1; i >= 0; i--) {
            if (arr[i] == 1)
                tmp += value;
            value = value * 2;
        }
        System.out.println(tmp);
    }

    public static void hexToDec(String num) {
        long dec = 0;
        int len = num.length() - 1;
        for (int i = 0; i < num.length(); i++) {
            if ((Integer.valueOf(num.charAt(i)) - 48) >= 0 && (Integer.valueOf(num.charAt(i)) - 48) <= 9) {
                int value = Integer.valueOf(num.charAt(i)) - 48;
                dec += value * (int) Math.pow(16, len);
            } else {
                int value = Integer.valueOf(num.charAt(i)) - 55;
                dec += value * (int) Math.pow(16, len);
            }
            len--;
        }
        System.out.println(dec);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        // long num = in.nextLong();
        // binToDec(num);
        // decToBin(num);
        // decToHex(num);
        // octToDec(num);

        String num = in.next();
        hexToDec(num);

        in.close();
    }
}
