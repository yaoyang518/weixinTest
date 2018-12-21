package demo29;

import java.util.Random;

public class Demo30 {

	public static void main(String[] args) {
		Random random = new Random(100);
		for (int i = 0; i < 10; i++) {
			System.out.println(random.nextInt(1000));
		}
	}

}
