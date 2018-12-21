package demo38;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoll {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			final int index = i;
			/*try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}*/
			executorService.execute(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println(Thread.currentThread().getName()+"....."+index);
				}
			});
		}
		executorService.shutdown();
		while(executorService.isTerminated()){
			System.out.println("end");
		}

	}

}
