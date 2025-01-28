import java.util.*;

public class JobSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int len = in.nextInt();
        int arr[][] = new int[len][3];
        String sequence = "";
        String profit = "";
        int sum = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < len; i += 2) {
            sum += arr[i][2];
            sequence += String.valueOf(arr[i][0]) + ",";
            profit += String.valueOf(arr[i][2]) + "+";
        }
        System.out.print("Job sequence: [" + sequence);
        System.out.println("\b" + "]");
        System.out.print("Total profit: " + profit);
        System.out.println("\b=" + sum);
    }
}
