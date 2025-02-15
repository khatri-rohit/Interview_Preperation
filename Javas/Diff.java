
class Anonymous {
    int age = 20;
    String name = "Rohit";

    void getAge() {
        System.out.println("Override this method");
    }

}

public class Diff {
    public static void main(String args[]) {
        System.out.println("Difference between Final and Finalize");

        try {
            int a = 5 / 1;
            System.out.println(a);
            int arr[] = { 1, 2 };
            System.out.println(arr[5]);
        } catch (Exception e) {
            System.out.println();
            System.err.println(e);
        } finally {
            System.out.println("Runs Anyway");
        }

        // Anonyomus inner classes
        Anonymous obj = new Anonymous() {
            @Override
            public void getAge() {
                System.out.println(name + " -> " + age);
            }
        };

        obj.getAge();
    }
}
