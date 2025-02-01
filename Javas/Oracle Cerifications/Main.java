// package Javas.Oracle Cerifications;
public class Main {
    public static void main(String arr) {
        System.out.println("Hello Main!! 2");
    }

    public static void main(String args[]) {
        Rohit obj = new Rohit();
        System.out.println("Hello Main!! " + obj.name);
        /*
         * int arr[] = { 1, 2 };
         * main(arr); // int arr
         * main();
         * main("Rohit");
         */

    }
}

class Rohit {
    String name = "Rohit";

    public static void main(String[] args) {
        System.out.println("Hello Class Rohit");
    }
}