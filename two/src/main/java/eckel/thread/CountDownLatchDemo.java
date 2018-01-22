package eckel.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchDemo {
	private static final int SIZE = 100;
	
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		CountDownLatch latch = new CountDownLatch(SIZE);
		for (int i = 0; i < 10; i++) {
			exec.execute(new WaitingTask(latch));
		}
		for (int i = 0; i < 10; i++) {
			exec.execute(new TaskPortion(latch));
		}
		System.out.println("Lanched all tasks.");
		exec.shutdown();
	}
}
