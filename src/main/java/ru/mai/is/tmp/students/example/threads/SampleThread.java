package main.java.ru.mai.is.tmp.students.example.threads;

public class SampleThread extends Thread {

    public void run() {
        for (int i = 0; i < 8; i++) {
            System.out.println("Test");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.err.print(e);
            }
        }
    }
    public static void main(String[] args) {

        Thread sampleThread= new SampleThread();

        sampleThread.start();
    }
}
