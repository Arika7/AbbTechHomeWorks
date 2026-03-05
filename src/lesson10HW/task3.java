package lesson10HW;

public class task3 {

    static void main() {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 8; i++) {
                System.out.println("Thread 1: " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 8; i++) {
                System.out.println("Thread 2: " + i);
            }
        });

        t1.start();
        t2.start();
    }
}
