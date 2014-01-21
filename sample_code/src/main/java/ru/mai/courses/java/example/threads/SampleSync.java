package main.java.ru.mai.is.tmp.students.example.threads;

/**
 * Created with IntelliJ IDEA.
 * User: rproj_000
 * Date: 11.04.13
 * Time: 1:17
 * To change this template use File | Settings | File Templates.
 */
public class SampleSync extends Thread {
    private StringBuilder builder;

    public SampleSync(StringBuilder builder){
        this.builder = builder;
    }

    public void run() {
        builder.append("Hello from a thread!");
    }

    public static void main(String args[]) {
        StringBuilder builder = new StringBuilder();
        Thread thread = new SampleSync(builder);
        thread.start();
        builder.append("Hello from the main!");
    }
}

