class Fibo {

    static void fibo(int num) {
        int a = 0, b = 1, c = 0;
        for (int i = 1; i <= num; i++) {
            System.out.print(i == num ? "\b " + c : c + ", ");
            a = b;
            b = c;
            c = a + b;
        }
    }

    public static void main(String args[]) {
        int num = Integer.parseInt(args[0]);
        // System.out.println(fibo(num - 2));
        fibo(num);
    }
}
