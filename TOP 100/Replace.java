import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 100123
        int n = in.nextInt();
        
        System.out.println(n);
        int sum = 0, len = 1, tmp = n;
        // int n = 100123, sum = 0, len = 1, tmp = n;
        for (; n > 0; len *= 10, n /= 10)
            ;
        n = tmp;
        try {
            while (len > 0) {
                len /= 10;
                int val = (n / len) % 10;
                if (val == 0) {
                    sum = (sum * 10) + 1;
                } else {
                    sum = (sum * 10) + val;
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println(sum);
    }
}
