package Threding;

class EvenNumberPrinter extends Thread {
    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Even thread interrupted.");
            }
        }
    }
}

class OddNumberPrinter extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 9; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Odd thread interrupted.");
            }
        }
    }
}

public class EvenOddThreads {
    public static void main(String[] args) {
        EvenNumberPrinter evenThread = new EvenNumberPrinter();
        OddNumberPrinter oddThread = new OddNumberPrinter();

        evenThread.start();
        oddThread.start();
    }
}
