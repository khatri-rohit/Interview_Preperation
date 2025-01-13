// package Javas;

abstract class Trying {
    String setName(String name) {
        return name;
    }
}

class Names extends Trying {

}

class Welcome {
    public static void main(String args[]) {
        Names obj = new Names();
        System.out.println(obj.setName("Rohit"));
    }
}
