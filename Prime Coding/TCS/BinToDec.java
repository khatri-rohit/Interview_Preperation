// package Prime Coding.TCS;

import java.util.Scanner;

public class BinToDec {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt(), tmp = num, len = 0;
        for (; tmp > 0; len++, tmp /= 10)
            ;
        int arr[] = new int[len];
        int index = len - 1;
        while (num != 0) {
            arr[index--] = num % 10;
            num /= 10;
        }
        int value = 1;
        for (int i = len - 1; i >= 0; i--) {
            if (arr[i] == 1)
                tmp += value;
            value = value * 2;
        }
        System.out.println(tmp);
    }
}
