class Fibo {

    static int fibo(int num) {
        int a = 0, b = 1, c = 0;

        if(num == 1)
            return 0;

        if(num == 2)
            return 1;

        for (int i = 1; i <= num; i++) {
            // System.out.print(i == num ? "\b " + c : c + ", ");
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String args[]) {
        int num = Integer.parseInt(args[0]);
        System.out.println(fibo(num  - 2));
        // fibo(num);
        System.out.println();
    }
}
