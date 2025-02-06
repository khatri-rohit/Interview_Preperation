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
        System.out.println(main instanceof Main);

        /*
         * int arr[] = { 1, 2 };
         * main(arr); // int arr
         * main();
         * main("Rohit");
         */
    }
}

class Surname {
    String surname = "Khatri";
}

class Rohit extends Surname {
    String name = "Rohit" + surname; // Inherited SUrname form Parent class

    public static void main(String[] args) {
        short n = (short) 45356;
        System.out.println("Hello Class Rohit\n" + n + " short number");
    }
}

// abstract class Animal {
//     abstract public void walk();

//     public void eat() {

//     }
// }

class Horse implements Animal {
    public void walk() {
        System.out.println("Walk on 4 legs");
    }
}

// class Chicken extends Animal {
class Chicken implements Animal {
    public void walk() {
        System.out.println("Walk on 2 legs");
    }
}

interface Animal{
    void walk();
}

class OOPS {
    public static void main(String[] args) {
        Horse hourse = new Horse();
        hourse.walk();
        
    }
}