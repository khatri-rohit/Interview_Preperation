// package Javas.Oracle Cerifications;
public class Main {
    String name;

    Main(String name) {
        this.name = name;
        System.out.println("Constructor !! " + this.name);
    }

    Main(Main m1) {
        System.out.println("Copy Constructor -> " + m1.name);
    }

    public static void main(String arr) {
        System.out.println("Hello Main!! 2");
    }

    public static void main(String args[]) {
        Main main = new Main("Rohit");
        // Copy Constructor Main
        Main main2 = new Main(main);

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

class Surname{
    String surname = "Khatri";
}

class Rohit extends Surname {
    String name = "Rohit" + surname; // Inherited SUrname form Parent class

    public static void main(String[] args) {
            
        System.out.println("Hello Class Rohit");
    }
}