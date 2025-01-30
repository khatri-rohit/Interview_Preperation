// package DSA.Recursion;

public class ReverseString {
    public static void reverse(String str, int i) {
        if (i < 0)
            return;
        System.out.print(str.charAt(i));
        i -= 1;
        reverse(str, i);
    }

    // public static void track(String str, char element, int start, int end,
    // boolean stat, boolean ed) {
    // if (start > end) {
    // return;
    // }
    // if (str.charAt(start) == element && !stat) {
    // System.out.println("1st occurance " + start);
    // stat = true;
    // }
    // if (str.charAt(end) == element && !ed) {
    // System.out.println("Last occurance " + end);
    // ed = true;
    // }
    // track(str, element, start += 1, end -= 1, stat, ed);
    // }

    public static void track(String str, char element, int index, int first, int last) {
        if (str.length() == index) {
            System.out.println("1st " + first);
            System.out.println("Last " + last);
            return;
        }

        if (str.charAt(index) == element && first < 0) {
            first = index;
            last = index;
        } else if (str.charAt(index) == element) {
            last = index;
        }
        track(str, element, ++index, first, last);
    }

    public static boolean assending(int arr[], int idx) {
        if (idx == arr.length - 1)
            return true;

        if (arr[idx] >= arr[idx + 1]) {
            return false;
        } else {
            return assending(arr, idx + 1);
        }
    }

    public static void main(String[] args) {

        // String rev = "abcd"; // Reverse String
        // reverse(rev, rev.length() - 1);

        // String str = "padhanbs"; // Reverse String
        // track(str, 'a', 0, -1, -1);

        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(assending(arr, 0));
    }
}
