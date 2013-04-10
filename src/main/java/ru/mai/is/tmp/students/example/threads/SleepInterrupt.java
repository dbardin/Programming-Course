package main.java.ru.mai.is.tmp.students.example.threads;

public class SleepInterrupt extends Thread {
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            return;
        }
        for (int i = 0; i < 100000000; i++) {

            if (Thread.interrupted()) {
                return;
            }
        }
    }
    public static void main(String args[]) throws InterruptedException {
        Thread thread = new SleepInterrupt();
        thread.start();
    }
}




