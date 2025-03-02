// package DSA.Strings;

public class Builder {
    public static void main(String[] args) {
        System.out.println("String Builder");

        StringBuilder str = new StringBuilder("Rohit");

        System.out.println(str);
        // System.out.println(str.append("Khatri"));

        // str.setCharAt(5, ' ');
        // System.out.println(str);

        // str.insert(5, ' '); // insert any char in between of string
        // System.out.println(str);

        // str.delete(5, 6);
        // System.out.println(str);

        // Rohit
        for (int i = 0; i < str.length() / 2; i++) {
            char tmp = str.charAt(i);
            str.setCharAt(i, str.charAt(str.length() - 1 - i));
            str.setCharAt(str.length() - 1 - i, tmp);
        }
        System.out.println(str);

    }
}