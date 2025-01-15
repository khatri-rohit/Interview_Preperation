// package Javas;

import java.lang.System;

abstract class Trying {
    String setName(String name) {
        return name;
    }
}

class Names extends Trying {
    Names() {
        System.out.println("Java Names Constructor");
    }
}

class Welcome {
    public static void main(String args[]) {
        Names obj = new Names();
        System.out.println(obj.setName("Khatri"));
    }
}
