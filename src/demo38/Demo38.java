package demo38;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo38 {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		for (int i = 0; i < 100; i++) {
			executor.execute(new Runnable() {
				@Override
				public void run() {

				}
			});
		}
		executor.shutdown();
		while (!executor.isTerminated()) {

		}
	}
}
