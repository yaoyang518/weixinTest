package demo32;

import java.util.HashMap;
import java.util.Map;

public class Demo32 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		final Runtime runtime = Runtime.getRuntime();
		runtime.addShutdownHook(new Thread() {
			@Override
			public void run() {
				super.run();
				StringBuffer sBuffer = new StringBuffer();
				long heapMaxSize = runtime.maxMemory() >> 20;
				sBuffer.append("最大可用内存：" + heapMaxSize + "M\n");
				long total = runtime.totalMemory() >> 20;
				sBuffer.append("总内存大小：" + total + "M\n");
				long free = runtime.freeMemory() >> 20;
				sBuffer.append("空闲内存：" + free + "M");
				System.out.println(sBuffer);
			}
		});

		for (int i = 0; i < 11393217; i++) {
			map.put("key" + i, "value" + i);
		}
	}

}
