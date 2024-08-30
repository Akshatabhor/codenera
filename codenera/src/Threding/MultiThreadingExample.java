package Threding;

class NumberPrinter extends Thread
{
    private String threadName;

    NumberPrinter(String name) 
    {
        threadName = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(threadName + ": " + i);
            try {
                Thread.sleep(100);
            } 
            catch (InterruptedException e) 
            {
                System.out.println(threadName + " interrupted.");
            }
        }
    }
}

public class MultiThreadingExample {
    public static void main(String[] args) {
        NumberPrinter thread1 = new NumberPrinter("Thread 1");
        NumberPrinter thread2 = new NumberPrinter("Thread 2");

        thread1.start();
        thread2.start();
    }
}
