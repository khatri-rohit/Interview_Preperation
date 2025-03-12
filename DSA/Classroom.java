// package DSA;

import java.util.*;

public class Classroom {
    public static void main(String[] args) {
        // // 2, 7, 11, 13 -> 9 -> [0,1]
        // int sum = 0;
        // int target = 9;
        // int[] sums = new int[2];
        // int[] nums = { 2, 7, 11, 13 };

        // for (int i = 0; i < nums.length - 1; i++) {
        //     sum = nums[i] + nums[i + 1];
        //     if (sum == target) {
        //         sums[0] = i;
        //         sums[1] = i + 1;
        //         break;
        //     }
        // }

        // System.out.println(sums);

        LinkedList<Integer> ll = new LinkedList<>();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);

        System.out.println(ll);

        System.out.println(ll.element());

        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
