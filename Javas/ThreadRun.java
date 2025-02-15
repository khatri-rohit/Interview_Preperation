class A implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable{

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hii !");
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadRun {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        // System.out.println(obj1.getPriority());
        // System.out.println(obj2.getPriority());
        // obj1.setPriority(Thread.MAX_PRIORITY);
        // obj1.setPriority(Thread.MAX_PRIORITY);

        // When we extends Thread
        // obj1.start();
        // obj2.start();
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

    }
}
