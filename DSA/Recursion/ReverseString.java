// package DSA.Recursion;

public class ReverseString {
    static int count = 0;

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

    public static String moveX(String str, String newString, int index) {
        if (index == str.length()) {
            while (count > 0) {
                newString = newString + "x";
                count--;
            }
            return newString;
        }
        if (str.charAt(index) != 'x') {
            newString += str.charAt(index);
        } else {
            count++;
        }
        return moveX(str, newString, index + 1);
    }

    public static String removeDuplicate(String str, String newString, int index, boolean map[]) {
        if (index == str.length()) {
            return newString;
        }
        int idx = str.charAt(index) - 'a';
        if (!map[idx]) {
            newString += str.charAt(index);
            map[idx] = true;
        }
        return removeDuplicate(str, newString, index + 1, map);
        // if (!newString.contains(String.valueOf(str.charAt(index)))) {
        // newString += str.charAt(index);
        // }
    }

    static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printComb(String str, int index, String newString) {
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }

        char curChar = str.charAt(index);
        String mapping = keypad[curChar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            printComb(str, index + 1, newString + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {

        // String rev = "abcd"; // Reverse String
        // reverse(rev, rev.length() - 1);

        // String str = "padhanbs"; // Reverse String
        // track(str, 'a', 0, -1, -1);

        // int arr[] = { 1, 2, 3, 4, 5 };
        // System.out.println(assending(arr, 0));

        // String str = "axbcxxd";
        // String newString = "";
        // System.out.println(moveX(str, newString, 0));

        // String str = "roihrit";
        // String newString = "";
        // boolean map[] = new boolean[26];
        // System.out.println(removeDuplicate(str, newString, 0, map));

        String str = "23";
        printComb(str, 0, "");

    }
}
