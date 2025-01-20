// package Clash of Codes;

public class ArrangeString {
    public static void main(String args[]) {
        String str = "AaabbBccCddeea?";
        String arr[] = new String[127];
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == (int) str.charAt(i)) {
                    if (arr[j] == null)
                        arr[j] = "";
                    arr[j] = arr[j] + str.charAt(i);
                }
            }
        }

        for (String string : arr) {
            if (string != null)
                System.out.println(string);
        }
    }
}
