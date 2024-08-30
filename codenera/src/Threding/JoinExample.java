package Threding;

class WorkerThread extends Thread {
    private int delay;

    WorkerThread(String name, int delay) {
        super(name);
        this.delay = delay;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is starting.");
        try {
            // Simulate work by sleeping for a given delay
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted.");
        }
        System.out.println(Thread.currentThread().getName() + " has finished.");
    }
}

public class JoinExample {
    public static void main(String[] args) {
        WorkerThread thread1 = new WorkerThread("Thread 1", 2000);
        WorkerThread thread2 = new WorkerThread("Thread 2", 4000);
        WorkerThread thread3 = new WorkerThread("Thread 3", 1000);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            // Wait for thread1 to finish
            thread1.join();
            System.out.println(thread1.getName() + " has completed. Continuing...");

            // Wait for thread2 to finish
            thread2.join();
            System.out.println(thread2.getName() + " has completed. Continuing...");

            // Wait for thread3 to finish
            thread3.join();
            System.out.println(thread3.getName() + " has completed. Continuing...");
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("All threads have finished execution. Main thread exiting.");
    }
}
