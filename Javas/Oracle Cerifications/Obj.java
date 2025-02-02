public class Obj {

    static int z; // class vairables
    int u; // instance

    protected String name = "Hey";
    {
        System.out.println(z);
        System.out.println(u);
        System.out.println("I'm a  Outside block " + name);
    }

    public Obj(String name) {
        this.name = name;
        System.out.println("I'm a Constructor");
    }

    public static void main(String args[]) {
        Obj obj = new Obj("Rohit");
        System.out.println(obj.name);
        obj.name = "Rohit Khatri";
        System.out.println(obj.name);

        long num = 32414554551212L;
        int bin = 0b111; // 7
        System.out.println(bin);

        int hex = 0xFFb;
        System.out.println(hex);

        int oct = 017;
        System.out.println(oct);

        int million1 = 100000;
        System.out.println(million1);
        int million2 = 1_00_000;
        System.out.println(million2);

        char hey = 'a';
        System.out.println(hey);

        short b = 1, a = b;
        System.out.println(a);

        // boolean b1;
        // System.out.println(b1);

        double d2;
        double d1[] = { 2.2 };
        System.out.println(d1[0]);

        int answer;
        int answer1;
        boolean check = true;
        if (check) {
            answer = 1;
        } else
            answer = 3;

        System.out.println(answer);
        // System.out.println(answer1);

        // Obj.z = 2;
        System.out.println(Obj.z);
        

    }
}
