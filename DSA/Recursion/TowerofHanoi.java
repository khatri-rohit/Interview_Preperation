// package DSA.Recursion;

public class TowerofHanoi {
    static int h = 0, count = 0;

    public static void towerOfHoani(int n, int count) {
        if (n == 1 || h == 1) {
            count += 1;
            return;
        }
        count += 1;
        h += 1;
        towerOfHoani(n - 1, h);
        towerOfHoani(h - 1, count);
    }

    public static void main(String[] args) {
        int n = 3;
        towerOfHoani(n, count);
        System.out.println(count);
    }
}
