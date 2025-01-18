// package Javas;

interface Trying {
    String setName(String name);
}

abstract class Names implements Trying {
    // String Name;
    // Names() {
    // System.out.println("Java Names Constructor");
    // }
    // public String setName(String name){
    // Name = name;
    // return name;
    // }
}

class barry extends Names {
    public String setName(String name) {
        return name;
    }
}

class Welcome {
    public static void main(String args[]) {
        // Names obj = new Names();
        // System.out.println(obj.setName("Khatri"));
    }
}
