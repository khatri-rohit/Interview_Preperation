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