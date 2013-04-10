package main.java.ru.mai.is.tmp.students.example.threads;

public class SampleRunnable implements Runnable {

	public void run() {

		for (int i = 0; i < 10; i++) {

			System.out.println("test");

			try {

				Thread.sleep(500);

			} catch (InterruptedException e) {

				System.err.println(e);

			}
		}
	}
    public static void main(String[] args) {

        Thread sampleRun= new Thread(new SampleRunnable());

        sampleRun.start();

    }
}
