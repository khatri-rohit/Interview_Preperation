import java.util.*;

public class RangePalindrome {

    static void isPalindrome(int num) {
        int tmp = num, sum = 0;
        while (tmp != 0) {
            sum = sum * 10 + (tmp % 10);
            tmp /= 10;
        }
        if (num == sum)
            System.out.println("Is Palindrome " +  num);
    }

    public static void isPalindromeReverse(int num){
        int tmp = num, sum = 0;
        while(tmp != 0){
            int r = tmp % 10;
            sum = (sum * 10) + r;
            tmp /= 10;
        }
        isPalindrome(sum + num);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        isPalindromeReverse(num);
        
        // int a = 1, b = 100;
        // for (int i = a; i <= b; i++) {
        //     isPalindrome(i);
        // }
    }
}
