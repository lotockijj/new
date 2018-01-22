package eckel.thread;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class TaskPortion implements Runnable {
	private static int count = 0;
	private final int id = count++;
	private final CountDownLatch latch;
	private static Random r = new Random(47);
	
	public TaskPortion(CountDownLatch latch) {
		this.latch = latch;
	}

	public void run() {
		try {
			doWork();
			latch.countDown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void doWork() throws InterruptedException {
		TimeUnit.MILLISECONDS.sleep(r.nextInt(2000));
		System.out.println(this + " completed.");
	}

	@Override
	public String toString() {
		return String.format("%1$-3d ", id);
	}
	
	

}
