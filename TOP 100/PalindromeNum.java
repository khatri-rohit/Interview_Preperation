class Palindrome {
    public static void main(String args[]) {
        int n = 121, tmp = n;
        int rev = 0;

        while (n != 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        if (rev == tmp)
            System.out.println("It's a Palindrome");
        else
            System.out.println("Not a Palindrome");

    }
}