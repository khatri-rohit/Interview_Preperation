// package Prime Coding.TCS;

public class RangePalindrome {

    static void isPalindrome(int num) {
        int tmp = num, sum = 0;
        while (tmp != 0) {
            sum = sum * 10 + (tmp % 10);
            tmp /= 10;
        }
        if (num == sum)
            System.out.print(num + " ");
    }

    public static void main(String args[]) {
        int a = 1, b = 100;
        for (int i = a; i <= b; i++) {
            isPalindrome(i);
        }
    }
}
