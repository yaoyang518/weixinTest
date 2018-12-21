package demo39;

import java.util.concurrent.TimeUnit;

public class Demo39 {

	public static void main(String[] args) throws InterruptedException {
		int value = 1000;
		int loops = 0;
		ThreadGroup tGroup = Thread.currentThread().getThreadGroup();
		while (loops++ < value) {
			UnsafeThread uThread = new UnsafeThread();
			for (int i = 0; i < value; i++) {
				new Thread(uThread).start();
			}
			do {
				TimeUnit.SECONDS.sleep(1);
			} while (tGroup.activeCount() != 1);
			if (uThread.getCount() != value) {
				System.out.println("循环到第" + loops + "遍，出现线程不安全情况");
				System.out.println("此时count=" + uThread.getCount());
				System.exit(0);
			}
		}
	}
}

class UnsafeThread implements Runnable {
	private volatile int count = 0;

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			Math.hypot(Math.pow(92456789, i), Math.cos(i));
		}
		count++;
	}

	public int getCount() {
		return count;
	}

}
