package demo38;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoll {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		System.out.println(Runtime.getRuntime().availableProcessors());
		for (int i = 0; i < 50; i++) {
			final int index = i;
			executorService.execute(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					try {
						System.out.println(Thread.currentThread().getName() + "...." + index);
						Thread.sleep(2000);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
			});
		}
		executorService.shutdown();

		while (!executorService.isTerminated()) {
		}
	}

}
