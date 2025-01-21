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

    public static void binToDec(long num) {
        long tmp = num;
        int len = 0;
        for (; tmp > 0; len++, tmp /= 10)
            ;
        long arr[] = new long[len];
        int index = len - 1;
        while (num != 0) {
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
        for (int i = 0; i < num.length(); i++) {
            if (Integer.valueOf(num.charAt(i)) <= 59) {
                dec += (Integer.valueOf(num.charAt(i) - 48) * Math.pow(16, num.length() - i - 1));
            } else {
                dec += (((int) (num.charAt(i)) - 55) * Math.pow(16, num.length() - i - 1));
            }
        }
        System.out.println(dec);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        // long num = in.nextLong();
        // // binToDec(num);
        // decToBin(num);
        // decToHex(num);

        String num = in.next();
        hexToDec(num);

    }
}
