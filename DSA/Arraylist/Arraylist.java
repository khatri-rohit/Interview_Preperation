// package DSA.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        list1.add(0, 12);
        for (int i = 0; i < 3; i++) {
            // Append in the end
            list1.add(i);
        }
        System.out.println(list1);

        // Get Value for Index
        System.out.println(list1.get(0));

        // Add at between
        list1.add(1, 4);
        System.out.println(list1);

        // Set a element
        list1.set(0, -1);
        list1.set(1, -0); // Replace new value form old
        System.out.println(list1);

        list1.remove(0); // by Index
        System.out.println(list1);

        System.out.println(list1.size());

        int arr[] = { 10, 20, 30, 40 };
        // Using forEach with block scope
        for (Integer item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();

        Collections.sort(list1);

        list1.forEach(item -> {
            System.out.print(item + " ");
        });

    }
}
