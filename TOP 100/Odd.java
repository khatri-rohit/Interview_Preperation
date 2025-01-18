// package TOP 100;

public class Odd {

    public static boolean Even(int number) {
        return ((number & 1) == 0 ? true : false);
    }

    public static void main(String[] args) {
        System.out.println(Even(5) ? "EVEN" : "ODD");
    }
}
