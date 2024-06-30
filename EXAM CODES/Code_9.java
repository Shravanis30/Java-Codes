class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - Count: " + i);
        }
    }
}
public class Code_9 {
    public static void main(String[] args) {
        // Creating three threads
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");
        MyThread t3 = new MyThread("Thread-3");

        // Setting different priorities
        t1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        t2.setPriority(Thread.NORM_PRIORITY); // Priority 5
        t3.setPriority(Thread.MAX_PRIORITY); // Priority 10

        // Starting the threads
        t1.start();
        t2.start();
        t3.start();
    }
}
