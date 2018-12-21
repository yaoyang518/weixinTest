package demo40;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Demo40 {

	public static void main(String[] args) throws InterruptedException, Exception {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future<Integer> future = executorService.submit(new TaxCalculator(100));
		while (!future.isDone()) {
			TimeUnit.MILLISECONDS.sleep(200);
			System.out.print("#");
		}
		System.out.println("\n计算完成，税金是：" + future.get());
		executorService.shutdown();
	}
}

class TaxCalculator implements Callable<Integer> {
	private int seedMoney;

	public TaxCalculator(int seedMoney) {
		super();
		this.seedMoney = seedMoney;
	}

	@Override
	public Integer call() throws Exception {
		TimeUnit.SECONDS.sleep(10);
		return seedMoney / 10;
	}

}
