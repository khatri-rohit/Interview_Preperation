class A {
    public void showA() {
        System.out.println("Show Data A");
    }
}

class B extends A {
    public void showB() {
        System.out.println("Show Data B");
    }

    public static void main(String[] args) {
        A obj = new B();
        obj.showA();

    }
}

class Wrapper {

    static int inValue = 5;

    static {
        inValue = 10;
    }

    public static void main(String[] args) {
        String num = "5";
        Integer num1 = new Integer(num); // Boxing
        // Integer num1 = num; // AutoBoxing
        System.out.println(num1);
        System.out.println(inValue);

    }
}