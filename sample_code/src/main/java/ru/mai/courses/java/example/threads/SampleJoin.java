package main.java.ru.mai.is.tmp.students.example.threads;

/**
 * Created with IntelliJ IDEA.
 * User: rproj_000
 * Date: 11.04.13
 * Time: 1:08
 * To change this template use File | Settings | File Templates.
 */
public class SampleJoin extends Thread {
    public void run() {
        for(int i=0;i<10000000;i++){

        }
        System.out.println("Hello from a thread!");
    }
    public static void main(String args[]) throws InterruptedException {
        Thread thread = new SampleJoin();
        thread.start();
        thread.join();
        System.out.println("Hello from the main!");
    }
}

