public class Main {
    public static void main(String[] args) {
        Thread1  t1 = new Thread1();

//        Runnable r1 = new Thread2();
//        Thread t2 = new Thread(r1);

        Thread t2 = new Thread(new Thread2());

        t1.start();
        t2.start();

    }
}
class Thread1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName());
        }
    }
}
class Thread2 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}