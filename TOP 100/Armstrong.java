import java.util.Scanner;

class Armstrong {

    static void armStrong(int arm) {
        int tmp = arm, len = 0, sum = 0;
        for (; tmp > 0; len++, tmp /= 10)
            ;
        tmp = arm;
        while (tmp > 0) {
            int l = len;
            int rem = 1;
            while (l > 0) {
                rem = (tmp % 10) * (rem);
                l--;
            }
            // int rem = (int) Math.pow((tmp % 10), len);
            sum += rem;
            tmp /= 10;
        }
        if(sum == arm){
            System.out.print(sum + " ");
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int arm = in.nextInt();
        for (int i = 1; i <= arm; i++) {
            armStrong(i);
        }
    }
}
